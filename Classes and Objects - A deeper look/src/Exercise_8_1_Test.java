/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program to test the methods defined in the rectangle class
 * @author MILTON PRO
 */
public class Exercise_8_1_Test {
    public static void main(String[] args){
        // default constructor
        Exercise_8_1_Class rect1 = new Exercise_8_1_Class();

        rect1.setLength(2.0f);
        rect1.setWidth(8.0f);

        // constructor with values
        Exercise_8_1_Class rect2 = new Exercise_8_1_Class(4.0f, 3.0f);

        System.out.println("rect1 default constructor");
        System.out.printf("%s\n", rect1.toString());

        System.out.println("rect2 constructed with width and length");
        System.out.printf("%s\n", rect2.toString());

        // constructor with invalid values
        try{
            Exercise_8_1_Class rect3 = new Exercise_8_1_Class(40.0f, -1.0f);
        }catch(IllegalArgumentException e){
            System.out.printf("\nException while initialising rect3: %s\n",
                    e.getMessage());
        }
    }
}
