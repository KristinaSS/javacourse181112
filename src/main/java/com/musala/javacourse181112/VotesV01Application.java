package com.musala.javacourse181112;


public class VotesV01Application {
    public static void main(final String[] args) {

        System.out.println("Welcome! Question 1: Is it snowing today?");
        System.out.println("Welcome! Question 2: Do you rather be snowing?");


        boolean[][] answer = new boolean[2][30];
        answer[0][0] = false;
        answer[0][1] = false;
        answer[0][2] = true;
        answer[1][0] = true;
        answer[1][1] = false;
        answer[1][2] = true;

        System.out.println("Question1: \nVoter 1 answers: " + answer[0][0]);
        System.out.println("Voter 2 answers: " + answer[0][1]);
        System.out.println("Voter 3 answers: " + answer[0][2]);
        System.out.println("Question2: \nVoter 1 answers: " + answer[1][0]);
        System.out.println("Voter 2 answers: " + answer[1][1]);
        System.out.println("Voter 1 answers: " + answer[1][2]);

    }

}
