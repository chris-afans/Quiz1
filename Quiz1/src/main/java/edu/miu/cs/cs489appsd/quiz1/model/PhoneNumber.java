package edu.miu.cs.cs489appsd.quiz1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PhoneNumber {
    private String phoneNumber;
    private String label;

    @Override
    public String toString(){
        return String.format("(phone number=%s, label=%s)", phoneNumber, label);
    }
}
