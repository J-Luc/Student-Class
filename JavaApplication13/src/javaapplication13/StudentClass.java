/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Jean-Luc
 */
public class StudentClass {

    /**
     * The name, address, age and phone number of the student class
     */
    private String name;
    private String address;
    private int age;
    private int phoneNumber;

    /**
     * Set the name, address, age and phone number of the student class
     */
    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int b) {
        age = b;
    }

    public void setPhoneNumber(int p){
        phoneNumber = p;
    }

    /**
     * Return the name, address, age and phone number of the student class
     */
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

}
