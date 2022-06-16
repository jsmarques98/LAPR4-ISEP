package eapli.base.agvmanagement.domain;


import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Position implements ValueObject {
    private Integer lsquare;
    private Integer wsquare;

    public Position(Integer lsquare, Integer wsquare) {
        this.lsquare = lsquare;
        this.wsquare = wsquare;
    }

    public Position() {
    }

    public Integer lsquare() {
        return lsquare;
    }

    public Integer wsquare() {
        return wsquare;
    }

    public void setLsquare(Integer lsquare) {
        this.lsquare = lsquare;
    }

    public void setWsquare(Integer wsquare) {
        this.wsquare = wsquare;
    }

    public static Position valueOf(Integer lsquare, Integer wsquare) {
        if (isValid(lsquare, wsquare)) {
            return new Position(lsquare, wsquare);
        } else {
            throw new IllegalArgumentException("Invalid Begin");
        }
    }

    private static boolean isValid(Integer a, Integer b) {
        return a >= 0 && b >= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(lsquare, position.lsquare) && Objects.equals(wsquare, position.wsquare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lsquare, wsquare);
    }

    @Override
    public String toString() {
        return "x=" + lsquare  + "y=" + wsquare + "\n";

    }
}
