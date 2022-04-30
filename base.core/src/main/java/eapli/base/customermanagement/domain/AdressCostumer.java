package eapli.base.customermanagement.domain;


import com.sun.istack.NotNull;

import javax.persistence.*;

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
}
