package com.nikkogabrielcm22;

import java.util.ArrayList;
import java.util.List;

/** This class serves to create ArrayLists based on each body part being exercised,
 * and stores exercises in their respective ArrayLists
 * @author Nikko Gabriel J. Hismana
 */
public class exercisesPerBodyPart {

    public static ArrayList<String> arms = new ArrayList<>();
    public static ArrayList<String> legs = new ArrayList<>();
    public static ArrayList<String> torso = new ArrayList<>();

    //LIST OF WORKOUTS PER BODY PART, CAN EASILY ADD/REMOVE. TRIED FILE-HANDLING BUT RAN OUT OF TIME.
    static{

        //ARMS WORKOUT
        arms.add("Bicep Curl");
        arms.add("Hammer Curl");
        arms.add("Upright Rows");
        arms.add("Shoulder Press");
        arms.add("Cuban Press");
        arms.add("Triceps Extensions");
        arms.add("Lateral Raise");
        arms.add("Bent Over Raise");
        arms.add("Bent Over Rows");
        arms.add("Dumbbell Row");
        arms.add("Dumbbell Pullover");
        arms.add("Front Raise");
        arms.add("Dumbbell Punches");

        //LEGS WORKOUT
        legs.add("Deadlift");
        legs.add("Sumo Squat");
        legs.add("Goblet Squat");
        legs.add("Single-leg Deadlift");
        legs.add("Romanian Deadlift");
        legs.add("Lunges");
        legs.add("Calf Raises");
        legs.add("Side-to-side Lunges");
        legs.add("Side Leg Raises");
        legs.add("Jump Squat");
        legs.add("Jumping Calf Raise");
        legs.add("Wall Sit");
        legs.add("Plank Leg Raises");
        legs.add("Squat-to-Press");

        //TORSO WORKOUT
        torso.add("Crunches");
        torso.add("Leg Raise");
        torso.add("Alternate Arm-Leg Raise");
        torso.add("Mountain Climbers");
        torso.add("Boat Tucks");
        torso.add("Plank Arm Reach");
        torso.add("Cross Chops");
        torso.add("Side Lifts");
        torso.add("Sitting Twists");
        torso.add("Alternating Dumbbell Swing ");
        torso.add("Diamond Press-Up");
        torso.add("Jack Knives");

    }

    /** Getter method for arm workouts when user inputs "arms" in bodyPartExerciseGenerator
     * @return ArrayList of arm workouts
     */
    public static List<String> getArms() {
        return arms;
    }

    /**Getter method for arm workouts when user inputs "legs" in bodyPartExerciseGenerator
     * @return ArrayList of leg workouts
     */
    public static List<String> getLegs() {
        return legs;
    }

    /**Getter method for arm workouts when user inputs "torso" in bodyPartExerciseGenerator
     * @return ArrayList of torso workouts
     */
    public static List<String> getTorso() {
        return torso;
    }
}
