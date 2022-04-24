package eapli.base.customermanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements ValueObject {

    private String streetName;
    private Integer doorNumber;
    private String postalCode;
    private String city;
    private String country;

    public Address(String streetName, Integer doorNumber, String postalCode, String city, String country) {
        this.streetName = streetName;
        this.doorNumber = doorNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public Address() {

    }

    public static Address valueOf(String streetName, Integer doorNumber, String postalCode, String city, String country) {
        if (isValid(streetName, doorNumber, postalCode, city, country)) {
            return new Address(streetName, doorNumber, postalCode, city, country);
        } else {
            throw new IllegalArgumentException("Address not valid");
        }
    }

    private static boolean isValid(String streetName, Integer doorNumber, String postalCode, String city, String country) {
        if (StringPredicates.isNullOrEmpty(streetName) || StringPredicates.isNullOrEmpty(postalCode) ||
                StringPredicates.isNullOrEmpty(city) || StringPredicates.isNullOrEmpty(country)
                || StringPredicates.isNullOrEmpty(doorNumber.toString())) {
        return false;
        }
        return true;
    }


}
