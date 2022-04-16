package eapli.base.productmanagement.domain;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.productmanagement.dto.ProductDTO;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.domain.model.DomainEntity;
import eapli.framework.representations.dto.DTOable;
import eapli.framework.validations.Preconditions;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Product implements AggregateRoot<MecanographicNumber>, DTOable<ProductDTO> {

    @Version
    private Long version;

    @Id
    private MecanographicNumber uniqueInternalCode;

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

    public Product(final MecanographicNumber uniqueInternalCode, Barcode barcode, BasePrice basePrice , Brand brand,
    Description description, ProductionCode productionCode, Reference reference, Volume volume, Weight weight)
    {
        Preconditions.noneNull(uniqueInternalCode, barcode, basePrice,brand,description,reference,volume,weight);
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

    public MecanographicNumber getUniqueInternalCode() {
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
    public MecanographicNumber identity() {
        return this.uniqueInternalCode;
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

    @Override
    public ProductDTO toDTO() {
        return new ProductDTO(this.uniqueInternalCode,this.barcode.toString(),this.basePrice.toString(),
                this.brand.toString(), this.description.toString(),this.productionCode.toString(),this.reference.toString()
        , this.volume.toString(), this.weight.toString());
    }
}
