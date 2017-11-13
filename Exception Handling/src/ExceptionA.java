/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Catching exception using class exception
 * @author MILTON PRO
 */
public class ExceptionA extends Exception{

    // constructor
    public ExceptionA(String message){
        super(message);
    }

    ExceptionA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}