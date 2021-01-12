package com.nikkogabrielcm22;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/** The "bodyPartExerciseGenerator" class randomly generates a list of workouts
 * based on the body part the user wishes to workout and the number of workouts.
 * <p>
 * This is the main class that calls and executes methods from other classes.
 * </p>
 * @author Nikko Gabriel Hismana
 */
public class bodyPartExerciseGenerator {

    public static void main(String[] args) {
        //Initialize Scanner
        Scanner userInput = new Scanner(System.in);

        //Intro and Instructions
        System.out.println();
        System.out.println("Welcome to BPEG (Body Part Exercise Generator)!");
        System.out.println();
        System.out.println("This program will randomly generate a list of workouts for you to do based on:" +
                "\n(a) the body part you wish to work out, and " +
                "\n(b) the number of exercises you want to do for your chosen body part.");
        System.out.println();
        System.out.println("Let's Begin!");


        //User Input for Body Part
        boolean run = true;
        ArrayList<String> exerList = new ArrayList<>(); //creates new list
        String bodyPart = null;

        while(run){
            System.out.print("Which body part do you wish to work out (arms, legs, torso): ");
            bodyPart = userInput.nextLine();
            switch (bodyPart.toLowerCase()) {
                case "arms":
                    System.out.println("You chose arms");
                    exerList = (ArrayList<String>) com.nikkogabrielcm22.exercisesPerBodyPart.getArms();
                    run = false;
                    break;
                case "legs":
                    System.out.println("You chose legs");
                    exerList = (ArrayList<String>) com.nikkogabrielcm22.exercisesPerBodyPart.getLegs();
                    run = false;
                    break;
                case "torso":
                    System.out.println("You chose torso");
                    exerList = (ArrayList<String>) com.nikkogabrielcm22.exercisesPerBodyPart.getTorso();
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Input. Try again!");
            }
        }

        //User Input for Number of Exercises
        run = true;
        int numberOfExercises = 0;

        while(run) {
            System.out.print("Enter number of workouts you wish to do (max 9): ");
            try {
                numberOfExercises = userInput.nextInt();
                if (numberOfExercises <= 0 || numberOfExercises > 9) {
                        System.out.println("Please enter a number greater than 0 and less than 10.");
                } else {
                        run = false;
                }
            } catch (InputMismatchException e) {
                //error-catcher in case the user inputs a String instead of int
                System.out.println("Invalid Input! Must be a NUMBER!");
                userInput.nextLine();
            }
        }

        //close scanner
        userInput.close();

        // FINAL OUTPUT
        // calls getRandomExerciseMethod to get a number of exercises from exerList based on userInput
        System.out.println();
        System.out.println("Here is your " + bodyPart.toUpperCase() + " workout list: ");
        for (String i: getRandomExer.getRandomExercise(exerList,numberOfExercises)) System.out.println("- " + i);
        System.out.println();
        System.out.println("Goodluck!");
    }
}
