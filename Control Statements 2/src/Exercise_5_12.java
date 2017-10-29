/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program to demonstrate De Morgan's Law
 * @author MILTON PRO
 */
import java.util.Random;
public class Exercise_5_12 {
    public static void main(String[] args){

        // randomise the test integers to verify correctness
        Random rand = new Random();

        int a = getNextInt(rand);
        int b = getNextInt(rand);
        int g = getNextInt(rand);
        int i = getNextInt(rand);
        int j = getNextInt(rand);
        int x = getNextInt(rand);
        int y = getNextInt(rand);

        System.out.println("\nRANDOMISED TEST VALUES: ");
        System.out.printf("a = %d, b = %d, g = %d, i = %d, j = %d, x = %d, y = %d\n",
                a, b, g, i, j, x, y);

        // A
        // original - !(x < 5) && !(y >= 7)
        // equivalent - !((x < 5 ) || (y >= 7))
        System.out.println("\nEXPRESSION A\n");
        System.out.printf("!(x < 5) && !(y >= 7)  - %s\n",
                getResult(!(x < 5) && !(y >= 7)));
        System.out.printf("!((x < 5) || (y >= 7)) - %s\n",
                getResult(!((x < 5) || (y >= 7))));

        // B
        // original - !(a == b) || !(g != 5)
        // equivalent - !((a == b) && (g != 5))
        System.out.println("\nEXPRESSION B\n");
        System.out.printf("!(a == b) || !(g != 5)) - %s\n",
                getResult(!(a == b) || !(g != 5)));
        System.out.printf("!((a == b) && (g != 5)) - %s\n",
                getResult(!((a == b) && (g != 5))));

        // C
        // original - !((x <= 8) && (y > 4))
        // equivalent - !(x <= 8) || !(y > 4)
        System.out.println("\nEXPRESSION C\n");
        System.out.printf("!((x <= 8) && (y > 4)) - %s\n",
                getResult(!((x <= 8) && (y > 4))));
        System.out.printf("!(x <= 8) || !(y > 4)  - %s\n",
                getResult(!(x <= 8) || !(y > 4)));

        // D
        // original - !((i > 4) || (j <= 6))
        // equivalent - !(i > 4) && !(j <= 6)
        System.out.println("\nEXPRESSION D\n");
        System.out.printf("!((i > 4) || (j <= 6)) - %s\n",
                getResult(!((i > 4) || (j <= 6))));
        System.out.printf("!(i > 4) && !(j <= 6)  - %s\n",
                getResult(!(i > 4) && !(j <= 6)));
    }
    // easier to change sample size
    public static int getNextInt(Random r){
        return r.nextInt(150);
    }
    // readable expression result
    public static String getResult(boolean expr){
        return expr ? "TRUE": "FALSE";
    }
}
