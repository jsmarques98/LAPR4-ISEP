package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class BasePrice implements ValueObject {
    private static final Double MIN_PRICE = 0.0;

    private Double baseprice;

    public BasePrice (Double baseprice){
        if(baseprice==null)
            throw new IllegalArgumentException("Base price cannot be null");
        if(isValid(baseprice)){
            this.baseprice = baseprice;
        }else{
            throw new IllegalArgumentException("Invalid base price");
        }
    }
    public BasePrice(){

    }

    public static BasePrice valueOf(final Double value){
        return new BasePrice(value);
    }

    public Double getBasePrice() {
        return baseprice;
    }

    private boolean isValid(Double baseprice){
        if(baseprice>= MIN_PRICE) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasePrice basePrice = (BasePrice) o;
        return Objects.equals(baseprice, basePrice.baseprice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseprice);
    }

    @Override
    public String toString() {
        return baseprice.toString() + " €";
    }

    public int compareTo(BasePrice other) {
        return this.baseprice.compareTo(other.baseprice);
    }
}
