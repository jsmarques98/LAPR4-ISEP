package eapli.base.productmanagement.dto;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.productmanagement.domain.*;
import eapli.framework.representations.dto.DTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Version;

@DTO
public class ProductDTO {


    public MecanographicNumber uniqueInternalCode;
    public String barcode;
    public String basePrice;
    public String brand;
    public String description;
    public String productionCode;
    public String reference;
    public String volume;
    public String weight;

    public ProductDTO(MecanographicNumber uniqueInternalCode, String barcode, String basePrice, String brand, String description, String productionCode, String reference, String volume, String weight) {
        this.uniqueInternalCode = uniqueInternalCode;
        this.barcode = barcode;
        this.basePrice = basePrice;
        this.brand = brand;
        this.description = description;
        this.productionCode = productionCode;
        this.reference = reference;
        this.volume = volume;
        this.weight = weight;
    }

}
