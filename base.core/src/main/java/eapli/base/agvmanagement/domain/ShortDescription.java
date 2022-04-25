package eapli.base.agvmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class ShortDescription implements ValueObject {
    private static final Integer MIN_SIZE = 0;
    private static final Integer MAX_SIZE = 50;

    private String shortDescription;


    public ShortDescription (String description){
        if (description==null)
            throw new IllegalArgumentException("description cannot be null");
        if(isValid(description)){
            this.shortDescription = description;
        }else{
            throw new IllegalArgumentException("Invalid description");
        }
    }

    public ShortDescription() {
    }

    public static ShortDescription valueOf(final String description){
        return new ShortDescription(description);
    }

    private boolean isValid(String description){
        return description.length()>MIN_SIZE && description.length()<MAX_SIZE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortDescription that = (ShortDescription) o;
        return Objects.equals(shortDescription, that.shortDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortDescription);
    }

    @Override
    public String toString() {
        return shortDescription;
    }
}
