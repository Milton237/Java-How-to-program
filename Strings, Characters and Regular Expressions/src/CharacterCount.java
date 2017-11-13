/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program counts the number of characters in a string
 * @author MILTON PRO
 */
import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] args) {
        String inputString, str;
        int current, count=0;
        char key;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string: ");
        inputString = input.nextLine();
        System.out.println("Enter character to count: ");
        str=input.nextLine();
        key = str.charAt(0);
        
        current = inputString.indexOf(key, 0);
        while (current !=-1){
            count++;
            current= inputString.indexOf(key, current+1);
            
        }
        System.out.println("Number of "+key+"'s: "+count);
    }
}
