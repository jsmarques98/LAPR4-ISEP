package eapli.base.questionnairemanagement.application;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.CategoryID;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.customermanagement.domain.Customer;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;

import eapli.base.productmanagement.domain.Brand;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.base.questionnairemanagement.domain.AlphanumericalCode;
import eapli.base.questionnairemanagement.domain.Description;

import eapli.base.questionnairemanagement.domain.Questionnaire;
import eapli.base.questionnairemanagement.repositories.QuestionnaireRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.time.LocalDate;

import java.util.*;

public class QuestionnaireController {

    private final RepositoryFactory repositoryFactory;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;
    private final QuestionnaireRepository questionnaireRepository;
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;
    private List<Customer> customers;

    public QuestionnaireController() {
        repositoryFactory = PersistenceContext.repositories();
        productRepository = repositoryFactory.products();
        categoryRepository = repositoryFactory.category();
        customerRepository = repositoryFactory.customers();
        questionnaireRepository = repositoryFactory.questionnaire();
        entityManagerFactory = Persistence.createEntityManagerFactory("eapli.base");
        entityManager = entityManagerFactory.createEntityManager();
        customers = new ArrayList<>();
    }

    public boolean createQuestionnaire(String id,String description) {

        if (customers.size() != 0) {
            questionnaireRepository.save(new Questionnaire(AlphanumericalCode.valueOf(id), Description.valueOf(description),customers));
            return true;
        }else {
            System.out.println("Theres no customers corresponding to filters");
            return false;
        }
    }


    public void getCustomerByProduct(String product) {

        try {
            Product product1 = productRepository.findByUniqueInternalCode(eapli.base.productmanagement.domain.UniqueInternalCode.valueOf(product)).get();
            Query query = entityManager.createQuery("SELECT  customer  from CustomerOrder where idOrder in (select customerOrder from OrderItem where product = ?1 )");
            query.setParameter(1, product1);
            customers = query.getResultList();
        } catch (NullPointerException e) {
            System.out.println("There are no customers who bought the indicated product");
        } catch (NoSuchElementException aux) {

        }
    }


    public void getCustomerByBrand(String brand) {
        try {
            Brand brandAux = Brand.valueOf(brand);
            Query query = entityManager.createQuery("SELECT  customer  from CustomerOrder where idOrder in " +
                    "(select customerOrder from  OrderItem where  product in (SELECT uniqueInternalCode from Product where brand=?1))");
            query.setParameter(1, brandAux);
            customers = query.getResultList();

        } catch (NullPointerException e) {
            System.out.println("There are no customers who have purchased products from the indicated brand");

        }
    }

    public void getCustomerByCategory(String category) {

        try {
            Category categoryAux = categoryRepository.findByCategoryID(CategoryID.valueOf(category)).get();
            Query query = entityManager.createQuery("SELECT  customer  from CustomerOrder where idOrder in " +
                    "(select customerOrder from  OrderItem where  product in (SELECT uniqueInternalCode from Product where category=?1))");
            query.setParameter(1, categoryAux);
            customers = query.getResultList();

        } catch (NullPointerException e) {
            System.out.println("There are no customers who have purchased products from the indicated category");
        } catch (NoSuchElementException aux) {
        }
    }

    public void getCostumersByGender(String gender) {
        customers =customerRepository.findByGender(gender);

    }

    public void getCostumersByAge(Integer idade1, Integer idade2) {

        LocalDate dateNow = LocalDate.now();
        LocalDate date = LocalDate.of(dateNow.getYear() - idade2 - 1, dateNow.getMonth(), dateNow.getDayOfMonth());
        LocalDate date1 = LocalDate.of(dateNow.getYear() - idade1, dateNow.getMonth(), dateNow.getDayOfMonth());
        try {
            Query query = entityManager.createQuery("select id from Customer where ?1<=birthDate and birthDate<?2");
            query.setParameter(1, date);
            query.setParameter(2, date1);
            List<Integer> customersId = query.getResultList();
            for (Integer id : customersId)
                customers.add(customerRepository.findByIdCustomer(id).get());
        } catch (NullPointerException e) {
            System.out.println("there are no clients with the indicated age group.");
        }
    }
}
