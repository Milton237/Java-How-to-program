/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program prints a checkerboard using a pattern of asterisks
 * @author MILTON PRO
 */
public class Exercise_2_32 {
    public static void main(String[] args){
        for(int i=0; i<8; i++){
            // even lines prepend extra space
            if(i % 2 == 0)
                System.out.print(" ");
            for(int j=0; j<8; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
