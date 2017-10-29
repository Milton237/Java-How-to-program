/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program to calculate the value of Pi
 * @author MILTON PRO
 */
public class Exercise_5_9 {
    private static final long TERMS = 400000;

    public static void main(String[] args){
        double infiniteSeries = 0.0f;
        boolean sign = true;
        long count = 0;

        for(int i=1; i<=TERMS; i+=2){
            if(i % 2 == 0)
                continue;

            if(sign)
                infiniteSeries += (4.0 / (double)i);
            else
                infiniteSeries -= (4.0 / (double)i);

            System.out.printf("%d. i = %d, infiniteSeries = %f\n", ++count, i, infiniteSeries);
            sign = !sign;
        }

        System.out.printf("PI calculated from the infinite series 20,000 times: %f\n",
                infiniteSeries);
    }
}
