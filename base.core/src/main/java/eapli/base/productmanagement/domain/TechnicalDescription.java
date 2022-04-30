package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import java.util.Objects;

public class TechnicalDescription implements ValueObject {
    private static final Integer MIN_SIZE = 0;
    private static final Integer MAX_SIZE = 100;

    private String description;

    public TechnicalDescription (String description){
        if(description==null)
            throw new IllegalArgumentException("Technical Description cannot be null");
        if(isValid(description)){
            this.description = description;
        }else{
            throw new IllegalArgumentException("Invalid technical long description");
        }
    }

    public TechnicalDescription() {

    }

    public static TechnicalDescription valueOf(final String description){
        return new TechnicalDescription(description);
    }

    private boolean isValid(String description){
        return description.length()>MIN_SIZE && description.length()<MAX_SIZE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechnicalDescription that = (TechnicalDescription) o;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return description;
    }
}
