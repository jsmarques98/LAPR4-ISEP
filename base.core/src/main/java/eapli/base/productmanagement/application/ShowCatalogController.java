package eapli.base.productmanagement.application;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.productmanagement.domain.Brand;
import eapli.base.productmanagement.domain.Description;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.repositories.ProductRepository;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShowCatalogController {

    private final ProductRepository productRepository;
    private final RepositoryFactory repositoryFactory;
    private final CategoryRepository categoryRepository;
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public ShowCatalogController(){

        repositoryFactory = PersistenceContext.repositories();
        productRepository = repositoryFactory.products();
        categoryRepository = repositoryFactory.category();
        entityManagerFactory = Persistence.createEntityManagerFactory("eapli.base");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public Iterable<Category> getCategories() {
        Iterable<Category> categories = categoryRepository.findAll();
        return categories;
    }

    public List<Product> getCategoryProducts(Category category) {
        List<Product> categories = productRepository.findByCategory(category);
        return categories;
    }

    public List<Description> getDescriptions() {
        Query query = entityManager.createQuery("select description from Product");
        List<Description> descriptions = query.getResultList();
        return descriptions;
    }

    public List<Product> getDescriptionProducts(Description description) {
        List<Product> descriptions = productRepository.findByDescription(description);
        return descriptions;
    }

    public List<Product> getBrandProducts(Brand brand) {
        List<Product> brands = productRepository.findByBrand(brand);
        return brands;
    }

    public List<Brand> getBrands() {
        Query query = entityManager.createQuery("select brand from Product");
        List<Brand> brands = query.getResultList();
        return brands;
    }

    public Iterable<Product> showProducts() {
        return productRepository.findAll();
    }

}
