package eapli.base.questionnairemanagement.domain;



import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class AlphanumericalCode implements ValueObject, Comparable<AlphanumericalCode> {
    private static final Integer SIZE = 15;

    private String id;

    public AlphanumericalCode(String reference){
        if(reference==null)
            throw new IllegalArgumentException("UniqueInternalCode cannot be null");
        if(isValid(reference)){
            this.id = reference;
        }else{
            throw new IllegalArgumentException("Invalid UniqueInternalCode");
        }
    }

    public AlphanumericalCode() {

    }

    public static AlphanumericalCode valueOf(final String value){
        return new AlphanumericalCode(value);
    }

    private boolean isValid(String reference){
        if(reference.length()<=SIZE) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlphanumericalCode id = (AlphanumericalCode) o;
        return Objects.equals(id, id.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public int compareTo(AlphanumericalCode o) {
        return 0;
    }
}
