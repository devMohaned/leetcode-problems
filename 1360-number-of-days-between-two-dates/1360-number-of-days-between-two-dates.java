import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
    //Parsing the date
	LocalDate dateBefore = LocalDate.parse(date1);
	LocalDate dateAfter = LocalDate.parse(date2);
		
	//calculating number of days in between
	long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        if(noOfDaysBetween < 0)
            noOfDaysBetween *= -1;
        
        return (int) noOfDaysBetween;
        
    }
}