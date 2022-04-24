package eapli.base.customermanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class VatId implements ValueObject {

    private String vatId;

    private VatId(String value) {
        this.vatId = value;
    }

    public VatId() {

    }

    public static VatId valueOf(String value) {
        if (isValid(value)) {
            return new VatId(value);
        } else {
            throw new IllegalArgumentException("VaitId not valid");
        }
    }

    private static boolean isValid(String value) {
        return  true;
    }
}
