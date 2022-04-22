package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Reference implements ValueObject {
    private static final Integer SIZE = 10;

    private String reference;

    public Reference (String reference){
        if(reference==null)
            throw new IllegalArgumentException("Reference cannot be null");
        if(isValid(reference)){
            this.reference = reference;
        }else{
            throw new IllegalArgumentException("Invalid reference");
        }
    }

    public Reference() {

    }

    public static Reference valueOf(final String value){
        return new Reference(value);
    }

    private boolean isValid(String reference){
        if(reference.length()==SIZE) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reference reference1 = (Reference) o;
        return Objects.equals(reference, reference1.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference);
    }

    @Override
    public String toString() {
        return reference;
    }
}
