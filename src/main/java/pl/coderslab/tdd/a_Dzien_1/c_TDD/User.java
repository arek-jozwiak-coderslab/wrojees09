package pl.coderslab.tdd.a_Dzien_1.c_TDD;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String surname;

    public User(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
