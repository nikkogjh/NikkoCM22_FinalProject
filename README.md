# NikkoCM22_FinalProject
A simple random exercise generator program as a final project for CM22.

#########################

INFO

Author:             Nikko Gabriel J. Hismaña

My Hobby/Interest:  Working Out

Program Name:       Body Part Exercise Generator (BPEG)

Program Type:       Randomized Body Part-Specific Workout Plan Generator

Brief Description:  Creates a randomized list of workouts based on the body parts you wish to exercise.

Java Version:       11.0.9

###########################

JAVA DESIGN PATTERNS

CREATIONAL PATTERN: SINGLETON
-The program does not create new instances based on user input, but rather has a class with a method that is being accessed by other classes in order to function

STRUCTURAL PATTERN: DECORATOR
-The way the program works is by wrapping objects (the body-specific exercises) in ArrayLists in order to interact with the randomizer

BEHAVIORAL PATTERN: COMMAND & ITERATOR
-The program has a limited function which basically takes user input then executes methods, and these methods are mostly traversal-based due to the prominent use of ArrayLists.

###########################

TDD

The program was developed with both TDD (test -> fail -> code -> test -> pass -> refactor) and Incremental Development (write code ->  run with test variables -> then writemore code). Classes and methods features were tested using JUnit 4. I was able to make 4 tests:
1) Test 1 to check that my workout randomizer works, but using local (in-class-defined) variables
2) Test 2 was to confirm that my getters were working properly across different classes
3) Test 3 was a variation of Test 1 to confirm that the randomizer worked with variables from different classes using a code developed under Test 2
4) Test 4 was to confirm that the randomizer results were indeed non-repeating/randomized

###########################

BEST PRACTICES

1) Source File length is relatively short, even with its limited features. Redundant code is minimized.

2) Source file is well-organized and well-documented with the use of Javadocs and comments.

3) Names were easy to follow, and naming conventions (casing) were followed in all classes, objects, variables, and classes, as well with the package and program name. 

4) Proper indentation and line length were followed for readability.

5) Control-Flow statements were tested multiple times (via incremental development) to prevent infinite loops and semantic errors.

6) Javadoc descriptions were brief and accurate, and proper annotations were used.

7) Code was made to be flexible for future development (relatively easy to change/upgrade/add features).

8) Overall, the code was easy-to-follow and had sufficient comments and annotations for checking and future developments.

###########################

BAD PRACTICES / AREAS FOR IMPROVEMENT

1) I was unable to practice abstraction and encapsulation (the use of private classes). When I was initially making the code using incremental development (run the program with a test variable each time I add a code), I was able to use private classes to hide certain details. But when I developed tests using JUnit, it was unable to do tests unless I changed some classes to public-static.

2) No firm grasp of design patterns. At times I was unsure of which design pattern I was using despite planning beforehand.

3) TDD could've been done better. There were tests I wanted to perform that I just did not know how to code. For example, writing a test for error catching if a user enters a String instead of an int --- I was able to solve this with try-catch via incremental development but not through TDD.

4) Too reliant with the IDE. Intellij IDE provides a lot of good tips on how to streamline the code --- removing redundancies and unused objects/instances. However, I feel like there were some IDE-suggested fixes that I applied without understanding how their recommended changes worked.

###########################

ABANDONED FEATURES:

-Muscle Groups Instead of Body Parts (i.e. triceps, biceps, glutes, lower abdomen, upper abdomen) ##
  *too many muscle groups and duplicate workouts*
  
-Interactive GUI - Click On Body Part ##
  *too difficult*
  
-Select multiple body parts/muscle groups to create a workout plan, specify the number of workouts per selected body part/muscle group ##
  *this was partially working but was too buggy and too difficult to create tests for TDD*
  
-Close Program / Run Again / Randomize Again prompt ##
  *partially working but had too many bugs and possible errors to catch, also difficult to test*
  
-File Handling - Create and Save Profile, Add/Remove workouts ##
  *too advance for my current skill level*
  
 ##########################
 
 BUGS:
 
 -Most stable build, no bugs and errors due to error-catchers and limited features (and limiting input)
