/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program reads input from user and calculates the hypotenuse of a triangle
 * @author MILTON PRO
 */
public class Exercise_6_5 {
    public static void main(String[] args){
        // triangle one
        System.out.println("TRIANGLE ONE");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f\n",
                3.0, 4.0, hypotenuse(3.0, 4.0));

        // triangle two
        System.out.println("TRIANGLE TWO");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f\n",
                5.0, 12.0, hypotenuse(5.0, 12.0));

        // triangle three
        System.out.println("TRIANGLE THREE");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f\n",
                8.0, 15.0, hypotenuse(8.0, 15.0));
    }
    public static double hypotenuse(double side1, double side2){
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
