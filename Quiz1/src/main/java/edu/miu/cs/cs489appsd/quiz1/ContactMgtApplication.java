package edu.miu.cs.cs489appsd.quiz1;

import edu.miu.cs.cs489appsd.quiz1.model.Contact;
import edu.miu.cs.cs489appsd.quiz1.model.EmailAddress;
import edu.miu.cs.cs489appsd.quiz1.model.PhoneNumber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContactMgtApplication {

//    public static void printJsonFormat(List<Contact> contacts){
//        contacts = contacts.stream()
//                .sorted(Comparator.comparing(Contact::getLastName)).toList();
//
//        for(int i = 0 ; i < contacts.size() ; i++){
//            if(i+1 < contacts.size()){
//                if(contacts.get(i).getPhoneNumbers() != null && contacts.get(i).getEmailAddresses() != null){
//                    System.out.println(String.format("\t{ contact id: %d, firstname: \"%s\", lastname: \"%s\", company: \"%s\", job title: \"%s\", phonenumber(s): %s, email address(es): %s},",
//                            contacts.get(i).getId(), contacts.get(i).getFirstName(), contacts.get(i).getLastName(), contacts.get(i).getCompany(), contacts.get(i).getJobTitle(), contacts.get(i).getPhoneNumbers(), contacts.get(i).getEmailAddresses()));
//                }
//            } else if (i+1 == contacts.size()){
//                if(contacts.get(i).getPhoneNumbers() != null && contacts.get(i).getEmailAddresses() != null){
//                    System.out.println(String.format("\t{ contact id: %d, firstname: \"%s\", lastname: \"%s\", company: \"%s\", job title: \"%s\", phonenumber(s): %s, email address(es): %s}",
//                          contacts.get(i).getId(), contacts.get(i).getFirstName(), contacts.get(i).getLastName(), contacts.get(i).getCompany(), contacts.get(i).getJobTitle(), contacts.get(i).getPhoneNumbers(), contacts.get(i).getEmailAddresses()));
//                }
//
//            } else if (i+1 < contacts.size() && contacts.get(i).getEmailAddresses() == null && contacts.get(i).getPhoneNumbers() == null) {
//                System.out.println(String.format("\t{ contact id: %d, firstname: \"%s\", lastname: \"%s\", company: \"%s\", job title: \"%s\"},",
//                        contacts.get(i).getId(), contacts.get(i).getFirstName(), contacts.get(i).getLastName(), contacts.get(i).getCompany(), contacts.get(i).getJobTitle()));
//            }else{
//                System.out.println(String.format("\t{ contact id: %d, firstname: \"%s\", lastname: \"%s\", company: \"%s\", job title: \"%s\"}",
//                        contacts.get(i).getId(), contacts.get(i).getFirstName(), contacts.get(i).getLastName(), contacts.get(i).getCompany(), contacts.get(i).getJobTitle()));
//            }
//        }
//    }

    public static void printJsonFormat(List<Contact> contacts) {
        contacts = contacts.stream()
                .sorted(Comparator.comparing(Contact::getLastName)).toList();

        System.out.println("[");
        for (Contact contact : contacts) {
           if(contact.getEmailAddresses() != null && contact.getPhoneNumbers() != null){
               if(contact.getEmailAddresses().size() > 0 && contact.getPhoneNumbers().size() > 0){
                   System.out.println(String.format("\t{ contact id: %d, firstname: \"%s\", lastname: \"%s\", company: \"%s\", job title: \"%s\", phonenumber(s): %s, email address(es): %s}",
                           contact.getId(), contact.getFirstName(), contact.getLastName(), contact.getCompany(), contact.getJobTitle(), contact.getPhoneNumbers(), contact.getEmailAddresses()));
               }
           }else{
                System.out.println(String.format("\t{ contact id: %d, firstname: \"%s\", lastname: \"%s\", company: \"%s\", job title: \"%s\"}",
                        contact.getId(), contact.getFirstName(), contact.getLastName(), contact.getCompany(), contact.getJobTitle()));
            }

        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        var e1 = List.of(new EmailAddress("dave.sang@gmail.com", "Home"), new EmailAddress("dsanger@argos.com", "Work"));
        var p1 = List.of(new PhoneNumber("240-133-0011", "Home"), new PhoneNumber("240-112-0123", "Mobile"));
        var e3 = List.of(new EmailAddress("ali@bmi.com", "Work"));
        var p3 = List.of(new PhoneNumber("412-116-9988", "Work"));
        Contact c1 = new Contact(1, "David", "Sanger", "Argos LLC", "Sales Manager",p1, e1);
        Contact c2 = new Contact(2, "Carlos", "Jimenez", "Zappos", "Director", null, null);
        Contact c3 = new Contact(3, "Ali", "Gafar", "BMI Services", "HR Manager", p3, e3);
        var contacts = List.of(c1,c2,c3);
        printJsonFormat(contacts);
    }
}