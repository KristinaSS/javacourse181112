package com.musala.javacourse181112.Basics;

public class DataTypeExample {

    static final  String CONSTANT_VALUE = "ads";

    int classFieldInt; // 0
    String classFieldString; // null
    {
        System.out.println(classFieldString);
    }


    public static void defineAndInitializePrimitives(String inputValue) {

        byte myByteVariable = (byte) (123 + 1);
        short myShortVariable;
        int myIntVariable = 1;
        long myLongVariable = 1L;

        float myFloatVariable = 1.0F;
        double myDoubleVariable = 1.0; //d

        System.out.println(1212132); //hardcoded, inferred int

        boolean myBooleanVariable = true;

        char myCharVariable = 'a';
        char a = 97;
        char a1 = '\u0061';


        //numeric systems
        int binaryInt = 0b1100100; // binary
        int decimal = 100; // decimal
        int octalInt = 0144; // octal integer
        int hexInt = 0x64; // hexadecimal

        //scientific notation
        double scientificInt = 1e2; //E

        int k;
        int i = k = 0;

    }

    public static void defineAndInitializeReferences(String referenceArgument) {
        String value1; // local variable

        final String myVariable = "asd\"\\" + 1 + 1 * 2; // final is immutable
        //    myVariable = "ads1";

        System.out.println();
    }

    public static void main(String[] args) {
        defineAndInitializeReferences(null);
    }
}

