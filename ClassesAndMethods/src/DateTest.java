/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */import java.util.Scanner;
public class DateTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Date mydate = new Date(26,10,2017);
        mydate.displayDate();
        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        mydate.setDay(day);
        mydate.setMonth(month);
        mydate.setYear(year);
        System.out.println("");
        mydate.displayDate();
    }
}
