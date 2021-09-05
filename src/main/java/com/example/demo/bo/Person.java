package com.example.demo.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

    private int id;
    private String firstName;

    public Person(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
}
