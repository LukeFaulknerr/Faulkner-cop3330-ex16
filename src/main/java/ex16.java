/*
    UCF COP3330 Fall 2021 Assignment 16 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {

        // Variables
        String age;
        Scanner drivingInstructor = new Scanner(System.in);

        // Prompt
        System.out.print("What is your age? ");
        age = drivingInstructor.nextLine();
        int ageNum = Integer.parseInt(age);

        // Output
        String output = ageNum >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive";
        System.out.print(output);
    }
}
