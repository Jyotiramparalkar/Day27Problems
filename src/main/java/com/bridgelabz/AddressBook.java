package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
    public ArrayList<Contact> contact = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public void addContact()
    {
        System.out.println("Enter first name :: ");
        String firstName = in.next();
        System.out.println("Enter last name :: ");
        String lastName = in.next();
        System.out.println("Enter street :: ");
        String street = in.next();
        System.out.println("Enter city name :: ");
        String city = in.next();
        System.out.println("Enter state name :: ");
        String state = in.next();
        System.out.println("Enter zip : ");
        int zip = in.nextInt();
        System.out.println("Enter contact number : ");
        long phoneNo = in.nextLong();
        System.out.println("Enter email id : ");
        String email = in.next();

        contact.add(new Contact(firstName,lastName,street,city,state,zip,phoneNo,email));
    }
    public void showContact()
    {
        for (Contact contact : contact){
            System.out.println(contact);
        }
    }

    public void editContact(){
        System.out.println("Enter person name : ");
        String name = in.next();
        for(Contact contact : contact){
            if(contact.getFirstName().equals(name) || contact.getLastName().equals(name)){
                System.out.println("What you want to edit : \n" +
                        "1.first name \t" +
                        "2.last name \t" +
                        "3.street \t" +
                        "4.city \t" +
                        "5.state \t" +
                        "6.zip \t" +
                        "7.contact number \t" +
                        "8.email");
                int ch = in.nextInt();
                switch (ch){
                    case 1:
                        System.out.println("Enter first name :");
                        contact.setFirstName(in.next());
                        System.out.println("Contact updated!");
                        break;
                    case 2:
                        System.out.println("Enter last name :");
                        contact.setLastName(in.next());
                        System.out.println("Contact updated!");
                        break;
                    case 3:
                        System.out.println("Enter street :");
                        contact.setStreet(in.next());
                        System.out.println("Contact updated!");
                        break;
                    case 4:
                        System.out.println("Enter city :");
                        contact.setCity(in.next());
                        System.out.println("Contact updated!");
                        break;
                    case 5:
                        System.out.println("Enter state :");
                        contact.setState(in.next());
                        System.out.println("Contact updated!");
                        break;
                    case 6:
                        System.out.println("Enter zip code :");
                        contact.setZip(in.nextInt());
                        System.out.println("Contact updated!");
                        break;
                    case 7:
                        System.out.println("Enter contact number :");
                        contact.setPhoneNo(in.nextLong());
                        System.out.println("Contact updated!");
                        break;
                    case 8:
                        System.out.println("Enter email :");
                        contact.setEmail(in.next());
                        System.out.println("Contact updated!");
                        break;
                    default:
                        System.out.println("Invalid input.");
                }
                return;
            }
        }
        System.out.println(name + " not found!");
    }

    public void deleteContact()
    {
        System.out.println("Enter person name : ");
        String name = in.next();
        for(Contact contact : contact){
            if(contact.getFirstName().equals(name) || contact.getLastName().equals(name))
            {
                System.out.println(contact.getFirstName() +" removed!");
                return;
            }
        }
        System.out.println(name + " not found  ");
    }
    public List<Contact> getContactList(){
        return contact;
    }

}
    

