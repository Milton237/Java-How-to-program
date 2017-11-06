/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism.and.interfaces;

/**
 *
 * @author MILTON PRO
 */
public class Shape {
    private double length;
    private double width;

    // constructor
    public Shape(){
        setLength(0.0f);
        setWidth(0.0f);
    }
    public Shape(double length){
        setLength(length);
        setWidth(0.0f);
    }
    public Shape(double length, double width){
        setLength(length);
        setWidth(width);
    }
    // SETTERS
    public void setLength(double len){
        if(len >= 0.0f)
            this.length = len;
        else
            throw new IllegalArgumentException("Length must be >= 0.0f");
    }
    public void setWidth(double wid){
        if(wid >= 0.0f)
            this.width = wid;
        else
            throw new IllegalArgumentException("Width must be >= 0.0f");
    }
    // GETTERS
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    // ABSTRACT METHODS
    // get area
    public abstract double getArea();
}
