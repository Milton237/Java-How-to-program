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
public class Triangle extends TwoDimensionalShape{
    // constructor
    public Triangle(double length, double width){
        super(length, width);
    }
    // GETTERS
    @Override
    public double getArea(){
        return 0.5 * super.getWidth() * super.getLength();
    }
    // String representation
    @Override
    public String toString(){
        return String.format("%s: %.2f\n",
                "Area", getArea());
    }
}
