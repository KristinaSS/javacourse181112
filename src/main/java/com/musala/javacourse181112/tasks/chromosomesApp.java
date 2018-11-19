package com.musala.javacourse181112.tasks;

import java.util.Scanner;

public class chromosomesApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String gender = sc.next();
        if (gender.equals("male")) {
            System.out.println("male: yx");
        } else if (gender.equals("female")){
            System.out.println("female: xx");
        }
        switch (gender) {
            case "male":
                System.out.println("Y");
                break;
            case "female":
                System.out.println("X");
        }
    }
}

