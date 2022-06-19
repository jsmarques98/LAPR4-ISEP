package eapli.base.questionnairemanagement.application;

import eapli.base.answerQuestionnairemanagement.repositories.AnswerQuestionaireRepository;
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
import eapli.base.questionnairemanagement.validation.LabeledExprLexer;
import eapli.base.questionnairemanagement.validation.LabeledExprParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.persistence.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

import java.util.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class QuestionnaireController {

    private final RepositoryFactory repositoryFactory;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;
    private final AnswerQuestionaireRepository answerQuestionaireRepository;
    private final QuestionnaireRepository questionnaireRepository;
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;
    private Set<Customer> customers;

    public QuestionnaireController() {
        repositoryFactory = PersistenceContext.repositories();
        productRepository = repositoryFactory.products();
        categoryRepository = repositoryFactory.category();
        customerRepository = repositoryFactory.customers();
        questionnaireRepository = repositoryFactory.questionnaire();
        answerQuestionaireRepository = repositoryFactory.answerQuestionaire();
        entityManagerFactory = Persistence.createEntityManagerFactory("eapli.base");
        entityManager = entityManagerFactory.createEntityManager();
        customers = new HashSet<>();
    }

    public boolean createQuestionnaire(String id, String description, String title, List<String> section,Map<String, List<String>>  question, String welcomeM, String finalM) throws IOException {
        if (customers.size() != 0) {
            createTXTFile(id, title, section, question, welcomeM, finalM);
            if (validateQuestionnaire(title)) {

                String aux = createStringToTXTFile("test");
                Questionnaire questionnaire = new Questionnaire(AlphanumericalCode.valueOf(id), Description.valueOf(description), aux);
                for (Customer c : customers) {
                    questionnaire.addCustomer(c);
                }
                questionnaireRepository.save(questionnaire);


                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private String createStringToTXTFile(String title) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("base.core/src/main/java/eapli/base/questionnairemanagement/flieTXT/" + title + ".txt"));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        try {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }

    public void createQuestionnaireByTxtFile(String filename, AlphanumericalCode alphanumericalCode, Description description, List<Customer> customers) throws IOException {
        Path fileName = Path.of(filename);

        String str = Files.readString(fileName);

        Questionnaire questionnaire = new Questionnaire(alphanumericalCode, description, str);
        for (Customer c : customers) {
            questionnaire.addCustomer(c);
        }
        questionnaireRepository.save(questionnaire);

    }


    public void createTXTFile(String id, String title, List<String> section, Map<String, List<String>> question, String welcomeM, String finalM) throws
            IOException {

        //eliminar o ficheiro se ja existir
        Path of = Path.of("base.core/src/main/java/eapli/base/questionnairemanagement/flieTXT/" + title + ".txt");
        if (Files.exists(of)) {
            Files.delete(of);
        }

        PrintWriter writer = new PrintWriter("base.core/src/main/java/eapli/base/questionnairemanagement/flieTXT/" + title + ".txt", "UTF-8");

        writer.println("ID: " + id);

        writer.println("Title: " + title);

        if (welcomeM != null) {
            writer.println("Welcome Message: " + welcomeM);
        }

        for (int i = 0; i < section.size(); i = i + 5) {
            writer.println("\nSection ID: " + section.get(i));
            writer.println("Section Title: " + section.get(1 + i));

            if (section.get(2 + i) != null) {
                writer.println("Section Description: " + section.get(2 + i));
            }

            writer.println("Section Obligatoriness: " + section.get(3 + i));

            if (section.get(4 + i) != null) {
                writer.println("Section Repeatability: " + section.get(4 + i));
            }
            writer.println();
            List<String> questionList = question.get(section.get(i));


            for (int j = 0; j < questionList.size(); j = j + 6) {
                writer.println("Question ID: " + questionList.get(j));
                writer.println("Question Text: " + questionList.get(1 + j));

                if (questionList.get(j + 2) != null) {
                    writer.println("Instruction: " + questionList.get(j + 2));
                }

                writer.println("Type: " + questionList.get(j + 3));
                writer.println("Question Obligatoriness: " + questionList.get(j + 4));
                writer.println("Extra Info: " + questionList.get(j + 5) + "\n");
            }
        }

        if (finalM != null) {
            writer.println("\nFinal Message: " + finalM);
        }

        writer.close();
    }

    public static boolean validateQuestionnaire(String string) throws RecognitionException {
        try {
            String source = "base.core/src/main/java/eapli/base/questionnairemanagement/flieTXT/" + string + ".txt";
            CharStream cs = fromFileName(source);
            LabeledExprLexer lexer = new LabeledExprLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            LabeledExprParser parser = new LabeledExprParser(token);
            ParseTree tree = parser.prog();
            return parser.Flag();
        } catch (RecognitionException | IOException e) {

            return false;
        }
    }


    public void getCustomerByProduct(String product) {

        try {
            Product product1 = productRepository.findByUniqueInternalCode(eapli.base.productmanagement.domain.UniqueInternalCode.valueOf(product)).get();
            Query query = entityManager.createQuery("SELECT  customer  from CustomerOrder where idOrder in (select customerOrder from OrderItem where product = ?1 )");
            query.setParameter(1, product1);
            customers = new HashSet<Customer>(query.getResultList());
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
            customers = new HashSet<Customer>(query.getResultList());

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
            customers = new HashSet<Customer>(query.getResultList());


        } catch (NullPointerException e) {
            System.out.println("There are no customers who have purchased products from the indicated category");
        } catch (NoSuchElementException aux) {
        }
    }

    public void getCostumersByGender(String gender) {
        customers = new HashSet<Customer>(customerRepository.findByGender(gender));
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
