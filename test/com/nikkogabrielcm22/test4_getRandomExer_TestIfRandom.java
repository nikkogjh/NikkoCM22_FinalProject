package com.nikkogabrielcm22;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/** Test to check that getRandomExercise does not provide the same result each time it's called
 * Applied to getRandomExer class method
 *
 * @author Nikko Gabriel Hismana
 */
public class test4_getRandomExer_TestIfRandom {

    /** Test to confirm that each run of getRandomExercise is unique and non-repeating for ARMS exercises
     */
    @Test
    public void getRandomExerciseArms() {
        ArrayList<String> exerList1;
        exerList1 = (ArrayList<String>) exercisesPerBodyPart.getArms();
        ArrayList<String> exerList2;
        exerList2 = (ArrayList<String>) exercisesPerBodyPart.getArms();
        assertNotEquals(getRandomExer.getRandomExercise(exerList1, 2), getRandomExer.getRandomExercise(exerList2, 2));
    }

    /** Test to confirm that each run of getRandomExercise is unique and non-repeating for LEGS exercises
     */
    @Test
    public void getRandomExerciseLegs() {
        ArrayList<String> exerList1;
        exerList1 = (ArrayList<String>) exercisesPerBodyPart.getLegs();
        ArrayList<String> exerList2;
        exerList2 = (ArrayList<String>) exercisesPerBodyPart.getLegs();
        assertNotEquals(getRandomExer.getRandomExercise(exerList1, 2), getRandomExer.getRandomExercise(exerList2, 2));
    }

    /** Test to confirm that each run of getRandomExercise is unique and non-repeating for TORSO exercises
     */
    @Test
    public void getRandomExerciseTorso() {
        ArrayList<String> exerList1;
        exerList1 = (ArrayList<String>) exercisesPerBodyPart.getTorso();
        ArrayList<String> exerList2;
        exerList2 = (ArrayList<String>) exercisesPerBodyPart.getTorso();
        assertNotEquals(getRandomExer.getRandomExercise(exerList1, 2), getRandomExer.getRandomExercise(exerList2, 2));
    }

}