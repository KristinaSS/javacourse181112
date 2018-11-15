package com.musala.javacourse181112.Basics;

public class StringExample {
    public static void main(final String[] args) {
        String value = "asd";
        System.out.println(value + " asd1");

        //full notation
        String valueUsingConstructor = new String("asd");
        System.out.println(valueUsingConstructor.equals(value));

        System.out.println(value + " asd1");
        System.out.println(value.concat(" asd1"));

    }
}
