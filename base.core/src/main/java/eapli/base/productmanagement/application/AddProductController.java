package eapli.base.productmanagement.application;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.categorymanagement.repositories.CategoryRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.productmanagement.domain.*;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.base.warehousemanagement.domain.Aisle;
import eapli.base.warehousemanagement.domain.RowAisle;
import eapli.base.warehousemanagement.domain.RowAisleID;
import eapli.base.warehousemanagement.repository.AisleRepository;
import eapli.base.warehousemanagement.repository.RowAisleRepository;

public class AddProductController {


    private final ProductRepository productRepository;
    private final RepositoryFactory repositoryFactory;
    private final CategoryRepository categoryRepository;
    private final RowAisleRepository rowAisleRepository;
    private final AisleRepository aisleRepository;



    public AddProductController(){
        repositoryFactory = PersistenceContext.repositories();
        productRepository = repositoryFactory.products();
        categoryRepository = repositoryFactory.category();
        rowAisleRepository = repositoryFactory.rowAisle();
        aisleRepository = repositoryFactory.aisle();
    }

    public Product createProduct(ProductDTO productDTO){
         return productRepository.save(new Product(UniqueInternalCode.valueOf(productDTO.uniqueInternalCode), productDTO.category,Barcode.valueOf(productDTO.barcode), BasePrice.valueOf(productDTO.basePrice)
                  , Brand.valueOf(productDTO.brand), ShortDescription.valueOf(productDTO.shortDescription),ProductionCode.valueOf(productDTO.productionCode),Reference.valueOf(productDTO.reference),
                          Volume.valueOf(productDTO.volume),Weight.valueOf(productDTO.weight), Picture.valueOf(productDTO.picturePath),getRowAisle(productDTO.rowID, productDTO.aisleID), LongDescription.valueOf(productDTO.longDescription), TechnicalDescription.valueOf(productDTO.technicalDescription)));
    }

    public Iterable<Category> getCategories(){
        return categoryRepository.findAll();
    }

    private RowAisle getRowAisle(Integer rowID, Integer aisleID){
        Aisle aisle = getAisle(aisleID);
        return rowAisleRepository.findById(new RowAisleID(rowID,aisle)).get();
    }

    private Aisle getAisle (Integer aisleID){
       return aisleRepository.findById(aisleID).get();
    }


}
