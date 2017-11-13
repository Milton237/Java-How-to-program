/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class ExceptionA3 {
    public static void main(String[] args) {
    try {
        ExceptionB3.throwExceptionB();
    }
    catch (Exception e) {
        System.err.printf("%s%n%n", e.getMessage());
    }
}
    
}