/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Exercise_8_5_Test {
     public static void main(String[] args){
        final int END_DATE = 10000;

        Exercise_8_5_Class date = new Exercise_8_5_Class(11, 29, 2015);

        do{
            try{
                date.nextDay();
            }catch(IllegalArgumentException e){
                System.out.printf("Error fetching next day: %s\n", e.getMessage());
                break;
            }

            System.out.printf("%s\n", date.toString());
        }while(date.getYear() != END_DATE);
    }
}
