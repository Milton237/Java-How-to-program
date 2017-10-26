/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class HeartRates {
    private String fName;
    private String lName;
    private int year;
    private int month;
    private int day;
    
    public HeartRates(String fName, String lName, int day, int month, int year){
        this.fName = fName;
        this.lName = lName;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getMaximumHeartRate(){
        int age = 2017 - this.year;
        int maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }
    
    public double targetHeartRate(){
        double targetheartRate = 50 - ((85 / 100) * this.getMaximumHeartRate());
        return targetheartRate;
    }
    
    public void setFirstname(String fName){
        this.fName = fName;
    }
    
    public void setlastName(String lName){
        this.lName = lName;
    }
    
    public String getFirstName(){
        return this.fName;
    }
    
    public String getLastName(){
        return this.lName;
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
    
}
