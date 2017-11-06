/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
import java.util.Scanner;

public class InputManager{
    private Scanner sc;

    // CONSTRUCTOR
    public InputManager(){
        sc = new Scanner(System.in);
    }
    // returns an integer value entered by the user
    public int getIntInput(){
        return sc.nextInt();
    }
    public char getCharInput(){
        return sc.next().charAt(0);
    }
}

