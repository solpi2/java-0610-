package org.example;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void hello() {
        System.out.println("hello");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("h662", 20);

        person.hello();

        if(true) {
            int a = 10;
        }
    }
}