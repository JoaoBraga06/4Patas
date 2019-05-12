/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author joaop
 */
public class Date {
    /**
     * Current year
     */
    private static int current_year=2019;
    
    /**
     * Day
     */
    private int day;
    
    /**
     * Month
     */
    private int month;
    
    /**
     * Year
     */
    private int year;

    /**
     * Constructor of date
     * 
     * @param day Day
     * @param month Month
     * @param year Year
     */
    public Date(int day, int month, int year) {
        if(this.verifyDay(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else{
            this.day = 0;
            this.month = 0;
            this.year = 0;  
        }
    }
    
    /**
     * Verify the date
     * 
     * @param day Day
     * @param month Month
     * @return Sucess
     */
    private boolean verifyDay(int day,int month,int year){
        if(day<=0 || day>31 || month<=0 || month>12 || year<getCurrent_year()){
            return false;
        }
        else{
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                return true;
            }
            else{
                if((month==4 || month==6 || month==9 || month==11) && day<=30){
                    return true;
                }
                else{
                    if(month==2 && day<=29){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
    }

    /**
     * @return the current_year
     */
    public static int getCurrent_year() {
        return current_year;
    }

    /**
     * @param aCurrent_year the current_year to set
     */
    public static void setCurrent_year(int aCurrent_year) {
        current_year = aCurrent_year;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
}
