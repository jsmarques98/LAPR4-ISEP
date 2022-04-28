package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class Depth implements ValueObject {
    private Integer dlsquare;
    private Integer dwsquare;

    public Depth(Integer lsquare, Integer wsquare) {
        this.dlsquare = lsquare;
        this.dwsquare = wsquare;
    }

    public Depth() {

    }

    public static Depth valueOf(Integer lsquare, Integer wsquare){
        if (isValid(lsquare,wsquare)){
            return new Depth(lsquare,wsquare);
        }else {
            throw new IllegalArgumentException("Invalid Depth");
        }
    }

    private static boolean isValid(Integer a, Integer b){
        return a >= 0 && b >= 0;
    }
}
