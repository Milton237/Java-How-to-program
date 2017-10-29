/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program uses several patterns of asterisks to display triangles
 * @author MILTON PRO
 */
public class Exercise_5_5 {
    public static void main(String[] args){
        // Pattern A
        for(int i=0; i<10; i++){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Pattern B
        for(int i=10; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Pattern C
        for(int i=10; i>=0; i--){
            // blank spaces
            for(int j=0; j<10 - i; j++){
                System.out.print(' ');
            }
            for(int k=0; k<i; k++){
                System.out.print('*');
            }
            System.out.println();
        }

        // Pattern D
        for(int i=1; i<=10; i++){
            // blank spaces
           for(int j=10 - i; j>0; j--){
                System.out.print(' ');
            }
            for(int k=0; k<i; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
