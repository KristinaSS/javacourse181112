package com.musala.javacourse181112;

public class ConditionsExample {
    public static void main(String[] args) {
        if (2 > 2) {
            System.out.println("true");
        } else if (5 > 6) {
            System.out.println("0");
        } else if (6 > 7) {
            System.out.println("1");
        } else if (7 == 7) {
            System.out.println("2");
        }
        final String variable = 1 != 1 ? "true" : "false";
        String value = "yes";
        switch (value) {
            case "yes":
                System.out.println("value: yes");
                break;
            case "no":
                System.out.println("value: no");
                break;
                default:
                    System.out.println("default");
                    break;
        }
    }

}
