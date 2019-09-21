* This class represents a calendar year.
*
* It contains a method that determines if
* the year is a leap year.
*
*/


public class Year{
    
    private int year;


    public Year(int y){
        year = y;
    }   

    public boolean isLeapYear(){
        if (year % 4 == 0) {
        	if (year % 400 == 0) {
        		return true;
        	}
        	if (year % 100 == 0) {
        		return false;
        	}
        return true;
        }
        else 
        	return false;
    }

} 
