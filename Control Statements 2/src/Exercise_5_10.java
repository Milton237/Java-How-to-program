/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program to display a table of Pythagorean triples
 * @author MILTON PRO
 */
public class Exercise_5_10 {
    public static void main(String[] args){
        int a = 0, b = 0, h = 0;

        System.out.println("Side A\t\tSide B\t\tHypotenuse");
        for(int i=0; i<500; i++){
            checkHypotenuse(++a, b, h);
            for(int j=0; j<500; j++){
                checkHypotenuse(a, ++b, h);
                for(int k=0; k<500; k++){
                    checkHypotenuse(a, b, ++h);
                }
                h = 0;
            }
            b = 0;
        }
    }
    public static void checkHypotenuse(int a, int b, int h){
        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(h, 2))
            printTriple(a, b, h);
    }
    public static void printTriple(int a, int b, int h){
        System.out.printf("%d\t\t%d\t\t%d\n", a, b, h);
    }
}
