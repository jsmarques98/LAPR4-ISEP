package eapli.base.customermanagement.dto;

import eapli.framework.representations.dto.DTO;

import java.util.Date;

@DTO
public class CustomerDTO {



    public String name;
    public String email;
    public String streetName;
    public Integer doorNumber;
    public String postalCode;
    public String city;
    public String country;
    public  String gender;
    public Date birthDate;
    public  String phoneNumber;
    public String vatId;

    public CustomerDTO( String name, String email, String streetName, Integer doorNumber, String postalCode, String city, String country, String gender, Date birthDate, String phoneNumber, String vatId) {
        this.name = name;
        this.email = email;
        this.streetName = streetName;
        this.doorNumber = doorNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.vatId = vatId;
    }
}
