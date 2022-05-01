package eapli.base.customermanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class PhoneNumber implements ValueObject {

    private static int MAX_VALUE=13;
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
            throw new IllegalArgumentException("PhoneNumber not valid");
        }
    }

    private static boolean isValid(String value) {
        if (value.length() > MAX_VALUE)
            return false;

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }
}
