package eapli.base.customermanagement.dto;

import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.productmanagement.domain.Product;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.base.productmanagement.repositories.ProductRepository;
import eapli.framework.representations.dto.DTOParser;

import java.util.Optional;

public class CustomerDTOParser implements DTOParser<eapli.base.productmanagement.dto.ProductDTO, Product> {

    private final CustomerRepository repo = PersistenceContext.repositories().customers();

    public CustomerDTOParser() {

    }

    @Override
    public Product valueOf(ProductDTO dto) {

        //Optional<Product> product = repo.;

        //    if (!product.isPresent())
        //    throw new IllegalArgumentException(
        //          String.format("There is no Product with this Unique Internal Code : %s", dto.uniqueInternalCode));

        // return product.get();
        return new Product();
    }
}
