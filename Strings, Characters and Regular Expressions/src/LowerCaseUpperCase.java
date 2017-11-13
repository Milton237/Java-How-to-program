/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program converts a string entered by the user to lower case or upper case
 * @author MILTON PRO
 */
import java.util.Scanner;
public class LowerCaseUpperCase {
    public static void main(String[] args) {
        String in, upper, lower;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        in = input.nextLine();
        upper = in.toUpperCase();
        lower = in.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
    }
}
