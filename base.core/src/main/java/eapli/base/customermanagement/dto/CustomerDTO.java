package eapli.base.customermanagement.dto;

import eapli.framework.representations.dto.DTO;

import java.util.Date;
import java.util.List;

@DTO
public class CustomerDTO {



    public String name;
    public String email;
    public List<String >address;

    public  String gender;
    public Date birthDate;
    public  String phoneNumber;
    public String vatId;

    public CustomerDTO(String name, String email, List<String >address, String gender, Date birthDate, String phoneNumber, String vatId) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.vatId = vatId;
    }
}
