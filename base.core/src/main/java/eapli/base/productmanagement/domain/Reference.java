package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Reference implements ValueObject {
    private String reference;

    public Reference (String reference){
        if(isValid(reference)){
            this.reference = reference;
        }else{
            throw new IllegalArgumentException("Invalid reference");
        }
    }

    public Reference() {

    }

    public static Reference valueOf(final String value){
        return new Reference(value);
    }

    private boolean isValid(String reference){
        if(true) {
            return true;
        }
        return false;
    }
}
