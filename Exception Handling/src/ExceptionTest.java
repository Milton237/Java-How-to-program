/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
import java.io.IOException;


public class ExceptionTest{
    public static void main(String[] args){

        try{
            throw new ExceptionA();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        try{
            throw new ExceptionB();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        try{
            throw new NullPointerException();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        
        try{
            throw new IOException();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

}
