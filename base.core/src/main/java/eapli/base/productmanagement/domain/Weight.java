package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Weight implements ValueObject {
    private static final Double MIN_WEIGHT = 0.0;
    private static final Double MAX_WEIGHT = 9999.9;

    private Double weight;

    public Weight (Double weight){
        if(weight==null)
            throw new IllegalArgumentException("Weight cannot be null");
        if(isValid(weight)){
            this.weight = weight;
        }else{
            throw new IllegalArgumentException("Invalid weight");
        }
    }

    public Weight() {

    }

    public static Weight valueOf(final Double value){
        return new Weight(value);
    }

    public Double weight() {
        return weight;
    }

    private boolean isValid(Double weight){
        return weight < MAX_WEIGHT && weight > MIN_WEIGHT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight1 = (Weight) o;
        return Objects.equals(weight, weight1.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return weight + " g";
    }
}
