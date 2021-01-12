package com.nikkogabrielcm22;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

/** Test to check if getters work when called from another class.
 * Applied to bodyPartExerciseGenerator (main class).
 *
 * @author Nikko Gabriel Hismana
 */
public class test2_exercisesPerBodyPartTest {

    /** Test to confirm that getArms() method contains arm exercise
     */
    @Test
    public void getArms() {
        ArrayList<String> exerList;
        exerList = (ArrayList<String>) com.nikkogabrielcm22.exercisesPerBodyPart.getArms();
        assertTrue(exerList.contains("Bicep Curl"));
    }

    /** Test to confirm that getArms() method contains legs exercise
     */
    @Test
    public void getLegs() {
        ArrayList<String> exerList;
        exerList = (ArrayList<String>) com.nikkogabrielcm22.exercisesPerBodyPart.getLegs();
        assertTrue(exerList.contains("Deadlift"));
    }

    /** Test to confirm that getArms() method contains torso exercise
     */
    @Test
    public void getTorso() {
        ArrayList<String> exerList;
        exerList = (ArrayList<String>) com.nikkogabrielcm22.exercisesPerBodyPart.getTorso();
        assertTrue(exerList.contains("Crunches"));
    }
}