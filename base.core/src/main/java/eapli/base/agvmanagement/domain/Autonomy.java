package eapli.base.agvmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Autonomy implements ValueObject {
    private static final Integer MIN_SQUARES = 0;
    private static final Integer MAX_SQUARES = 300;
    private Integer squares;

    public Autonomy(Integer squares){
        if(squares ==null)
            throw new IllegalArgumentException("Autonomy can not be null");

        if (isValid(squares)) {
            this.squares = squares;
        }else{
            throw new IllegalArgumentException("Invalid Autonomy");
        }
    }

    public Autonomy() {
        // empty constructor
    }


    public static Autonomy valueOf(Integer minutes) {
        return new Autonomy(minutes);
    }

    @Override
    public String toString() {
        return squares + "squares";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autonomy autonomy = (Autonomy) o;
        return Objects.equals(squares, autonomy.squares);
    }

    public Integer maxSquares() {
        return MAX_SQUARES;
    }

    public Integer squares() {
        return squares;
    }

    @Override
    public int hashCode() {
        return Objects.hash(squares);
    }

    private boolean isValid(Integer minutes){
        return minutes> MIN_SQUARES && minutes< MAX_SQUARES;
    }
}
