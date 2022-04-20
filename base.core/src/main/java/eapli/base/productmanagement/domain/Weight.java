package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class Weight implements ValueObject {
    private static final Double MIN_WEIGHT = 0.0;
    private static final Double MAX_WEIGHT = 9999.9;

    private Double weight;

    public Weight (Double weight){
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

    public Double getWeight() {
        return weight;
    }

    private boolean isValid(Double weight){
        if(weight<MAX_WEIGHT && weight>MIN_WEIGHT) {
            return true;
        }
        return false;
    }
}