/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program compares two strings input by the user
 * @author MILTON PRO
 */
import java.io.*;
import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        String first, second;
        int index, num;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        first = input.nextLine();
        System.out.println("Enter the second string: ");
        second = input.nextLine();
        System.out.println("Enter number of characters: ");
        num=input.nextInt();
        System.out.println("Enter starting index: ");
        index=input.nextInt();
        
        
        if (first.regionMatches(true, index, second, index, num)){
            System.out.println("The strings are equivalent.");
        }
        else
            System.out.println("The strings are not equivalent.");
    }
}
