package eapli.base.productmanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.productmanagement.domain.*;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.base.productmanagement.repositories.ProductRepository;

public class AddProductController {


    private final ProductRepository productRepository;
    private final RepositoryFactory repositoryFactory;


    public AddProductController(){

        repositoryFactory = PersistenceContext.repositories();
        productRepository = repositoryFactory.products();
    }

    public Product createProduct(ProductDTO productDTO){
         return productRepository.save(new Product(UniqueInternalCode.valueOf(productDTO.uniqueInternalCode),Barcode.valueOf(productDTO.barcode), BasePrice.valueOf(productDTO.basePrice)
         , Brand.valueOf(productDTO.brand), Description.valueOf(productDTO.description),ProductionCode.valueOf(productDTO.productionCode),Reference.valueOf(productDTO.reference),
                 Volume.valueOf(productDTO.volume),Weight.valueOf(productDTO.weight)));
    }



}
