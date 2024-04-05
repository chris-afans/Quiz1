package edu.miu.cs.cs489appsd.quiz1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailAddress {
    private String emailAddress;
    private String label;

    @Override
    public String toString(){
        return String.format("(email address=%s, label=%s)", emailAddress, label);
    }
}
