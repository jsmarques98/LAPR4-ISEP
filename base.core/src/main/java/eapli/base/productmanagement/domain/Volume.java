package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class Volume implements ValueObject {
    private static final Double MIN_VOLUME = 0.0;
    private static final Double MAX_VOLUME = 9999.9;

    private Double volume;

    public Volume (Double volume){
        if(isValid(volume)){
            this.volume = volume;
        }else{
            throw new IllegalArgumentException("Invalid Volume");
        }
    }

    public Volume() {

    }


    public static Volume valueOf(final Double value){
        return new Volume(value);
    }

    public Double getVolume() {
        return volume;
    }

    private boolean isValid(Double volume){
        if(volume<MAX_VOLUME && volume>MIN_VOLUME) {
            return true;
        }
        return false;
    }
}
