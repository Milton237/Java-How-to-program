/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Exercise_8_6_Test {
     public static void main(String[] args){
        for(Exercise_8_6_Class trafficLight : Exercise_8_6_Class.values())
            System.out.printf("%s - %d\n", trafficLight, trafficLight.getDuration());
    }
}
