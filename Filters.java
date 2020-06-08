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

//filters
public class Filters {
    
    //checks whether transaction passes transaction filter
    static public boolean passesTransactionFilter(Transaction transaction, DisplayFilter displayFilter) {
        boolean boolToReturn = false;
        
        switch (displayFilter) {
            case Both:
                boolToReturn = true;
                break;
            case Single:
                if (!transaction.getRecurring()) {
                    boolToReturn = true;
                }
                break;
            case Recurring:
                if (transaction.getRecurring()) {
                    boolToReturn = true;
                }
                break;
        }  
        
        return boolToReturn;
    }

    //passes the category filter
    static public boolean passesCategoryFilter(Transaction transaction, 
            Category category) {
        
        boolean boolToReturn = false;
        
        if (category == null) {
            boolToReturn = true;
        } else if (transaction.category == category) {
            boolToReturn = true;
        }
         
        return boolToReturn;
    }

    //passes the month filter
    static public boolean passesMonthFilter(Transaction transaction, 
            int month) {
        
        boolean boolToReturn = false;
        
        if (month == -1) {
            boolToReturn = true;
        } else if (transaction.month == month) {
            boolToReturn = true;
        }
         
        return boolToReturn;
    }

    //passes the year filter
    static public boolean passesYearFilter(Transaction transaction, 
            int year) {
        
        boolean boolToReturn = false;
        
        if (year == -1) {
            boolToReturn = true;
        } else if (transaction.year == year) {
            boolToReturn = true;
        }
         
        return boolToReturn;
    }
}
