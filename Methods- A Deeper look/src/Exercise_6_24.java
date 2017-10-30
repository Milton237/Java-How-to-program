/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program displays the binary, octal and hexadecimal equivalents of
 * decimal numbers
 * @author MILTON PRO
 */
import java.util.ArrayList;
public class Exercise_6_24 {
    public static void main(String[] args){
        System.out.println("Decimal\t\tBinary\t\tOctal\t\tHexadecimal");

        for(int i=1; i<=256; i++){
            System.out.printf("%d\t\t%s\t\t%s\t\t%s\n",
                    i, decimalToBinary(i), decimalToOctal(i), decimalToHex(i));
        }
    }
    // Binary - Base 2
    public static String decimalToBinary(int decimal){
        ArrayList<Integer> binary = new ArrayList<Integer>();
        String strBinary = "";

        // modulus and divide by 2 to get correct 2's place values
        while(decimal > 0){
            binary.add(decimal % 2);
            decimal /= 2;
        }

        // reverse the result and construct string
        for(int i=binary.size() - 1; i>=0; i--){
            strBinary += binary.get(i);
        }

        return strBinary;
    }
    // Octal - Base 8
    public static String decimalToOctal(int decimal){
        ArrayList<Integer> octal = new ArrayList<Integer>();
        String strOctal = "";

        // modulus and divide by 8 to get correct 8's place value
        while(decimal > 0){
            octal.add(decimal % 8);
            decimal /= 8;
        }

        // reverse the result and construct string
        for(int i=octal.size() - 1; i>=0; i--){
            strOctal += octal.get(i);
        }

        return strOctal;
    }
    // Hexadecimal - Base 16
    public static String decimalToHex(int decimal){
        ArrayList<Character> hexadecimal = new ArrayList<Character>();

        // hexadecimal digits
        // stored as an array so int remainder can be used to index the
        // correct value.
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                            'A', 'B', 'C', 'D', 'E', 'F'};
        String strHex = "";

        while(decimal > 0){
            hexadecimal.add(hexDigits[decimal % 16]);
            decimal /= 16;
        }

        // reverse the result and construct a string
        for(int i=hexadecimal.size() -1; i>=0; i--){
            strHex += hexadecimal.get(i);
        }

        return strHex;
    }
}
