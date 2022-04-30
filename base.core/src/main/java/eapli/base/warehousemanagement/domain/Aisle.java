package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Aisle implements AggregateRoot<Integer> {

    @Version
    private Long version;

    @Id
    private Integer id;

    @ManyToOne
    private Warehouse warehouse;

    @Column
    private Begin begin;

    @Column
    private End end;

    @Column
    private Depth depth;

    @Column
    private String accessibilityR;

    public Aisle() {
    }

    public Aisle(Integer id, Begin begin, End end, Depth depth, String accessibility,Warehouse warehouse) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.depth = depth;
        this.accessibilityR = accessibility;
        this.warehouse = warehouse;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Integer identity() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, id, warehouse, begin, end, depth, accessibilityR);
    }
}
