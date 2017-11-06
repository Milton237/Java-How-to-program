/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class ComplexClass {
    private double realPart = 0;
    private double imaginaryPart = 0;

    // default constructor
    public ComplexClass(){
        setRealPart(1);
        setImaginaryPart(1);
    }
    // overloaded constructor
    public ComplexClass(double realPart, double imaginaryPart){
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }
    // SETTERS
    public void setRealPart(double realPart){
        this.realPart = realPart;
    }
    public void setImaginaryPart(double imaginaryPart){
        this.imaginaryPart = imaginaryPart;
    }
    // GETTERS
    public double getRealPart(){
        return this.realPart;
    }
    public double getImaginaryPart(){
        return this.imaginaryPart;
    }
    // add complex numbers
    // returning new complex number
    public static ComplexClass addComplexNumbers(ComplexClass num1, ComplexClass num2){
        return new ComplexClass((num1.getRealPart() + num2.getRealPart()),
                           (num2.getImaginaryPart() + num2.getImaginaryPart()));
    }
    // subtract complex numbers
    // return new complex number
    public static ComplexClass subtractComplexNumbers(ComplexClass num1, ComplexClass num2){
        return new ComplexClass((num1.getRealPart() - num2.getRealPart()),
                           (num1.getImaginaryPart() - num2.getImaginaryPart()));
    }
    // convert to string
    public String toString(){
        return String.format("(%.2f, %.2f)", getRealPart(), getImaginaryPart());
    }
}
