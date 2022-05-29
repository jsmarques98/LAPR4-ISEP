package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Begin implements ValueObject {
    private Integer blsquare;
    private Integer bwsquare;

    public Begin(Integer lsquare, Integer wsquare) {
        this.blsquare = lsquare;
        this.bwsquare = wsquare;
    }

    public Begin() {

    }

    public static Begin valueOf(Integer lsquare, Integer wsquare){
        if (isValid(lsquare,wsquare)){
            return new Begin(lsquare,wsquare);
        }else {
            throw new IllegalArgumentException("Invalid Begin");
        }
    }

    private static boolean isValid(Integer a, Integer b){
        return a >= 0 && b >= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Begin begin = (Begin) o;
        return Objects.equals(blsquare, begin.blsquare) && Objects.equals(bwsquare, begin.bwsquare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blsquare, bwsquare);
    }

    @Override
    public String toString() {
        return "x=" + blsquare + "\n" + "y=" + bwsquare + "\n";

    }
}
