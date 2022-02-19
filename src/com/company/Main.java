package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Grandfather grandfather = new Grandfather("Athanasius", "grandfather");
        Grandmother grandmother=new Grandmother("Vera","grandmother");
        Granddaughter granddaughter=new Granddaughter("Katya","granddaughter",new Dog("Zhuchka"));
        Cat cat=new Cat("Marusya","cat");
        Mouse mouse=new Mouse("Narushka","mouse");

        grandfather.say();
        grandmother.say();
        granddaughter.say();
        granddaughter.dog.say();
        cat.say();
        mouse.say();

    }
}