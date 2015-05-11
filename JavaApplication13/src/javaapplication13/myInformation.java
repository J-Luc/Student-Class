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
public class myInformation {

    public static void main(String[] args) {
        //create a Person 1 object
        StudentClass p1 = new StudentClass();
        p1.setName("Julian");
        p1.setAddress("300 Jay Street, Brooklyn, NY 11201");
        p1.setAge(28);
        p1.setPhoneNumber(718 - 260 - 5500);

        /**
         * Print the name, address, age and phone number for person 1
         */
        System.out.println("My name: " + p1.getName());
        System.out.println("My 1 address: " + p1.getAddress());
        System.out.println("My 1 age: " + p1.getAge());
        System.out.println("My 1 phone number: " + p1.getPhoneNumber());

        //Create a firend 1 object
        StudentClass p2 = new StudentClass();
        p2.setName("Christopher");
        p2.setAddress("42 st Time Square");
        p2.setAge(18);
        p2.setPhoneNumber(718 - 567 - 7889);

        /**
         * Print the name, address, age and phone number for person 2
         */
        System.out.println("Friend 1 name: " + p2.getName());
        System.out.println("Friend 1 address: " + p2.getAddress());
        System.out.println("Friend 1 age: " + p2.getAge());
        System.out.println("Friend 1 phone number: " + p2.getPhoneNumber());

        //Create a friend 2 object 
        StudentClass p3 = new StudentClass();
        p3.setName("Daniele");
        p3.setAddress("165 st, Brayan Park");
        p3.setAge(25);
        p3.setPhoneNumber(567 - 876 - 7965);

        /**
         * Print the name, address, age and phone number for friend 3
         */
        System.out.println("Friend 3 name: " + p3.getName());
        System.out.println("Friend 3 adress: " + p3.getAddress());
        System.out.println("Friend 3 age: " + p3.getAge());
        System.out.println("Friend 3 phone mumber: " + p3.getPhoneNumber());

    }

}
