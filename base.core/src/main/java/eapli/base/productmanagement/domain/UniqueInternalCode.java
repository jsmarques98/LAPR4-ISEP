package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class UniqueInternalCode implements ValueObject, Comparable<UniqueInternalCode> {
    private static final Integer SIZE = 10;
    private String letters;
    private Integer digits;

    public UniqueInternalCode (String uniqueInternalCode){
        if(uniqueInternalCode==null)
            throw new IllegalArgumentException("Unique internal code cannot be null");
        if(isValid(uniqueInternalCode)){
            this.letters = uniqueInternalCode.substring(0,4);
            this.digits = Integer.valueOf(uniqueInternalCode.substring(5,10));
        }else{
            throw new IllegalArgumentException("Invalid unique internal code");
        }
    }

    public UniqueInternalCode() {

    }

    public static UniqueInternalCode valueOf(final String uniqueInternalCode){
        return new UniqueInternalCode(uniqueInternalCode);
    }

    private boolean isValid(String uniqueInternalCode){
        return uniqueInternalCode.length()==SIZE && (uniqueInternalCode.substring(0,4)).matches("[a-z,A-Z]+")
                && uniqueInternalCode.substring(5,10).matches("[0-9]+") && uniqueInternalCode.charAt(4)=='.';
    }

    @Override
    public int compareTo(UniqueInternalCode o) {
        return (letters+"."+digits).compareTo(o.letters+"."+o.digits);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueInternalCode that = (UniqueInternalCode) o;
        return Objects.equals(letters, that.letters) && Objects.equals(digits, that.digits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letters, digits);
    }

    @Override
    public String toString() {
        return letters+"."+digits;
    }
}
