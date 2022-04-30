package eapli.base.productmanagement.dto;


import eapli.base.categorymanagement.domain.Category;
import eapli.framework.representations.dto.DTO;

import java.util.List;
import java.util.Objects;


@DTO
public class ProductDTO {


    public Category category;
    public String uniqueInternalCode;
    public String barcode;
    public Double basePrice;
    public String brand;
    public String shortDescription;
    public String productionCode;
    public String reference;
    public Double volume;
    public Double weight;
    public String picturePath;
    public Integer rowID;
    public Integer aisleID;
    public String longDescription;
    public String technicalDescription;

    public ProductDTO(Category category, String uniqueInternalCode, String barcode, Double basePrice, String brand, String shortDescription, String productionCode, String reference, Double volume, Double weight, String picturePath,Integer rowID, Integer aisleID,String longDescription, String technicalDescription) {
        this.category  = category;
        this.uniqueInternalCode = uniqueInternalCode;
        this.barcode = barcode;
        this.basePrice = basePrice;
        this.brand = brand;
        this.shortDescription = shortDescription;
        this.productionCode = productionCode;
        this.reference = reference;
        this.volume = volume;
        this.weight = weight;
        this.picturePath = picturePath;
        this.rowID = rowID;
        this.aisleID = aisleID;
        this.longDescription=longDescription;
        this.technicalDescription=technicalDescription;
    }

    @Override
    public String toString() {
        return "Product:" +
                "Category="+category.getDescription()+"\n"+
                "Unique Internal Code=" + uniqueInternalCode + "\n" +
                "Barcode=" + barcode +"\n" +
                "Base Price=" + basePrice +"\n" +
                "Brand=" + brand +"\n" +
                "Short Description=" + shortDescription +"\n" +
                "Long Description=" + longDescription +"\n" +
                "Technical Description=" + technicalDescription +"\n" +
                "Production Code=" + productionCode +"\n" +
                "Reference=" + reference +"\n" +
                "Volume=" + volume +"\n" +
                "Weight=" + weight+ "\n" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return Objects.equals(category, that.category) && Objects.equals(uniqueInternalCode, that.uniqueInternalCode) && Objects.equals(barcode, that.barcode) && Objects.equals(basePrice, that.basePrice) && Objects.equals(brand, that.brand) && Objects.equals(shortDescription, that.shortDescription) && Objects.equals(productionCode, that.productionCode) && Objects.equals(reference, that.reference) && Objects.equals(volume, that.volume) && Objects.equals(weight, that.weight) && Objects.equals(picturePath, that.picturePath) && Objects.equals(rowID, that.rowID) && Objects.equals(aisleID, that.aisleID) && Objects.equals(longDescription, that.longDescription) && Objects.equals(technicalDescription, that.technicalDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, uniqueInternalCode, barcode, basePrice, brand, shortDescription, productionCode, reference, volume, weight, picturePath, rowID, aisleID, longDescription, technicalDescription);
    }
}
