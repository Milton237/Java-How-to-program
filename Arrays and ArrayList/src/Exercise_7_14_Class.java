/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
import java.util.Scanner;
import java.util.Arrays;
public class Exercise_7_14_Class {
    private Scanner sc = new Scanner(System.in);

    private final String[] topics = {"Topic 1", "No 2 is important", "This is 3",
                                     "4 is the Greatest", "Topic 5 is sooo cool"};

    private int[][] responses = new int[5][10];
    private int[] totals = new int[5];
    private int[] extremes = new int[2];        // index of lowest and highest

    // constructor
    public Exercise_7_14_Class(){
        reset();
    }
    // run program
    public void run(){
        while(true){
            int choice = getResponse("\n1. Add Participant\n9. Summarise Results\n> ");

            if(choice == 9)
                break;

            pollParticipant();
        }
        summariseResults();
    }
    // poll an individual participant
    private void pollParticipant(){
        printInstructions();

        int vote = 0;

        for(int i=0; i<topics.length; i++){
            System.out.println("\n*********\n");

            while(!(vote > 0)){
                System.out.printf("%d/%d: %s\n", i+1, topics.length, topics[i]);
                System.out.println("1 2 3 4 5 6 7 8 9 10");
                vote = getResponse("> ");

                if(vote > 10){
                    vote = 0;
                }
            }
            responses[i][vote -1] += 1;
            System.out.println("Thank you");
            System.out.printf("Your response of %d for topic %d was recorded\n\n", vote, i+1);
            vote = 0;
        }
    }
    // print instructions
    private void printInstructions(){
        System.out.println("\nBelow you will be asked to rate");
        System.out.println("a series of topics from 1(least important)");
        System.out.println("to 10(most important).\n");
    }
    // summarise results
    private void summariseResults(){
        // header
        System.out.printf("%23d%3d%3d%3d%3d%3d%3d%3d%3d%3d%5s\n",
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "avg");
        // row
        for(int row=0; row<responses.length; row++){
            System.out.printf("%20s  ", topics[row]);
            // columns
            for(int column=0; column<responses[row].length; column++){
                System.out.print(responses[row][column] + "  ");

                // sum row totals
                if(responses[row][column] > 0)
                    totals[row] += responses[row][column] * (column + 1);
            }
            System.out.print(getRowAverage(row));
            System.out.println();
        }
        System.out.println();

        setExtremes();

        System.out.printf("Highest Rated : %s - %2d\n",
                topics[extremes[0]], totals[extremes[0]]);
        System.out.printf("Lowest Rated  : %s - %2d\n",
                topics[extremes[1]], totals[extremes[1]]);

        for(int i=0; i<totals.length; i++){
            System.out.print(totals[i] + " ");
        }
        System.out.println();
    }
    // gets average ratings for each row
    private double getRowAverage(int row){
        return totals[row] / responses[row].length;
    }
    // loop through totals and save index of highest and lowest
    private void setExtremes(){
        // highest
        for(int i=0; i<totals.length; i++){
            int tmp = totals[i];
            // highest
            if(tmp > totals[extremes[0]])
                extremes[0] = i;
            // lowest
            if(tmp < totals[extremes[1]])
                extremes[1] = i;
        }
    }
    // gets input
    private int getResponse(String s){
        System.out.print(s);

        while(!sc.hasNextInt()){
            sc.next();
            System.out.print(s);
        }
        return sc.nextInt();
    }
    // return to base state
    private void reset(){
        for(int[] r : responses)
            Arrays.fill(r, 0);
    }
}
