package eapli.base.productmanagement.domain;

import eapli.base.categorymanagement.domain.Category;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.representations.dto.DTOable;
import eapli.framework.validations.Preconditions;
import javax.persistence.*;

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
    private Description description;

    @Column
    private ProductionCode productionCode;

    @Column
    private Reference reference;

    @Column
    private Volume volume;

    @Column
    private Weight weight;

    public Product(){
        // empty constructor
    }

    public Product(final UniqueInternalCode uniqueInternalCode, Category category, Barcode barcode, BasePrice basePrice , Brand brand,
    Description description, ProductionCode productionCode, Reference reference, Volume volume, Weight weight)
    {
        Preconditions.noneNull(category,uniqueInternalCode, barcode, basePrice,brand,description,reference,volume,weight);
        this.category=category;
        this.uniqueInternalCode = uniqueInternalCode;
        this.barcode = barcode;
        this.basePrice  =basePrice;
        this.brand = brand;
        this.description = description;
        this.productionCode = productionCode;
        this.reference = reference;
        this.volume = volume;
        this.weight=weight;
    }

    public Long getVersion() {
        return version;
    }

    public Category getCategory() {
        return category;
    }

    public UniqueInternalCode getUniqueInternalCode() {
        return uniqueInternalCode;
    }

    public Barcode getBarcode() {
        return barcode;
    }

    public BasePrice getBasePrice() {
        return basePrice;
    }

    public Brand getBrand() {
        return brand;
    }

    public Description getDescription() {
        return description;
    }

    public ProductionCode getProductionCode() {
        return productionCode;
    }

    public Reference getReference() {
        return reference;
    }

    public Volume getVolume() {
        return volume;
    }

    public Weight getWeight() {
        return weight;
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
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }


    @Override
    public String toString() {
        return "Product:" +
                "Category=" + category.getDescription() + "\n" +
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
    public ProductDTO toDTO() {
        return new ProductDTO(this.category,this.uniqueInternalCode.toString(),this.barcode.toString(),this.basePrice.getBasePrice(),
                this.brand.toString(), this.description.toString(),this.productionCode.toString(),this.reference.toString()
        , this.volume.getVolume(), this.weight.getWeight());
    }

    @Override
    public UniqueInternalCode identity() {
        return this.uniqueInternalCode;
    }
}
