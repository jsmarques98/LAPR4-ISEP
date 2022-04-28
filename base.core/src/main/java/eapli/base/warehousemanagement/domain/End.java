package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class End implements ValueObject {
    private Integer elsquare;
    private Integer ewsquare;

    public End(Integer lsquare, Integer wsquare) {
        this.elsquare = lsquare;
        this.ewsquare = wsquare;
    }

    public End() {

    }

    public static End valueOf(Integer lsquare, Integer wsquare){
        if (isValid(lsquare,wsquare)){
            return new End(lsquare,wsquare);
        }else {
            throw new IllegalArgumentException("Invalid End");
        }
    }

    private static boolean isValid(Integer a, Integer b){
        return a >= 0 && b >= 0;
    }
}
