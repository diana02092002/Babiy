package com.company;

public class Mouse {
    String name;
    String relative;

    Mouse(String name,String relative){
        this.name=name;
        this.relative=relative;
    }
    void say(){
        System.out.println("Pi-pi-pi. I'm "+ relative+ " " +name+ " .I came to help pull out the turnip. Pull, pull, and pulled out a turnip.");
    }
}
