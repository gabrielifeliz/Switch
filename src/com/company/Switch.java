package com.company;

/*
 * Switch.java
 * Write a program using a switch statement to print the month names
 * given the exact number of days in the month.
 * If the user enters 30 then the program will display: "September April June November".
 * If the user enters 9 then program will alert the user that no months have exactly 9 days.
 *
 * You can have more than one statement in each switch case.
 * */
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter days in a month: ");
        int daysInAMonth = keyboard.nextInt();

        String nameOfMonths = (daysInAMonth == 28 ||daysInAMonth == 29 )
                ? "The month that has " + daysInAMonth + " days is:\n"
                : "The months that have " + daysInAMonth + " days are:\n";

        switch (daysInAMonth) {
            case 28:
                nameOfMonths += "February";
                break;
            case 29:
                nameOfMonths += "February (in leap years)";
                break;
            case 30:
                nameOfMonths += "April June September April June November";
                break;
            case 31:
                nameOfMonths += "January March May July August October December";
                break;
            default:
                nameOfMonths = "No months have exactly " + daysInAMonth + " days.";
                break;
        }
        System.out.println(nameOfMonths);

        keyboard.close();
    }

}
