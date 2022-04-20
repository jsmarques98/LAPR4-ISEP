package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class BasePrice implements ValueObject {
    private static final Double MIN_PRICE = 0.0;

    private Double baseprice;

    public BasePrice (Double baseprice){
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
}
