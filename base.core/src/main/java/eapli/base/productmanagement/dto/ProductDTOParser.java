package eapli.base.productmanagement.dto;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.framework.representations.dto.DTOParser;

import java.util.Optional;

public class ProductDTOParser implements DTOParser<ProductDTO, Product> {

    private final ProductRepository repo = PersistenceContext.repositories().products();

    public ProductDTOParser(){

    }

    @Override
    public Product valueOf(ProductDTO dto) {
        Optional<Product> product = repo.findByUniqueInternalCode(dto.uniqueInternalCode);

        if (!product.isPresent())
            throw new IllegalArgumentException(
                    String.format("There is no Product with this Unique Internal Code : %s", dto.uniqueInternalCode));

        return product.get();
    }
}
