package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class ProductionCode implements ValueObject {
    private static final Integer SIZE = 10;
    private String lettersa;
    private Integer digitsb;

    public ProductionCode (String productionCode){
        if(isValid(productionCode)){
            this.lettersa = productionCode.substring(0,4);
            this.digitsb = Integer.valueOf(productionCode.substring(5,10));
        }else{
            throw new IllegalArgumentException("Invalid production Code");
        }
    }

    public ProductionCode() {

    }

    public static ProductionCode valueOf(final String code){
        return new ProductionCode(code);
    }

    private boolean isValid(String productionCode){
        return productionCode.length()==SIZE && (productionCode.substring(0,4)).matches("[a-z,A-Z]+")
                && productionCode.substring(5,10).matches("[0-9]+") && productionCode.charAt(4)=='.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductionCode that = (ProductionCode) o;
        return Objects.equals(lettersa, that.lettersa) && Objects.equals(digitsb, that.digitsb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lettersa, digitsb);
    }

    @Override
    public String toString() {
        return lettersa+"."+digitsb;
    }
}
