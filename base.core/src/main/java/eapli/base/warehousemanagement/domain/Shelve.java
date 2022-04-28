package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

import javax.persistence.Id;

@Embeddable
public class Shelve implements ValueObject {

    private Integer numberShelve;

    public Shelve() {
    }

    public Shelve(Integer id) {
        this.numberShelve = id;
    }

    public static Shelve valueOf(String s) {
        if (isValid(Integer.parseInt(s))) {
            return new Shelve(Integer.parseInt(s));
        }else{
            throw new IllegalArgumentException("Invalid Shelve");
        }
    }

    private static boolean isValid(Integer s){
        return s >= 0;
    }
}
