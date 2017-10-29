/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Modified program for printing a diamond using asterisks
 * @author MILTON PRO
 */
public class Exercise_5_14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number: ");
        int i = sc.nextInt();

        int half = (i / 2) + 1;
        int extra = 0;

        // top half
        for(i=1; i<half; i++){
            // blank spaces
            for(int j=half - i; j>0; j--){
                System.out.print(' ');
            }
            for(int k=0; k<i + extra; k++){
                System.out.print('*');
            }
            System.out.println();
            extra++;
        }

        // bottom half
        for(i=half; i>=0; i--){
            // blank spaces
            for(int j=0; j<half - i; j++){
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
