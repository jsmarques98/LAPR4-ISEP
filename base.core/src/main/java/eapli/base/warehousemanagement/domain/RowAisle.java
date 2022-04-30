package eapli.base.warehousemanagement.domain;


import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class RowAisle implements AggregateRoot<RowAisleID>, Serializable {

    @Version
    private Long version;

    @Id
    private RowAisleID id;

    @Column
    private Begin begin;

    @Column
    private End end;

    @Column
    private Shelve shelve;

    public RowAisle() {
    }

    public RowAisle(Integer id, Aisle aisle, Begin begin, End end, Shelve shelve) {
        this.id = new RowAisleID(id,aisle);
        this.begin = begin;
        this.end = end;
        this.shelve = shelve;
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public RowAisleID identity() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        return DomainEntities.areEqual(this, o);
    }



    @Override
    public int hashCode() {
        return Objects.hash(version, id, begin, end, shelve);
    }
}
