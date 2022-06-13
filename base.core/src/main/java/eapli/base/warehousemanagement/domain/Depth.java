package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depth depth = (Depth) o;
        return Objects.equals(dlsquare, depth.dlsquare) && Objects.equals(dwsquare, depth.dwsquare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dlsquare, dwsquare);
    }


    public Integer dwsquare() {
        return dwsquare;
    }
}
