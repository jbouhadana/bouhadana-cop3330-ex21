/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);

        int input = 0;
        String printThis = ("The name of the month is %s.");

        do {
            try {
                System.out.print("Enter the number for the month: ");
                input = Integer.parseInt(jb.nextLine());
            } catch (NumberFormatException ex) {

                System.out.println(ex + " is invalid. Enter an integer!");

            }

        } while (input < 1 || input > 12);

        String month = switch (input) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "nonexistent";
        };

        System.out.printf(printThis, month);
    }
}