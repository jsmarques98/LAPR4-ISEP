package eapli.base.agvmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Autonomy implements ValueObject {
    private static final Integer MIN_MINUTES = 0;
    private static final Integer MAX_MINUTES = 300;
    private Integer minutes;

    public Autonomy(Integer minutes){
        if(minutes ==null)
            throw new IllegalArgumentException("Autonomy can not be null");

        if (isValid(minutes)) {
            this.minutes = minutes;
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
        return minutes + "squares";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autonomy autonomy = (Autonomy) o;
        return Objects.equals(minutes, autonomy.minutes);
    }

    public Integer maxMinutes() {
        return MAX_MINUTES;
    }

    public Integer minutes() {
        return minutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minutes);
    }

    private boolean isValid(Integer minutes){
        return minutes> MIN_MINUTES && minutes< MAX_MINUTES;
    }
}
