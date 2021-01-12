package com.nikkogabrielcm22;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/** Test to check that getRandomExercise() method returns 'n' number of
 * exercises where 'n' is the no. of exercises as per user input.
 * Test run by accessing ArrayList of exercises by body parts under exercisesPerBodyPart class.
 * Applied to bodyPartExerciseGenerator (main class).
 *
 * @author Nikko Gabriel Hismana
 */
public class test3_getRandomExer_TestNoOfExer_CrossClass {


    /** Tests to confirm that getRandomExercise returns the right number of ARM exercises based on user input
     */
    @Test
    public void getRandomExerciseArms() {
        ArrayList<String> exerList;
        exerList = (ArrayList<String>) com.nikkogabrielcm22.exercisesPerBodyPart.getArms();

        assertEquals(2, getRandomExer.getRandomExercise(exerList,2).size());
    }

    /** Tests to confirm that getRandomExercise returns the right number of LEGS exercises based on user input
     */
    @Test
    public void getRandomExerciseLegs() {
        ArrayList<String> exerList;
        exerList = (ArrayList<String>) com.nikkogabrielcm22.exercisesPerBodyPart.getLegs();

        assertEquals(2, getRandomExer.getRandomExercise(exerList,2).size());
    }

    /** Tests to confirm that getRandomExercise returns the right number of TORSO exercises based on user input
     */
    @Test
    public void getRandomExerciseTorso() {
        ArrayList<String> exerList;
        exerList = (ArrayList<String>) com.nikkogabrielcm22.exercisesPerBodyPart.getTorso();

        assertEquals(2, getRandomExer.getRandomExercise(exerList,2).size());
    }

}