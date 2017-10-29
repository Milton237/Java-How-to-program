/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program defines a scheme for encrypting and decrypting data
 * @author MILTON PRO
 */
import java.util.Scanner;
public class Exercise_4_37_Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercise_4_37_class encrypt = new Exercise_4_37_class();

        int value = requestInput("Enter a 4 digit number for encryption: ", input);

        while(encrypt.validate(value) != true){
            value = requestInput("Enter a 4 digit number for encryption: ", input);
        }
        int encrypted = encrypt.encrypt(value);
        int decrypted = encrypt.decrypt(encrypted);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
    public static int requestInput(String s, Scanner input){
        System.out.print(s);
        return input.nextInt();
    }
}
