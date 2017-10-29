/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program reads the first integers entered by the user and determines if its a
 * palindrome or not
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_2_30_Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise_2_30 pali = new Exercise_2_30();

        while(true){
            System.out.print("Enter a 5 digit number to test: ");
            int testCase = input.nextInt();

            if(pali.validate(testCase)){
                if(pali.isPalindrome(testCase))
                    System.out.printf("%s is a palindrone.\n", testCase);
                else
                    System.out.printf("%s is not a palindrone.\n", testCase);
                break;
            }
        }
    }
}
