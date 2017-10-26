/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Date {
    private int year;
    private int month;
    private int day;
    
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void setMonth(int month){
        this.month = month;
    }
    
    public void setDay(int day){
        this.day = day;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getDay(){
        return this.day;
    }
    
    public void displayDate(){
        System.out.printf("Today's date is: %d/%d/%d%n", this.day, this.month, this.year);
    }
}
