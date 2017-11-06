/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Exercise_8_6_Class {
    RED(90),
    GREEN(70),
    YELLOW(60);

    // instance field
    private final int duration;

    // constructor
    Exercise_8_6_Class(int duration){
        this.duration = duration;
    }
    // accessor for duration
    public int getDuration(){
        return this.duration;
    }
}
