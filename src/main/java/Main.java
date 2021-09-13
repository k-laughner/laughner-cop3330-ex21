/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the number of the month:");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        String monthw = "Select a month";

        switch(month) {
            case 1:
                monthw = "January";
                break;
            case 2:
                monthw = "February";
                break;
            case 3:
                monthw = "March";
                break;
            case 4:
                monthw = "April";
                break;
            case 5:
                monthw = "May";
                break;
            case 6:
                monthw = "June";
                break;
            case 7:
                monthw = "July";
                break;
            case 8:
                monthw = "August";
                break;
            case 9:
                monthw = "September";
                break;
            case 10:
                monthw = "October";
                break;
            case 11:
                monthw = "November";
                break;
            case 12:
                monthw = "December";
                break;
        }
        System.out.println("The name of the month is " + monthw +".");
    }
}