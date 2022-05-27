package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Volume implements ValueObject {
    private static final Double MIN_VOLUME = 0.0;
    private static final Double MAX_VOLUME = 9999.9;

    private Double volume;

    public Volume (Double volume){
        if(volume==null)
            throw new IllegalArgumentException("Volume cannot be null");
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

    public Double volume() {
        return volume;
    }

    private boolean isValid(Double volume){
        return volume < MAX_VOLUME && volume > MIN_VOLUME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume1 = (Volume) o;
        return Objects.equals(volume, volume1.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }

    @Override
    public String toString() {
        return volume + " mm^3";
    }
}
