/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program to display command line arguments
 * @author MILTON PRO
 */
public class Exercise_7_4 {
    public static void main(String[] args){
        int[] array;

        array = new int[(args.length == 1) ? Integer.parseInt(args[0]) : 10];

        System.out.printf("%s%8s\n", "Index", "Value");

        // output each elements array value
        for(int counter=0; counter<array.length; counter++){
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }
}
