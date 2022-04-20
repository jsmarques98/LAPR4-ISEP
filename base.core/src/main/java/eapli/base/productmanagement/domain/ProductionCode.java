package eapli.base.productmanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class ProductionCode implements ValueObject {
    private static final Integer SIZE = 10;
    private String lettersa;
    private Integer digitsb;

    public ProductionCode (String productionCode){
        if(isValid(productionCode)){
            this.lettersa = productionCode.substring(0,3);
            this.digitsb = Integer.valueOf(productionCode.substring(5,9));
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
        return productionCode.length()==SIZE && (productionCode.substring(0,3)).matches("[a-z,A-Z]+")
                && productionCode.substring(5,9).matches("[0-9]+") && productionCode.charAt(4)=='.';
    }
}
