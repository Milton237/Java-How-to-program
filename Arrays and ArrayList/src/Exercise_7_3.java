/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program calculates the product of a series of integers passed to a method
 * using a variable argument list
 * @author MILTON PRO
 */
public class Exercise_7_3 {
     public static void main(String[] args){

        System.out.printf("12 * 53 * 32 * 1 * 9 * 5 = %d\n",
                variableProduct(12, 53, 32, 1, 9, 5));

        System.out.printf("2 * 2 * 2 = %d\n",
                variableProduct(2, 2, 2));

        System.out.printf("3 * 3 = %d\n",
                variableProduct(3, 3));

        System.out.printf("1 * 0 = %d\n",
                variableProduct(1));
    }
    // returns the product of the arguments
    public static int variableProduct(int... args){
        for(int i=1; i<args.length; i++){
            args[0] *= args[i];
        }
        return args[0];
    }
}
