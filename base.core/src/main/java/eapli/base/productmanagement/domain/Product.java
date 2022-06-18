package eapli.base.productmanagement.domain;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.base.warehousemanagement.domain.RowAisle;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.representations.dto.DTOable;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Product implements AggregateRoot<UniqueInternalCode>, DTOable<ProductDTO> {

    @Version
    private Long version;

    @EmbeddedId
    private UniqueInternalCode uniqueInternalCode;

    @ManyToOne
    private Category category;

    @Column
    private Barcode barcode;

    @Column
    private BasePrice basePrice;

    @Column
    private Brand brand;

    @Column
    private ShortDescription shortDescription;

    @Column
    private TechnicalDescription technicalDescription;

    @Column
    private LongDescription longDescription;

    @Column
    private ProductionCode productionCode;

    @Column
    private Reference reference;

    @Column
    private Volume volume;

    @Column
    private Weight weight;

    @Column
    private Picture picture;

    @OneToOne
    private RowAisle rowAisle;

    public Product(){
        // empty constructor
    }


    public Product(UniqueInternalCode uniqueInternalCode, Category category, Barcode barcode, BasePrice basePrice, Brand brand, ShortDescription shortDescription, ProductionCode productionCode, Reference reference, Volume volume, Weight weight, Picture picture, RowAisle rowAisle, LongDescription longDescription, TechnicalDescription technicalDescription) {

        this.uniqueInternalCode = uniqueInternalCode;
        this.category = category;
        this.barcode = barcode;
        this.basePrice = basePrice;
        this.brand = brand;
        this.shortDescription = shortDescription;
        this.productionCode = productionCode;
        this.reference = reference;
        this.volume = volume;
        this.weight = weight;
        this.picture = picture;
        this.rowAisle = rowAisle;
        this.longDescription = longDescription;
        this.technicalDescription = technicalDescription;
    }


    public Long version() {
        return version;
    }

    public Category category() {
        return category;
    }

    public UniqueInternalCode uniqueInternalCode() {
        return uniqueInternalCode;
    }

    public BasePrice basePrice() {
        return basePrice;
    }

    public Brand brand() {
        return brand;
    }

    public ShortDescription shortDescription() {
        return shortDescription;
    }

    public Reference reference() {
        return reference;
    }


    @Override
    public boolean equals(Object o) {
       return DomainEntities.areEqual( this,o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(version, product.version) && Objects.equals(uniqueInternalCode, product.uniqueInternalCode) && Objects.equals(category, product.category) && Objects.equals(barcode, product.barcode) && Objects.equals(basePrice, product.basePrice) && Objects.equals(brand, product.brand) && Objects.equals(shortDescription, product.shortDescription) && Objects.equals(technicalDescription, product.technicalDescription) && Objects.equals(longDescription, product.longDescription) && Objects.equals(productionCode, product.productionCode) && Objects.equals(reference, product.reference) && Objects.equals(volume, product.volume) && Objects.equals(weight, product.weight) && Objects.equals(picture, product.picture) && Objects.equals(rowAisle, product.rowAisle);

    }

    public RowAisle rowAisle() {
        return rowAisle;
    }

    @Override
    public String toString() {
        return "Product:" +
                "Category=" + category.getDescription() + "\n" +
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
    public ProductDTO toDTO() {
        return new ProductDTO(this.category,this.uniqueInternalCode.toString(),this.barcode.toString(),this.basePrice.basePrice(),
                this.brand.toString(), this.shortDescription.toString(),this.productionCode.toString(),this.reference.toString()
        , this.volume.volume(), this.weight.weight(),this.picture.picturePath(),this.rowAisle.identity().getId(),this.rowAisle.identity().getAisle().getId(),
        this.longDescription.toString(),this.shortDescription.toString());
    }

    @Override
    public UniqueInternalCode identity() {
        return this.uniqueInternalCode;
    }
}
