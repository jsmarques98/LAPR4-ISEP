package eapli.base.warehousemanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;


@Embeddable
public class RowAisleID implements ValueObject, Comparable<RowAisleID> {
    @Column
    private Integer id;

    @ManyToOne
    private Aisle aisle;

    public RowAisleID(Integer id, Aisle aisle) {
        this.id = id;
        this.aisle = aisle;
    }

    public RowAisleID() {

    }

    public Integer getId() {
        return id;
    }

    public Aisle getAisle() {
        return aisle;
    }

    @Override
    public int compareTo(RowAisleID o) {
        if(this.id == o.id && this.aisle == o.aisle)
            return 0;
        else if(this.id < o.id && this.aisle.identity()<o.aisle.identity()){
            return -1;
        }else if(this.id == o.id && this.aisle.identity()>o.aisle.identity()){
            return 1;
        }else if(this.id == o.id && this.aisle.identity()<o.aisle.identity()){
            return -1;
    }else{
            return 1;
        }
    }
}
