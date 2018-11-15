package com.musala.javacourse181112;

public class VotesApp {
    public static void main(final String[] args) {
        final String[][] intYesNoAnswers = new String[3][2]; // move to constant values ?
        intYesNoAnswers[0][0] = "Yes";    //1st person 1st vote
        intYesNoAnswers[0][1] = "No";   //1st person 2nd vote
        intYesNoAnswers[1][0] = "Yes";    //2nd person 1st vote
        intYesNoAnswers[1][1] = "No";   //2nd person 2nd vote
        intYesNoAnswers[2][0] = "No";   //3rd person 1st vote
        intYesNoAnswers[2][1] = "Yes";    //3rd person 2nd vote

        System.out.println("Welcome! \n Is it snowing today?");

        for (int i = 0; i < 3; i++) {
            // obsolete
            /*if (intYesNoAnswers[i][0].equals("Yes")) {
                intYesNoAnswers[i][0] = "Yes";
            } else {
                intYesNoAnswers[i][0] = "No";
            }*/
            System.out.println(intYesNoAnswers[i][0]);
        }

        System.out.println("The second question is: \n Do you like Java?");

        for (int j = 0; j < 3; j++) {
            /*if (intYesNoAnswers[j][1].equals("Yes")) {
                intYesNoAnswers[j][1] = "Yes";
            } else {
                intYesNoAnswers[j][1] = "No";
            }*/
            System.out.println(intYesNoAnswers[j][1]);
        }
    }
}
