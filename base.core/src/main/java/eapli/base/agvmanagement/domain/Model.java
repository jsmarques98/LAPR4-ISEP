package eapli.base.agvmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Model implements ValueObject {

    private static final Integer MIN_SIZE = 0;
    private static final Integer MAX_SIZE = 50;

    private String description;


    public Model (String description){
        if (description==null)
            throw new IllegalArgumentException("Model cannot be null");
        if(isValid(description)){
            this.description = description;
        }else{
            throw new IllegalArgumentException("Invalid Model");
        }
    }

    public Model() {
    }

    public static Model valueOf(final String description){
        return new Model(description);
    }

    private boolean isValid(String description){
        return description.length()>MIN_SIZE && description.length()<MAX_SIZE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(description, model.description);
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
