package com.musala.javacourse181112.Basics;

public class OperatorsExample {
    public static void main(final String[] args) {
        int i1 = 0;
        //int i2 = 1;

        i1 = 0;
        i1 += 1;
        System.out.println(i1);

        i1 = 0;
        i1 = i1 * 2;
        i1 *= 2;
        System.out.println(i1++);

        System.out.println(true);
        System.out.println(!true);

        System.out.println(2 * 2);
        System.out.println(4 / 2);
        System.out.println(4 % 3);

        String value = "asd";
        String value1 = args[1];
//        System.out.println(value == value1);
    }
}
