package eapli.base.productmanagement.dto;


import eapli.base.categorymanagement.domain.Category;
import eapli.framework.representations.dto.DTO;

import java.util.Objects;


@DTO
public class ProductDTO {


    public Category category;
    public String uniqueInternalCode;
    public String barcode;
    public Double basePrice;
    public String brand;
    public String description;
    public String productionCode;
    public String reference;
    public Double volume;
    public Double weight;

    public ProductDTO(Category category, String uniqueInternalCode, String barcode, Double basePrice, String brand, String description, String productionCode, String reference, Double volume, Double weight) {
        this.category  = category;
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
                "Category="+category.getDescription()+"\n"+
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return Objects.equals(uniqueInternalCode, that.uniqueInternalCode) && Objects.equals(barcode, that.barcode) && Objects.equals(basePrice, that.basePrice) && Objects.equals(brand, that.brand) && Objects.equals(description, that.description) && Objects.equals(productionCode, that.productionCode) && Objects.equals(reference, that.reference) && Objects.equals(volume, that.volume) && Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueInternalCode, barcode, basePrice, brand, description, productionCode, reference, volume, weight);
    }
}
