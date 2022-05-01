package eapli.base.customermanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.util.Objects;

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
            throw new IllegalArgumentException("vatId not valid");
        }
    }

    private static boolean isValid(String value) {
        return  !StringPredicates.isNullOrEmpty(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VatId vatId1 = (VatId) o;
        return Objects.equals(vatId, vatId1.vatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vatId);
    }
}
