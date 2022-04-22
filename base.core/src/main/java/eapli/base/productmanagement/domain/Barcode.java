package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Barcode implements ValueObject {
    private static final Integer SIZE = 13;
    private Integer gs1Prefix;
    private Integer itemNumber;
    private Integer manufacturerIdNumber;
    private Integer checkDigit;


    public Barcode (String barcode){
        if(barcode==null)
            throw new IllegalArgumentException("Barcode cannot be null");
        if(isValid(barcode)){
            this.gs1Prefix = Integer.valueOf ( barcode.substring(0,2));
            this.manufacturerIdNumber = Integer.valueOf ( barcode.substring(2,7));
            this.itemNumber = Integer.valueOf ( barcode.substring(7,12));
            this.checkDigit = Integer.valueOf(barcode.substring(12));
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barcode barcode = (Barcode) o;
        return Objects.equals(gs1Prefix, barcode.gs1Prefix) && Objects.equals(itemNumber, barcode.itemNumber) && Objects.equals(manufacturerIdNumber, barcode.manufacturerIdNumber) && Objects.equals(checkDigit, barcode.checkDigit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gs1Prefix, itemNumber, manufacturerIdNumber, checkDigit);
    }

    @Override
    public String toString() {
        return gs1Prefix.toString()+manufacturerIdNumber.toString()+itemNumber.toString()+checkDigit.toString();
    }
}
