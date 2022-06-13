package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

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

    public Integer elsquare() {
        return elsquare;
    }



    private static boolean isValid(Integer a, Integer b){
        return a >= 0 && b >= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        End end = (End) o;
        return Objects.equals(elsquare, end.elsquare) && Objects.equals(ewsquare, end.ewsquare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elsquare, ewsquare);
    }

    @Override
    public String toString() {
        return "x =" + elsquare + "\n" +
                "y=" + ewsquare + "\n";

    }
}
