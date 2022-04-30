package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import java.util.Objects;

public class LongDescription implements ValueObject {
    private static final Integer MIN_SIZE = 0;
    private static final Integer MAX_SIZE = 250;

    private String description;

    public LongDescription (String description){
        if(description==null)
            throw new IllegalArgumentException("Long Description cannot be null");
        if(isValid(description)){
            this.description = description;
        }else{
            throw new IllegalArgumentException("Invalid long description");
        }
    }

    public LongDescription() {

    }

    public static LongDescription valueOf(final String description){
        return new LongDescription(description);
    }

    private boolean isValid(String description){
        return description.length()>MIN_SIZE && description.length()<MAX_SIZE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongDescription that = (LongDescription) o;
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
