package eapli.base.productmanagement.application;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.productmanagement.domain.*;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.base.productmanagement.repositories.ProductRepository;

public class AddProductController {


    private final ProductRepository productRepository;
    private final RepositoryFactory repositoryFactory;
    private final CategoryRepository categoryRepository;


    public AddProductController(){

        repositoryFactory = PersistenceContext.repositories();
        productRepository = repositoryFactory.products();
        categoryRepository = repositoryFactory.category();
    }

    public Product createProduct(ProductDTO productDTO){
         return productRepository.save(new Product(UniqueInternalCode.valueOf(productDTO.uniqueInternalCode), productDTO.category,Barcode.valueOf(productDTO.barcode), BasePrice.valueOf(productDTO.basePrice)
                  , Brand.valueOf(productDTO.brand), Description.valueOf(productDTO.description),ProductionCode.valueOf(productDTO.productionCode),Reference.valueOf(productDTO.reference),
                          Volume.valueOf(productDTO.volume),Weight.valueOf(productDTO.weight)));
    }

    public Iterable<Category> getCategories(){
        return categoryRepository.findAll();
    }

}
