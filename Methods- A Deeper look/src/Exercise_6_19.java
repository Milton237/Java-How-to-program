/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program simulates coin tossing
 * @author MILTON PRO
 */
import java.util.Scanner;
import java.util.Random;
public class Exercise_6_19 {
    private static final Random randomFlips = new Random();

    private enum Coin{HEADS, TAILS};

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // 0 heads 1 tails
        int[] flips = new int[2];
        int count = 0;

        while(true){
            System.out.println("\n1. Toss Coin");
            System.out.println("9. exit");

            if(input.nextInt() == 9)
                break;

            // flip the coin
            switch(flip()){
                case HEADS:
                    flips[0] += 1;
                    break;
                case TAILS:
                    flips[1] += 1;
                    break;
                default:
                    break;
            }
            count++;
        }

        System.out.printf("%d throws. HEADS: %d. TAILS: %d\n",
                count, flips[0], flips[1]);
    }
    public static Coin flip(){
        return (randomFlips.nextInt(2) == 0) ? Coin.HEADS : Coin.TAILS;
    }
}
