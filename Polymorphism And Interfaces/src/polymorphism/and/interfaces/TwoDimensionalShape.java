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
public abstract class TwoDimensionalShape extends Shape{
    // constructor
    public TwoDimensionalShape(){
        super();
    }
    public TwoDimensionalShape(double length){
        super(length);
    }
    public TwoDimensionalShape(double length, double width){
        super(length, width);
    }
    // ABSTRACT METHODS
    // get area
    public abstract double getArea();
}

