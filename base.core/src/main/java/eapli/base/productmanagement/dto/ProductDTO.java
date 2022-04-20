package eapli.base.productmanagement.dto;


import eapli.framework.representations.dto.DTO;



@DTO
public class ProductDTO {


    public String uniqueInternalCode;
    public String barcode;
    public Double basePrice;
    public String brand;
    public String description;
    public String productionCode;
    public String reference;
    public Double volume;
    public Double weight;

    public ProductDTO(String uniqueInternalCode, String barcode, Double basePrice, String brand, String description, String productionCode, String reference, Double volume, Double weight) {
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

    @Override
    public String toString() {
        return "Product:" +
                "Unique Internal Code=" + uniqueInternalCode + "\n" +
                "Barcode=" + barcode +"\n" +
                "Base Price=" + basePrice +"\n" +
                "Brand=" + brand +"\n" +
                "Description=" + description +"\n" +
                "Production Code=" + productionCode +"\n" +
                "Reference=" + reference +"\n" +
                "Volume=" + volume +"\n" +
                "Weight=" + weight+ "\n" ;
    }
}
