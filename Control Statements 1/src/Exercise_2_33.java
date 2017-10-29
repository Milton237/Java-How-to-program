/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program prints the multiples of two in an infinite loop
 * @author MILTON PRO
 */
public class Exercise_2_33 {
    public static void main(String[] args){
        int x = 2;

        while(true){
            System.out.printf("%d\n", x *= 2);
        }
    }
}
