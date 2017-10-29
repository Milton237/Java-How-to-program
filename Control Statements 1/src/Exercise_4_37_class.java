/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Exercise_4_37_class {
    // ensure number is of length 4
    public boolean validate(int value){
        return (Integer.toString(value).length() == 4) ? true : false;
    }
    // 1. Replace each digit with the result of adding 7 to it and getting the
    //    remainder after dividing the new value by 10
    public int encrypt(int value){
        int arrValue[] = new int[4];

        // split int into array
        // countdown so as to not reverse the original order
        for(int i=3; i>=0; i--){
            arrValue[i] = value % 10;
            value /= 10;
        }

        arrValue = swapDigits(arrValue);

        for(int i=0; i<4; i++){
            arrValue[i] = (arrValue[i] + 7) % 10;
        }

       return toInt(arrValue);
    }
    public int decrypt(int value){
        int arrValue[] = new int[4];

        // split int into array
        // countdown so as to not reverse the original order
        for(int i=3; i>=0; i--){
            arrValue[i] = value % 10;
            value /= 10;
        }

        // swapping returns to original order
        arrValue = swapDigits(arrValue);

        // decrypt originally ordered values
        for(int i=0; i<4; i++){
            arrValue[i] = (((arrValue[i] + 10) - 7) % 10);
        }

        return toInt(arrValue);
    }
    // 2. swap the first and third, second and fourth digits
    private int[] swapDigits(int[] arrValue){
        // swap first with third
        int tempValue = arrValue[0];
        arrValue[0] = arrValue[2];
        arrValue[2] = tempValue;

        // swap second with fourth
        tempValue = arrValue[1];
        arrValue[1] = arrValue[3];
        arrValue[3] = tempValue;

        return arrValue;
    }
    // 3. convert int[] to int for easy printing
    private int toInt(int[] arrValue){
        // convert int[] to int
        StringBuilder temp = new StringBuilder();

        for(int i=0; i<arrValue.length; i++){
            temp.append(arrValue[i]);
        }

        return Integer.parseInt(temp.toString());
    }
}
