package com.company;

public class Cat {
    String name;
    String relative;

    Cat(String name,String relative){
        this.name=name;
        this.relative=relative;
    }
    void say(){
        System.out.println("Meow. I'm "+ relative+ " .I'm "+ name+ " .I came to help pull out the turnip. We pull, we pull, we can't pull it out. I called the mouse for help.");
    }
}
