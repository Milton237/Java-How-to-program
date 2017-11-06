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
public abstract class ThreeDimensionalShape extends Shape{
    private double height;

    // constructor
    public ThreeDimensionalShape(){
        super();
        setHeight(0);
    }
    public ThreeDimensionalShape(double width){
        super(width);
    }
    public ThreeDimensionalShape(double length, double width){
        super(length, width);
    }
    public ThreeDimensionalShape(double length, double width, double height){
        super(length, width);
        setHeight(height);
    }
    // SETTERS
    public void setHeight(double h){
        this.height = (h > 0.0f) ? h : 0.0f;
    }
    // GETTERS
    public double getHeight(){
        return this.height;
    }
    // ABSTRACT METHODS
    // get area
    public abstract double getArea();
    // get volume
    public abstract double getVolume();
}

