/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program determines whether a number is a perfect number of not
 * @author MILTON PRO
 */
public class Exercise_6_14 {
    public static void main(String[] args){

        for(int i=0; i<1000000; i++){
            if(isPerfect(i)){
                System.out.printf("%d: ", i);
                printFactors(i);
            }
        }
    }
    // check if the temp value composed of perfect divisors is equal to the
    // original number
    public static boolean isPerfect(int number){
        int temp = 0;
        for(int i=1; i<=number/2; i++){
            if(number % i == 0)
                temp +=i;
        }
        return (temp == number) ? true : false;
    }
    // loop and return perfect divisors (factors)
    public static void printFactors(int number){
        for(int i=1; i<=number; i++){
            if(number % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
