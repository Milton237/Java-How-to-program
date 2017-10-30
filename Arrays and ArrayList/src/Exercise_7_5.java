/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program illustrated the enhanced for statement
 * @author MILTON PRO
 */

public class Exercise_7_5 {
    public static void main(String[] args){

        double total = 0.0f;

        for(String arg : args)
            total += Double.parseDouble(arg);

        System.out.println("Total: " + total);
    }
}
