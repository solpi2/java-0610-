package org.example;

import org.example.animal.Person;

public class Main {
    public static void main(String[] args) {
    Person person = new Person();

    person.name = "박진희";
    person.age = 18;

    person.hello();
    }
}