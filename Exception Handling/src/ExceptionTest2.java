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


public class ExceptionTest2{
    public static void main(String[] args){

        try{
            throw new IOException();
        }
        catch (IOException e){
            System.err.println("IOException");
        }
    }
}

