/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program determines if the number is a prime number or not
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_6_15 {
    public static void main(String[] args){
        int count = 0;
        for(int i=2; i<10000; i++){
            if(isPrime(i)){
                System.out.printf("%d, ", i);
                count++;
            }
            if(count == 10){
                count = 0;
                System.out.println();
            }
        }
        System.out.println();
    }
    public static boolean isPrime(int n){
        for(int i=2; 2*i<n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static boolean isPrimeRefined(int n){
        for(int i=2; i<Math.sqrt(n); i++){
            if(Math.sqrt(n) % i == 0)
                return false;
        }
        return true;
    }
}
