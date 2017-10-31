/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program to calculate a rectangle's area and perimeter
 * @author MILTON PRO
 */
public class Exercise_8_1_Class {
    private double length;
    private double width;

    // constructor
    public Exercise_8_1_Class(){
        setLength(1.0f);
        setWidth(1.0f);
    }
    public Exercise_8_1_Class(double length, double width){
        setLength(length);
        setWidth(width);
    }
    // SETTERS
    public void setLength(double length){
        if(length >= 0.0f && length <=20.0f)
            this.length = length;
        else
            throw new IllegalArgumentException("length must be between 0.0 and 20.0");
    }
    public void setWidth(double width){
        if(width >= 0.0f && width <= 20.0f)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be between 0.0 and 20.0");
    }
    // GETTERS
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    // calculate perimiter
    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }
    // calculate area
    public double getArea(){
        return length * width;
    }
    // convert length, width, area and perimiter to string
    public String toString(){
        return String.format(
                "Width: %.2f\nLength: %.2f\nArea: %.2f\nPerimeter: %.2f\n",
                getLength(), getWidth(), getArea(), getPerimeter());
    }
}
