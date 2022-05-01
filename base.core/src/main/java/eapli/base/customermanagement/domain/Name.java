package eapli.base.customermanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Name implements ValueObject {

    private String name;
    private static  final  Integer MAX_VALUE=60;
    private static  final  Integer MIN_VALUE=5;

    private Name(String value) {
        this.name = value;
    }

    public Name() {

    }

    public static Name valueOf(String value) {
        if (isValid(value)) {
            return new Name(value);
        } else {
            throw new IllegalArgumentException("Name not valid");
        }
    }

    private static boolean isValid(String value) {
        if (value.length()>MAX_VALUE||value.length()<MIN_VALUE){
            return false;
        }
        return  true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
