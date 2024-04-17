package advance.dev;

import java.util.Scanner;
class Person {
    protected String name;
    protected int age;
    protected String phoneNumber;

    public Person() {
    }

    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}