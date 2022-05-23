package eapli.base.questionnairemanagement.domain;
import eapli.framework.domain.model.ValueObject;
import java.util.Objects;

public class Description implements ValueObject {
    private static final Integer MIN_SIZE = 0;
    private static final Integer MAX_SIZE = 40;

    private String description;

    public Description(String description) {
        if (description == null)
            throw new IllegalArgumentException("Long Description cannot be null");
        if (isValid(description)) {
            this.description = description;
        } else {
            throw new IllegalArgumentException("Invalid long description");
        }
    }

    public Description() {

    }

    public static Description valueOf(final String description) {
        return new Description(description);
    }

    private boolean isValid(String description) {
        return description.length() > MIN_SIZE && description.length() < MAX_SIZE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Description that = (Description) o;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return description;
    }
}
