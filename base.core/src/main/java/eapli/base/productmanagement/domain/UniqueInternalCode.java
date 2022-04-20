package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UniqueInternalCode implements ValueObject, Comparable<UniqueInternalCode> {
    private static final Integer SIZE = 10;
    private String letterss;
    private Integer digitss;

    public UniqueInternalCode (String uniqueInternalCode){
        if(isValid(uniqueInternalCode)){
            this.letterss = uniqueInternalCode.substring(0,3);
            this.digitss = Integer.valueOf(uniqueInternalCode.substring(5,9));
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
//        return uniqueInternalCode.length()==SIZE && uniqueInternalCode.substring(0,3).matches("[a-z,A-Z]+")
//                && uniqueInternalCode.substring(5,9).matches("[0-9]+") && uniqueInternalCode.charAt(4)=='.';
        return true;
    }

    @Override
    public int compareTo(UniqueInternalCode o) {
        return (letterss+"."+digitss).compareTo(o.letterss+"."+o.digitss);
    }
}
