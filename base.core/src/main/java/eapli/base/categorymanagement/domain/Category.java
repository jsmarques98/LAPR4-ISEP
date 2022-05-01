package eapli.base.categorymanagement.domain;


import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.validations.Preconditions;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Category implements AggregateRoot<CategoryID> {

    @Version
    private long version;

    @EmbeddedId
    private CategoryID categoryID;

    @Column
    private Description description;


    public Category(){
        //empty constructor
    }

    public Category(CategoryID categoryID, Description description){
        Preconditions.noneNull(categoryID, description);
        this.categoryID = categoryID;
        this.description = description;
    }


    public CategoryID getCategoryID() {
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
    public String toString() {
        return "Category:" +
                "Category ID =" + categoryID + "\n" +
                "Description =" +description + "\n" ;
    }

    @Override
    public CategoryID identity() {
        return this.categoryID;
    }

    @Override
    public boolean equals(Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }
}
