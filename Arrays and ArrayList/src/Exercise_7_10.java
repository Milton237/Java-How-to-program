/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program uses array of 1000 elements to display prime numbers
 * between 2 and 999
 * @author MILTON PRO
 */
import java.util.Arrays;
public class Exercise_7_10 {
    private static final int SAMPLE_SIZE = 1000;
    private static boolean[] arrPrimes= new boolean[SAMPLE_SIZE];

    public static void main(String[] args){
        Arrays.fill(arrPrimes, true);
        arrPrimes[0] = false;
        arrPrimes[1] = false;

        for(int i=0; i<arrPrimes.length; i++){
            // check if arrPrimes is true
            if(arrPrimes[i]){
                // mark false any j multiples of i
                for(int j=i;i*j<arrPrimes.length; j++){
                    arrPrimes[i * j] = false;
                }
            }
        }

        for(int i=0; i<arrPrimes.length; i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
    // check if index is prime (still true)
    public static boolean isPrime(int x){
        return arrPrimes[x];
    }
}
