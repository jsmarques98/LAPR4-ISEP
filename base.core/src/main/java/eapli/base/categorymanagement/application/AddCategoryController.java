package eapli.base.categorymanagement.application;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.domain.Description;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;


public class AddCategoryController {


    private final CategoryRepository categoryRepository;
    private final RepositoryFactory repositoryFactory;


    public AddCategoryController(){

        repositoryFactory = PersistenceContext.repositories();
        categoryRepository = repositoryFactory.category();
    }

    public Category createCategory(Category category){
        return categoryRepository.save(new Category(MecanographicNumber.valueOf(String.valueOf(category.getCategoryID())),
                Description.valueOf(String.valueOf(category.getCategoryID()))));
    }

}