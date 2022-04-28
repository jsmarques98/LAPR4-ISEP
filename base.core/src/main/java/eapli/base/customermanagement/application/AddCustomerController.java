package eapli.base.customermanagement.application;

import eapli.base.customermanagement.domain.*;
import eapli.base.customermanagement.dto.CustomerDTO;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.framework.general.domain.model.EmailAddress;

public class AddCustomerController {

    private final CustomerRepository costumerRep;
    private final RepositoryFactory repositoryFactory;


    public AddCustomerController() {
        this.repositoryFactory = PersistenceContext.repositories();
        this.costumerRep = repositoryFactory.customers();

    }

    public Customer createCustomer(CustomerDTO customerDTO) {
        return costumerRep.save(new Customer(Address.valueOf(customerDTO.streetName,customerDTO.doorNumber,customerDTO.postalCode,customerDTO.city,customerDTO.country),
                EmailAddress.valueOf(customerDTO.email),Name.valueOf(customerDTO.name),PhoneNumber.valueOf(customerDTO.phoneNumber),VatId.valueOf(customerDTO.vatId),customerDTO.birthDate));

    }
}
