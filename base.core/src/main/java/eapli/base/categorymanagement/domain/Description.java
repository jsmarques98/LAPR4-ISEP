package eapli.base.categorymanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class Description implements ValueObject {
    private static final Integer MIN_SIZE = 0;
    private static final Integer MAX_SIZE = 250;

    private String description;


    public Description (String description){
        if(isValid(description)){
            this.description = description;
        }else{
            throw new IllegalArgumentException("Invalid description");
        }
    }

    public Description() {
    }

    public static Description valueOf(final String description){
        return new Description(description);
    }

    private boolean isValid(String description){
        return description.length()>MIN_SIZE && description.length()<MAX_SIZE;
    }

    @Override
    public String toString() {
        return description;
    }
}
