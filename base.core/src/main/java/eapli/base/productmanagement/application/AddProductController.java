package eapli.base.productmanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.domain.ProductBuilder;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.base.productmanagement.repositories.ProductRepository;

public class AddProductController {

    private final ProductBuilder productBuilder;
    private final ProductRepository productRepository;
    private final RepositoryFactory repositoryFactory;

    public AddProductController(){
        productBuilder = new ProductBuilder();
        repositoryFactory = PersistenceContext.repositories();
        productRepository = repositoryFactory.products();
    }

    public boolean createProduct(ProductDTO productDTO){
        try{
            productBuilder.addBarcode(productDTO.barcode);
            productBuilder.addProductionCode(productDTO.productionCode);
            productBuilder.addBasePrice(productDTO.basePrice);
            productBuilder.addBrand(productDTO.brand);
            productBuilder.addDescription(productDTO.description);
            productBuilder.addReference(productDTO.reference);
            productBuilder.addVolume(productDTO.volume);
            productBuilder.addWeight(productDTO.weight);
            productBuilder.addUniqueInternalCode(productDTO.uniqueInternalCode);

            return true;

        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()+" caused by "+e.getCause());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }



    public boolean persistProduct() {
        Product product;
        try {
            product = this.productBuilder.build();
            productRepository.save(product);
        } catch (Exception e) {
            System.out.println(e.getMessage()+" caused by "+e.getCause());
            return false;
        }
        return true;
    }

    public ProductDTO showProduct() {
        try {
            return this.productBuilder.build().toDTO();
        } catch (NullPointerException e) {
            return null;
        }
    }

}
