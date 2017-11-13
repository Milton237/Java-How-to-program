/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class ExceptionB3 extends ExceptionA3 {
    public static void throwExceptionB() throws Exception {    
    try {
        ExceptionC3.throwNewException();
    }    
    catch (Exception e) {
            System.err.println("Exception caught in method ExceptionB from ExceptionC");
            throw new Exception("Exception thrown to ExceptionA");
    }
}
}
