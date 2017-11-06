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
public class Sphere extends ThreeDimensionalShape{
    // constructor
    public Sphere(double radius){
        super(radius);
    }
    // GETTERS
    // surface area
    @Override
    public double getArea(){
        return 4.0f * Math.PI * Math.pow(super.getLength(), 2);
        //return Math.PI * Math.pow(super.getLength(), 2);
    }
    @Override
    public double getVolume(){
        return (4.0f / 3.0f) * Math.PI * Math.pow(super.getLength(), 3);
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("%s: %.2f\n%s:%.2f\n",
                "Area", getArea(), "Volume", getVolume());
    }
}
