package org.example.item2;

import lombok.Builder;
@Builder
public class Person {
    private String name;
    private  int age;
    private String race;

    public static void main(String[] args) {
        Person aPerson = new PersonBuilder()
                .name("John").age(30).race("Asian").build();
    }
}
