package eapli.base.customermanagement.domain;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Embeddable
@Table(name = "AdressCostumer")
public class AdressCostumer {


    @NotNull
    private String streetName;

    @NotNull
    private Integer doorNumber;

    @NotNull
    private String postalCode;

    @NotNull
    private String city;

    @NotNull
    private String country;

    public AdressCostumer() {
    }

    public AdressCostumer(String streetName, Integer doorNumber, String postalCode, String city, String country) {
        this.streetName = streetName;
        this.doorNumber = doorNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "AdressCostumer{" +
                "streetName='" + streetName + '\'' +
                ", doorNumber=" + doorNumber +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdressCostumer that = (AdressCostumer) o;
        return Objects.equals(streetName, that.streetName) && Objects.equals(doorNumber, that.doorNumber) && Objects.equals(postalCode, that.postalCode) && Objects.equals(city, that.city) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, doorNumber, postalCode, city, country);
    }
}
