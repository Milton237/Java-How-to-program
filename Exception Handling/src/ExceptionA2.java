/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Order of catch blocks
 * @author MILTON PRO
 */
public class ExceptionA2 extends Exception{

    // constructor
    public ExceptionA2(String message){
        super(message);
    }

    ExceptionA2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}