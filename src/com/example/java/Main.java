package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, this program will help you complete the GAD-7 anxiety questionnaire.\n\n"
                + "Use the following responses to answer ALL 7 questions:\n"
                + "0 = Not at all, 1 = Several days, 2 = More than half the days, 3 = Nearly every day.\n\n"
                + "Over the past 2 weeks, how often have you been bothered by the following problems:\n");

        Scanner in = new Scanner(System.in);

        System.out.println("Feeling nervous, anxious, or on edge? ");
        int Item1 = in.nextInt();
        System.out.println("Not being able to stop or control worrying? ");
        int Item2 = in.nextInt();
        System.out.println("Worrying too much about different things? ");
        int Item3 = in.nextInt();
        System.out.println("Having trouble relaxing? ");
        int Item4 = in.nextInt();
        System.out.println("Being so restless that it is hard to sit still? ");
        int Item5 = in.nextInt();
        System.out.println("Becoming easily annoyed or irritable? ");
        int Item6 = in.nextInt();
        System.out.println("Feeling afraid, as if something awful might happen? ");
        int Item7 = in.nextInt();

        int totalScore = (Item1 + Item2 + Item3 + Item4 + Item5 + Item6 + Item7);

        switch (totalScore) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4: {
                System.out.println("\nMinimal anxiety.");
                break;
            }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                System.out.println("\nMild, probably subclinical anxiety, and monitoring is recommended.");
                break;
            }
            case 10:
            case 11:
            case 12:
            case 13:
            case 14: {
                System.out.println("\nModerate, possible clinically significant anxiety, and further evaluation and treatment (if needed) are recommended.");
                break;
            }

            default: {
                System.out.println("\nSevere, probably clinically significant anxiety, and treatment is probably warranted.");
                break;

            }
        }
    }


}
