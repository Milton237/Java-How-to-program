/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
import java.util.Scanner;
public class LargestNumberTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LargestNumber largest = new LargestNumber();

        for(int i=0; i<10; i++){
            System.out.printf("%d/10. Enter a number: ", i+1);
            largest.enterNumber(sc.nextInt());
        }
        System.out.printf("The largest number is: %d\n", largest.getLargestNumber());
    }
}
