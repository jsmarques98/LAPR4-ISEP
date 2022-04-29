package eapli.base.warehousemanagement.domain;


import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class RowAisle implements AggregateRoot<Integer> {

    @Version
    private Long version;
    @Id
    private Integer id;

    @Id
    @ManyToOne
    private Aisle aisle;

    @Column
    private Begin begin;

    @Column
    private End end;

    @Column
    private Shelve shelve;

    public RowAisle() {
    }

    public RowAisle(Integer id, Aisle aisle, Begin begin, End end, Shelve shelve) {
        this.id = id;
        this.aisle = aisle;
        this.begin = begin;
        this.end = end;
        this.shelve = shelve;
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
        return Objects.hash(version, id, aisle, begin, end, shelve);
    }
}
