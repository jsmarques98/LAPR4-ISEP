package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Brand implements ValueObject {
    private static final Integer MIN_CHARS = 0;
    private static final Integer MAX_CHARS = 50;
    private String name;


    public Brand (String name){
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
        if(name.length()>MIN_CHARS && name.length()<MAX_CHARS) {
            return true;
        }
        return false;
    }
}
