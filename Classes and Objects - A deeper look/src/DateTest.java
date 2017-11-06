/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class DateTest {
    public static void main(String[] args){
        Date d1 = new Date();
        Date d2 = new Date(11, 13, 2016);
        Date d3 = new Date("February", 29, 1988);
        Date d4 = new Date(317, 2015);

        System.out.println("\nFormat A: MM/DD/YYY");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());

        System.out.println("\nFormat B: MONTH DD, YYYY");
        System.out.println(d1.toLongDateString());
        System.out.println(d2.toLongDateString());
        System.out.println(d3.toLongDateString());
        System.out.println(d4.toLongDateString());

        System.out.println("\nFormat C: DDD YYYY");
        System.out.println(d1.toDayOfYearString());
        System.out.println(d2.toDayOfYearString());
        System.out.println(d3.toDayOfYearString());
        System.out.println(d4.toDayOfYearString());
    }
}
