package com.musala.javacourse181112;

public class VotesApp {
    public static void main(String[] args) {
        String[][] intYesNoAns = new String[3][2];
        intYesNoAns[0][0]= "Yes";    //1st person 1st vote
        intYesNoAns[1][0]= "Yes";    //2nd person 1st vote
        intYesNoAns[2][0]= "No";   //3rd person 1st vote
        intYesNoAns[0][1]= "No";   //1st person 2nd vote
        intYesNoAns[1][1]= "No";   //2nd person 2nd vote
        intYesNoAns[2][1]= "Yes";    //3rd person 2nd vote
        System.out.println("Welcome! \n Is it snowing today?");
        for(int i=0;i<3; i++){
            if(intYesNoAns[i][0].equals("Yes")){
                intYesNoAns[i][0]="Yes";
            }else{
                intYesNoAns[i][0]="No";
            }
            System.out.println(intYesNoAns[i][0]);
        }
        System.out.println("The second question is: \n Do you like Java?");

        for(int j=0;j<3; j++){
            if(intYesNoAns[j][1].equals("Yes")){
                intYesNoAns[j][1]="Yes";
            }else{
                intYesNoAns[j][1]="No";
            }
            System.out.println(intYesNoAns[j][1]);
        }
    }
}
