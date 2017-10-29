/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Exercise_2_30 {
    public boolean validate(int value){
        return (Integer.toString(value).length() == 5);
    }

    public boolean isPalindrome(int value){
        int arrValue[] = new int[5];

        // split the int
        // countdown so as to not reverse the original order
        for(int i=4; i>=0; i--){
            arrValue[i] = value % 10;
            value /= 10;
        }

        return ((arrValue[0] == arrValue[4]) && (arrValue[1] == arrValue[3]));
    }
}
