package com.company;

public class Grandmother  {
    String name;
    String relative;

            Grandmother(String name, String relative) {
            this.name = name;
            this.relative = relative;
            }
            void say(){
                System.out.println("Hi,my name is " + name + " . I'm "+ relative+ " . I came to help my grandfather pull the turnip. We pull, we pull, we can't pull it out. I called my granddaughter for help.");
            }
}
