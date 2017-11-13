/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Program shows a constructor passing information about constructor failure
 * to an exception handler
 * @author MILTON PRO
 */
public class SomeClassTest {
    public static void main(String[] args) {
        SomeClass someclass;
        try{
            someclass = new SomeClass();
        }
        catch(Exception e){
            System.out.println("Exception: " + e.toString());
        }
    }
    
}
