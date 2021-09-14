/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your height? ");
        int height = input.nextInt();

        System.out.print("What is your weight? ");
        int weight = input.nextInt();

        double BMI = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.1f", BMI);

        if (BMI > 25){
            System.out.print("You are overweight. You should see your doctor.");
        }
        else if (BMI < 18){
            System.out.print("You are underweight. You should see your doctor.");
        }
        else {
            System.out.print("You are within the ideal weight range.");
        }
    }
}