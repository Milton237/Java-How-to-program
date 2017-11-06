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
public class PieceWorker extends Employee{
    private double wage;
    private double pieces;

    // constructor
    public PieceWorker(String first, String last, String ssn,
            double wage, double pieces, int month, int day, int year){
        super(first, last, ssn, month, day, year);

        setWage(wage);
        setPieces(pieces);
    }
    // SETTERS
    public void setWage(double w){
        if(w >= 0.0f)
            this.wage = w;
        else
            throw new IllegalArgumentException(
                    "Wage must be >= 0.0f");
    }
    public void setPieces(double p){
        if(p >= 0.0f)
            this.pieces = p;
        else
            throw new IllegalArgumentException(
                    "Pieces must be >= 0.0f");
    }
    // GETTERS
    public double getWage(){
        return this.wage;
    }
    public double getPieces(){
        return this.pieces;
    }
    // calculate earnings; override abstract method in Employee
    @Override
    public double earnings(){
        return getPieces() * getWage();
    }
    // String representation of object
    @Override
    public String toString(){
        return String.format("piece worker: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "wage", getWage(),
                "pieces produced", getPieces());
    }
}

