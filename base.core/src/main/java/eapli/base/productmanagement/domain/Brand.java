package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Brand implements ValueObject {
    private static final Integer MIN_CHARS = 0;
    private static final Integer MAX_CHARS = 50;

    private String name;

    public Brand (String name){
        if(name==null)
            throw new IllegalArgumentException("Brand cannot be null");
        if(isValid(name)){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Invalid brand");
        }
    }

    public Brand() {

    }

    public static Brand valueOf(final String name){
        return new Brand(name);
    }

    private boolean isValid(String name){
        return name.length() > MIN_CHARS && name.length() < MAX_CHARS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return Objects.equals(name, brand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
