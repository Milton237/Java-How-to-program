/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Exercise_8_4_Test {
    public static void main(String[] args){
        Exercise_8_4_Class t1 = new Exercise_8_4_Class();             // 00:00:00
        Exercise_8_4_Class t2 = new Exercise_8_4_Class(2);            // 02:00:00
        Exercise_8_4_Class t3 = new Exercise_8_4_Class(21, 34);       // 21:34:00
        Exercise_8_4_Class t4 = new Exercise_8_4_Class(12, 25, 42);   // 12:25:42
        Exercise_8_4_Class t5 = new Exercise_8_4_Class(t4);           // 12:25:42
        Exercise_8_4_Class t7 = new Exercise_8_4_Class(22, 58, 59);   // 22:58:59

        System.out.println("Constructed with: ");
        System.out.println("t1: all arguments defaulted");
        System.out.printf("     %s\n", t1.toUniversalString());
        System.out.printf("     %s\n", t1.toString());

        System.out.println("t2: hour specified: minute and second defaulted");
        System.out.printf("     %s\n", t2.toUniversalString());
        System.out.printf("     %s\n", t2.toString());

        System.out.println("t3: hour and minute specified: second defaulted");
        System.out.printf("     %s\n", t3.toUniversalString());
        System.out.printf("     %s\n", t3.toString());

        System.out.println("t4: hour, minute and second specified");
        System.out.printf("     %s\n", t4.toUniversalString());
        System.out.printf("     %s\n", t4.toString());

        System.out.println("t5: Time2Enhanced object t4 specified");
        System.out.printf("     %s\n", t5.toUniversalString());
        System.out.printf("     %s\n", t5.toString());

        System.out.println("t7: hour, minute and second specified");
        System.out.printf("     %s\n", t7.toUniversalString());
        System.out.printf("     %s\n", t7.toString());

        System.out.println("t7: increment hour(1) and minute(2)");
        t7.incrementHour();
        System.out.printf("     %s\n", t7.toUniversalString());
        System.out.printf("     %s\n", t7.toString());

        t7.incrementMinute();
        t7.incrementMinute();

        System.out.printf("     %s\n", t7.toUniversalString());
        System.out.printf("     %s\n", t7.toString());


        // sttempt to initialise t6 with invalid values
        try{
            Exercise_8_4_Class t6 = new Exercise_8_4_Class(27, 74, 99);
        }catch(IllegalArgumentException e){
            System.out.printf("\nException while initialising t6: %s\n",
                    e.getMessage());
        }
    }
}
