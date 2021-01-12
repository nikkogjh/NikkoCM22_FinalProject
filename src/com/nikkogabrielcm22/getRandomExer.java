package com.nikkogabrielcm22;

import java.util.ArrayList;
import java.util.Random;

/**This class stores the method "getRandomExercise" which uses "ArrayList" building and the "Random"
 * utility to generate a list of exercises based on the chosen body part and the number of exercises.
 * @author Nikko Gabriel J Hismana
 */
public class getRandomExer {

    // method that randomly selects an exercise
    /** This method generates the list of exercises based on user input in BodyPartExerciseGenerator
     * @param exerList an ArrayList stored in the exercisesPerBodyPart that the user inputs in bodyPartExerciseGenerator
     * @param numberOfExercises an Int value that the user inputs indicating the no. of exercises to be randomly generated
     * @return an ArrayList containing the exercises based on selected body part and no. of exercises
     */
    public static ArrayList<String> getRandomExercise(ArrayList<String> exerList, int numberOfExercises) {
        Random randomizer = new Random();

        // create a temporary list for storing selected element
        ArrayList<String> newExerList = new ArrayList<>();

        //iterates <n> numbers of elements in the exercise list, where <n> is the numberOfExercises (user input)
        for (int i = 0; i < numberOfExercises; i++) {

            // take a random index between 0 to size of given List
            int randomIndex = randomizer.nextInt(exerList.size());

            // add element in temporary list
            newExerList.add(exerList.get(randomIndex));

            // Remove selected element from original list
            exerList.remove(randomIndex);
        }
        return newExerList;
    }
}
