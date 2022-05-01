package eapli.base.categorymanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class CategoryID implements ValueObject, Comparable<CategoryID> {
    private static final Integer MAX_SIZE = 10;
    private static final Integer MIN_SIZE = 0;

    private String categoryID;


    public CategoryID (String categoryID){
        if(categoryID==null)
            throw new IllegalArgumentException("Category id cannot be null");
        if(isValid(categoryID)){
            this.categoryID = categoryID;
        }else{
            throw new IllegalArgumentException("Invalid category id");
        }
    }

    public CategoryID() {

    }

    public static CategoryID valueOf(final String categoryID){
        return new CategoryID(categoryID);
    }

    private boolean isValid(String categoryID){
        return categoryID.length()>MIN_SIZE && categoryID.length()<MAX_SIZE;
    }


    @Override
    public int compareTo(CategoryID o) {
        return categoryID.compareTo(o.categoryID);
    }

    @Override
    public String toString() {
        return categoryID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryID that = (CategoryID) o;
        return Objects.equals(categoryID, that.categoryID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryID);
    }
}
