/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program calculates the product of odd integers from 1 -15
 * @author MILTON PRO
 */
public class Exercis_5_2 {
    public static void main(String[] args){
        int product = 1;

        for(int i=0; i<=15; i++){
            if(i % 2 != 0)
                product *= i;
        }
        System.out.printf("The product of the odd integers from 1 to 15 is: %d\n",
                product);
    }
}
