package com.musala.javacourse181112.Basics;

public class EnumsExample {
    // implicitly extends java.lang.Enum
        public static void main(final String[] args) {
            Gender gender = Gender.FEMALE;
            gender = Gender.MALE;

            switch (gender) {
                case MALE:
                    System.out.println("Male found: " + gender);
                    break;
                case FEMALE:
                    System.out.println("Female found: " + gender);
                    break;
            }
        }


}
