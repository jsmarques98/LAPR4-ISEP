package eapli.base.categorymanagement.domain;


import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.validations.Preconditions;

import javax.persistence.*;

@Entity
public class Category implements AggregateRoot<MecanographicNumber> {

    @Version
    private long version;

    @EmbeddedId
    private MecanographicNumber categoryID;

    @Column
    private Description description;


    public Category(){
        //empty constructor
    }

    public Category(final MecanographicNumber categoryID, Description description){
        Preconditions.noneNull(categoryID, description);
        this.categoryID = categoryID;
        this.description = description;
    }


    public MecanographicNumber getCategoryID() {
        return categoryID;
    }


    public Description getDescription() {
        return description;
    }


    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public MecanographicNumber identity() {
        return this.categoryID;
    }

    @Override
    public String toString() {
        return "Category:" +
                "Category ID =" + categoryID + "\n" +
                "Description =" +description + "\n" ;
    }

}
