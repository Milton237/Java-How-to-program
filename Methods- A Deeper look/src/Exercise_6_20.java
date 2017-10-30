/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program plays the "Guess the number" game
 * @author MILTON PRO
 */
import java.util.Scanner;
import java.util.Random;
public class Exercise_6_20 {
     private enum Status{PLAY, EXIT, WON};

    private static final Random randomGenerator = new Random();

    private static Status gameStatus = Status.PLAY;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        while(gameStatus != Status.EXIT){

            playGame();

            System.out.print("Play Again? (y/n)");

            gameStatus = (sc.next().charAt(0) == 'n') ? Status.EXIT : Status.PLAY;
        }
    }
    public static void playGame(){
        int number = randomGenerator.nextInt(1000);

        while(gameStatus != Status.WON){

            System.out.print("Guess a number between 1 and 1000: ");
            int guess = sc.nextInt();

            if(guess == number){
                System.out.println("Congratulations. You guessed the number!");
                gameStatus = Status.WON;
            }

            if(guess > number){
                System.out.println("Too high try again...\n");
            }else{
                System.out.println("Too low try again...\n");
            }
        }
    }
}
