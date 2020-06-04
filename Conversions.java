/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BudgetUI;

/**
 *
 * @author melissacmitchell
 */
//utility class to convert between integer and string representations of months
public class Conversions {
    
    static public int convertStringToMonth(String monthAsString) {
        int month;
        
        //switch statement converts month as a string to a numeric value
        switch (monthAsString) {
            case "January":
                month = 1;
                break;
            case "February":
                month = 2;
                break;
            case "March":
                month = 3;
                break;
            case "April":
                month = 4;
                break;
            case "May":
                month = 5;
                break;
            case "June":
                month = 6;
                break;
            case "July":
                month = 7;
                break;
            case "August":
                month = 8;
                break;
            case "September":
                month = 9;
                break;
            case "October":
                month = 10;
                break;
            case "November":
                month = 11;
                break;
            case "December":
                month = 12;
                break;
            default:
                System.out.println("Something bad happened, defaulting month to 1.");
                month = 1;
                break;
        }

        return month;
    }
    
        static public String convertMonthToString(int month) {
        String monthAsString;
        
        //switch statement converts month as a string to a numeric value
        switch (month) {
            case 1:
                monthAsString = "January";
                break;
            case 2:
                monthAsString = "February";
                break;
            case 3:
                monthAsString = "March";
                break;
            case 4:
                monthAsString = "April";
                break;
            case 5:
                monthAsString = "May";
                break;
            case 6:
                monthAsString = "June";
                break;
            case 7:
                monthAsString = "July";
                break;
            case 8:
                monthAsString = "August";
                break;
            case 9:
                monthAsString = "September";
                break;
            case 10:
                monthAsString = "October";
                break;
            case 11:
                monthAsString = "November";
                break;
            case 12:
                monthAsString = "December";
                break;
            default:
                System.out.println("Something bad happened, defaulting month to January");
                monthAsString = "January";
                break;
        }

        return monthAsString;
    }
}
