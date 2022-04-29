package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Warehouse implements AggregateRoot<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Version
    private Long version;

    @Column
    private String name;

    @Column
    private Integer length;

    @Column
    private Integer width;

    @Column
    private Integer Square;

    @Column
    private String unit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Warehouse(){}

    public Warehouse(String name, Integer length, Integer width, Integer square, String unit) {
        this.name = name;
        this.length = length;
        this.width = width;
        Square = square;
        this.unit = unit;
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Long identity() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, name, length, width, Square, unit);
    }
}
