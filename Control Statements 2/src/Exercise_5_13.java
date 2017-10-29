/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program prints a diamond using asterisks
 * @author MILTON PRO
 */
public class Exercise_5_13 {
    public static void main(String[] args){
        // 2nd half of each half
        int extra = 0;

        // top half
        for(int i=1; i<5; i++){
            // blank spaces
            for(int j=5 - i; j>0; j--){
                System.out.print(' ');
            }
            for(int k=0; k<i + extra; k++){
                System.out.print('*');
            }
            System.out.println();
            extra++;
        }

        // bottom half
        for(int i=5; i>=0; i--){
            // blank spaces
            for(int j=0; j<5 - i; j++){
                System.out.print(' ');
            }
            for(int k=0; k<i + extra; k++){
                System.out.print('*');
            }
            System.out.println();
            extra--;
        }
    }
}
