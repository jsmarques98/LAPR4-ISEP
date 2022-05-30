package eapli.base.agvmanagement.domain;

import eapli.base.warehousemanagement.domain.AGVDock;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.validations.Preconditions;
import org.springframework.data.annotation.Version;

import javax.persistence.*;
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

    @Enumerated
    private CurrentTask currentTask;

    @OneToOne
    private AGVDock agvDock;

    public AGV(IDAGV id, Autonomy autonomy, MaxWeight maxWeight, Model model, ShortDescription shortDescription,AGVDock agvDock) {
        Preconditions.noneNull(id,autonomy,maxWeight,model,shortDescription,agvDock);
        this.id = id;
        this.autonomy = autonomy;
        this.maxWeight = maxWeight;
        this.model = model;
        this.shortDescription = shortDescription;
        this.currentTask = CurrentTask.FREE;
        this.agvDock=agvDock;
    }

    public AGV(){
        //empty constructor
    }

    public IDAGV id() {
        return id;
    }

    public AGVDock agvDock() {
        return agvDock;
    }

    public CurrentTask currentTask() {
        return currentTask;
    }

    public MaxWeight maxWeight() {
        return maxWeight;
    }

    public void changeCurrentTask(CurrentTask currentTask) {
        this.currentTask = currentTask;
    }

    @Override
    public boolean sameAs(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AGV agv = (AGV) o;
        return version == agv.version && Objects.equals(id, agv.id) && Objects.equals(autonomy, agv.autonomy) && Objects.equals(maxWeight, agv.maxWeight) && Objects.equals(model, agv.model) && Objects.equals(shortDescription, agv.shortDescription) && currentTask == agv.currentTask && Objects.equals(agvDock, agv.agvDock);
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
        return Objects.hash(version, id, autonomy, maxWeight, model, shortDescription,agvDock);
    }

    @Override
    public String toString() {
        return "AGV:\n" +
                "ID:=" + id + "\n"+
                "Autonomy=" + autonomy +"\n"+
                "Max Weight=" + maxWeight +"\n"+
                "Model=" + model +"\n"+
                "Short Description=" + shortDescription +"\n"+
                "AGV Dock Location=" + agvDock;
    }


}
