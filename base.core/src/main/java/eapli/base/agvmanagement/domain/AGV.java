package eapli.base.agvmanagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.validations.Preconditions;
import org.springframework.data.annotation.Version;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class AGV implements AggregateRoot<IDAGV> {
    @Version
    private long version;

    @EmbeddedId
    private IDAGV id;

    @Column
    private Autonomy autonomy;

    @Column
    private MaxWeight maxWeight;

    @Column
    private Model model;

    @Column
    private ShortDescription shortDescription;

    public AGV(IDAGV id, Autonomy autonomy, MaxWeight maxWeight, Model model, ShortDescription shortDescription) {
        Preconditions.noneNull(id,autonomy,maxWeight,model,shortDescription);
        this.id = id;
        this.autonomy = autonomy;
        this.maxWeight = maxWeight;
        this.model = model;
        this.shortDescription = shortDescription;
    }

    public AGV(){
        //empty constructor
    }

    public IDAGV getId() {
        return id;
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public IDAGV identity() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        return DomainEntities.areEqual(this,o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, id, autonomy, maxWeight, model, shortDescription);
    }

    @Override
    public String toString() {
        return "AGV:\n" +
                "ID:=" + id + "\n"+
                "Autonomy=" + autonomy +"\n"+
                "Max Weight=" + maxWeight +"\n"+
                "Model=" + model +"\n"+
                "Short Description=" + shortDescription;
    }
}
