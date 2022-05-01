package eapli.base.customermanagement.application;

import eapli.base.customermanagement.domain.*;
import eapli.base.customermanagement.dto.CustomerDTO;
import eapli.base.customermanagement.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.io.util.Console;

import java.util.ArrayList;
import java.util.List;

public class AddCustomerController {

    private final CustomerRepository costumerRep;
    private final RepositoryFactory repositoryFactory;


    public AddCustomerController() {
        this.repositoryFactory = PersistenceContext.repositories();
        this.costumerRep = repositoryFactory.customers();

    }


    public Customer createCustomer(CustomerDTO customerDTO) {
        List<AdressCostumer> addressList = new ArrayList<>();
        List<String> address = customerDTO.address;
        for (int i = 0; i < address.size(); i += 5) {
            String streetName = address.get(i);
            Integer doorNumber = Integer.parseInt(address.get(i + 1));
            String postalCode = address.get(i + 2);
            String city = address.get(i + 3);
            String country = address.get(i + 4);
            addressList.add(new AdressCostumer(streetName, doorNumber, postalCode, city, country));
        }
        return costumerRep.save(new Customer(EmailAddress.valueOf(customerDTO.email), Name.valueOf(customerDTO.name),
                PhoneNumber.valueOf(customerDTO.phoneNumber), VatId.valueOf(customerDTO.vatId), customerDTO.birthDate, addressList,customerDTO.gender));

    }
}
