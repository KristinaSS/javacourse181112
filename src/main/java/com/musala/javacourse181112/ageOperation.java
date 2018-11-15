package com.musala.javacourse181112;

import java.lang.reflect.Array;

public class ageOperation {
    public static void main(String[] args){
        System.out.println("The age is:" + args[0]);
        System.out.println("We add:" + args[1]);
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        System.out.println("The sumAge is:" + (a+b));
        System.exit(0);
    }
}
