/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.person;

/**
 *
 * @author yudistira
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.name = "Yudis";

        System.out.println("Nama saya Public adalah = " + person.name);

        Person Person = new Person();
        Person.setName("Tira");

        System.out.println("Nama saya private adalah = " + Person.getName());

        Person PERSON = new Person();

        PERSON.NAME = "Rafion";
        System.out.println("Nama saya protacted adalah = " + PERSON.NAME);
    }
}
    
