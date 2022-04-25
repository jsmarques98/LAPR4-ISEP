package eapli.base.agvmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class MaxWeight implements ValueObject {
    private static final Double MAX_WEIGHT = 2000.0;
    private static final Double MIN_WEIGHT =0.0;

    private Double weight;

    public MaxWeight(Double weight) {
        if(weight==null)
            throw new IllegalArgumentException("Max Weight cannot be null");
        if(isValid(weight)) {
            this.weight = weight;
        }else {
            throw new IllegalArgumentException("Invalid Max Weight");
        }
    }

    public MaxWeight() {
        // empty constructor
    }

    public static MaxWeight valueOf(Double weight) {
        return new MaxWeight(weight);
    }

    private boolean isValid(Double weight){
        return weight>MIN_WEIGHT && weight<MAX_WEIGHT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaxWeight maxWeight = (MaxWeight) o;
        return Objects.equals(weight, maxWeight.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return weight +"g";
    }
}
