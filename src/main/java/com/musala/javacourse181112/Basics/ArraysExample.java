package com.musala.javacourse181112.Basics;

public class ArraysExample {
    public static void main(final String[] args) {
        int [] intArray = new int[10];
        //empty array for 10 integers
        intArray[0] = 1;
        intArray[9] = 10;


//        intArray = new int[intArray.length + 3]; //.length is a dynamic way to get the length of the array
//        intArray = new int[13];

        System.out.println(intArray.toString()); // we have 4 arrays;

        // кратка нотация за инициализация на array
        long[] longArray = {1L, 4L, 5L}; // {1L, 4L, 5L} изброяваме избраните стойности в блок; в лявата част задаваме ТИПА на елемента;
    }
}
