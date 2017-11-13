/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program reverses a string entered by the user
 * @author MILTON PRO
 */
import java.util.Scanner;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String stringToToken;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to be reversed: ");
        stringToToken = input.nextLine();
        StringTokenizer tokens = new StringTokenizer(stringToToken);
        int count = tokens.countTokens();
        String reverse[] = new String[count];
        int index = count-1;
        
        while (tokens.hasMoreTokens()){
            reverse[index--] = tokens.nextToken();
        }
            
            for (int i =0; i <count; i++){
                System.out.print(" "+ reverse[i]+" ");
            }
        
    }
}
