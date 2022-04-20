package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class Barcode implements ValueObject {
    private static final Integer SIZE = 13;
    private Integer gs1Prefix;
    private Integer itemNumber;
    private Integer manufacturerIdNumber;
    private Integer checkDigit;


    public Barcode (String barcode){
        if(isValid(barcode)){
            this.gs1Prefix = Integer.valueOf ( barcode.substring(0,1));
            this.manufacturerIdNumber = Integer.valueOf ( barcode.substring(2,6));
            this.itemNumber = Integer.valueOf ( barcode.substring(7,11));
            this.checkDigit = (int) barcode.charAt(12);
        }else{
            throw new IllegalArgumentException("Invalid barcode");
        }
    }

    public Barcode() {

    }

    public static Barcode valueOf(final String value){
        return new Barcode(value);
    }

    private boolean isValid(String barcode){
        return barcode.matches("[0-9]+") && barcode.length()==SIZE;
    }
}
