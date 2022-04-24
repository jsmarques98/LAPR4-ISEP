package eapli.base.customermanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class PhoneNumber implements ValueObject {

    private String phoneNumber;

    private PhoneNumber(String value) {
        this.phoneNumber = value;
    }

    public PhoneNumber() {

    }

    public static PhoneNumber valueOf(String value) {
        if (isValid(value)) {
            return new PhoneNumber(value);
        } else {
            throw new IllegalArgumentException("Name not valid");
        }
    }

    private static boolean isValid(String value) {
        return  true;
    }
}
