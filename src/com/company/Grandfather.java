package com.company;

public class Grandfather {
    String name;
    String relative;

    Grandfather(String name,String relative){
        this.name=name;
        this.relative=relative;
    }
    void say(){
        System.out.println("Hi,my name is "+ name + " .I'm " + relative +  " .I planted the turnip. When the turnip grew, I went to tear it and could not pull it out. I called my grandmother.");
    }
}


