/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program calculates the factorial of 1 through 20
 * @author MILTON PRO
 */
public class Exercise_5_3 {
    public static void main(String[] args){
        for(int i=0; i<20; i++){
            System.out.printf("%d\n", getFactorial(i));
        }
    }
    private static long getFactorial(int x){
        long factorial = x;

        if(x > 1)
            x--;

        while(x > 0){
            factorial *= x;
            x--;
        }
        return factorial;
    }
}
