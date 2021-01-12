package com.nikkogabrielcm22;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/** Test to check that getRandomExercise() method returns 'n' number of
 * exercises where 'n' is the no. of exercises as per user input.
 * Test run with LOCAL ArrayString.
 *
 * @author Nikko Gabriel Hismaña
 */

public class test1_getRandomExer_TestNoOfExer_Local {

    @Test
    public void getRandomExercise() {

        // for testing: create local ArrayList taking String-type data, and random exercises
        ArrayList<String> exerList = new ArrayList<>();
        exerList.add("Exer 1");
        exerList.add("Exer 2");
        exerList.add("Exer 3");
        exerList.add("Exer 4");
        exerList.add("Exer 5");

        assertEquals(2, getRandomExer.getRandomExercise(exerList,2).size());
    }

}