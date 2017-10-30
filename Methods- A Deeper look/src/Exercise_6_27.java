/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *A computer-assisted instruction system to monitor the performance of
 * a student over time
 * @author MILTON PRO
 */
import java.util.Random;
import java.util.ArrayList;
public class Exercise_6_27 {
     private Random randomGenerator = new Random();

    private ArrayList<String> success = new ArrayList<String>();
    private ArrayList<String> failure = new ArrayList<String>();

    private int[] values = new int[2];
    private int results = 0;

    // constructor
    public Exercise_6_27(){
        success.add("Very Good!");
        success.add("Excellent!");
        success.add("You go girlfriend!!");
        success.add("Nice Work!");
        success.add("Keep up the good work!");

        failure.add("No. Please try again.");
        failure.add("Wrong. Try once more.");
        failure.add("Oh well, we can't all be clever.");
        failure.add("Don't give up.");
        failure.add("No. Keep trying.");

        setQuestion();
    }
    // SETTERS
    // sets and stores 2 random digits (the question)
    private void setQuestion(){
        values[0] = randomGenerator.nextInt(9);
        values[1] = randomGenerator.nextInt(9);
    }
    // GETTERS
    public void getQuestion(){
        System.out.printf("How much is %d times %d? ", values[0], values[1]);
    }
    public void getResults(){
        System.out.printf("You scored %d out of 10.\n", results);

        if(results >= (10 * 0.75)){
            System.out.println("Congratulations you are ready to go the next level!");
        }else{
            System.out.println("Please ask your teacher for extra help.");
        }
    }
    // Resets the question params and prints the new question
    public void newQuestion(){
        setQuestion();
        getQuestion();
    }
    // checks the answer, prints appropriate response and either reiterates or
    // resets the question
    public void checkAnswer(int answer){
        if(answer == values[0] * values[1]){
            System.out.println(success.get(randomGenerator.nextInt(success.size())));
            setQuestion();
            ++results;
        }else{
            System.out.println(failure.get(randomGenerator.nextInt(failure.size())));
        }
    }
    // resets the count and starts a new round
    public void reset(){
        results = 0;
        setQuestion();
    }
}
