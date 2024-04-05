package edu.miu.cs.cs489appsd.quiz1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String Company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;
}
