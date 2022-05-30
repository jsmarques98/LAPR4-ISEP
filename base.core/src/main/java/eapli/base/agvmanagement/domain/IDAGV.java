package eapli.base.agvmanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.util.Objects;


@Embeddable
public class IDAGV implements ValueObject, Comparable<IDAGV> {

    private String idAGV;
    private static final Integer MAX_CHARARTERS = 8;

    public IDAGV(String value) {
        if (isValid(value)) {
            this.idAGV = value;
        } else {
            throw new IllegalArgumentException("idAGV not valid");
        }
    }

    public IDAGV() {
    }

    public static IDAGV valueOf(String value) {
        return new IDAGV(value);
    }

    private static boolean isValid(String value) {
        if (StringPredicates.isNullOrEmpty(value) || value.length() > MAX_CHARARTERS) {
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IDAGV idagv = (IDAGV) o;
        return Objects.equals(idAGV, idagv.idAGV);
    }

    @Override
    public String toString() {
        return idAGV;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAGV);
    }

    @Override
    public int compareTo(IDAGV o) {
        return 0;
    }


}