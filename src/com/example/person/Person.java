package com.example.person;

public class Person {
    public int age;
    public String lastName;
    public String firstName;

    public Person(int a, String l, String f) {
        this.age = a;
        this.lastName = l;
        this.firstName = f;
    }

    public boolean greaterThan(Person a, Person b, int type) {
        boolean flag = false;

        switch (type) {
            case 0: flag = b.age > a.age;
            case 1: flag = b.age >= a.age;
        }

        return flag;
    }

    public boolean lessThan(Person a, Person b, int type) {
        boolean flag = false;

        switch (type) {
            case 0: flag = b.age < a.age;
            case 1: flag = b.age <= a.age;
        }

        return flag;
    }
}
