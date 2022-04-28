package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import org.hibernate.mapping.ToOne;

import javax.persistence.*;
import java.util.List;

@Entity
public class AGVDock implements AggregateRoot<String> {

    @Version
    private Long version;

    @Id
    private String id;
    @ManyToOne
    private Warehouse warehouse;
    @Column
    private Begin begin;
    @Column
    private End end;
    @Column
    private Depth depth;
    @Column
    private String accessibilityA;


    public AGVDock() {
    }

    public AGVDock(String id, Begin begin, End end, Depth depth, String accessibility, Warehouse warehouse) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.depth = depth;
        this.accessibilityA = accessibility;
        this.warehouse = warehouse;
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }


    @Override
    public String identity() {
        return this.id;
    }
}
