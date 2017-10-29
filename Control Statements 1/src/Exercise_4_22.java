/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Program prints a set of values in a tabular form
 * @author MILTON PRO
 */
public class Exercise_4_22 {
    public static void main(String[] args){
        System.out.println("N\t\t10*N\t\t100*N\t\t1000*N");

        for(int i=1; i<6; i++){
            System.out.printf("%d\t\t%d0\t\t%d00\t\t%d000\n", i, i, i, i);
        }
    }
}
