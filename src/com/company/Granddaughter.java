package com.company;

public class Granddaughter {
    String name;
    String relative;
    Dog dog;

    Granddaughter(String name, String relative) {
        this.name = name;
        this.relative = relative;
    }
    Granddaughter(String name, String relative,Dog dog) {
        this.name = name;
        this.relative = relative;
        this.dog=dog;
    }

    void say() {
        System.out.println("Hi,my name is " + name + " . I'm " + relative + " . I came to help my grandmother and grandfather pull out the turnip. We pull, we pull, we can't pull it out. I called the dog for help." );
        System.out.println("My dog's name is " + dog.name+". ");
    }
}
