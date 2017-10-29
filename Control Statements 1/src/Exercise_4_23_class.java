/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Exercise_4_23_class {
    private int fLargest = 0, sLargest = 0; // first and second largest

    public void enterNumber(int x){
        if(x > fLargest){
            sLargest = fLargest;
            fLargest = x;
        }else if(x > sLargest){
            sLargest = x;
        }
    }
    public int getFirstLargest(){
        return fLargest;
    }
    public int getSecondLargest(){
        return sLargest;
    }
}
