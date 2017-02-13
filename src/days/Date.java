package days;

public class Date{
    
 final int year;
 final int month;
 final int date;

    Date(int year, int month, int date){
        this.year = year;
        this.month = month;
        this.date = date;
    }
    
    public int daysTo(Date time){
        int initialDays;
        initialDays = this.year * 365; //convert years to number of days
        initialDays += (this.month * 30); //convert motnsh to number of days
        initialDays += this.date; //add the date to number of days
        
        int secondaryDays = convertToDays(time);
        
        int daysUntil = secondaryDays - initialDays; //subtract the total # of days
        
        return daysUntil;
    }
    
    public int convertToDays(Date time){
        int numDays;
        
        numDays = time.year * 365; //convert years to number of days
        numDays += (time.month * 30); //convert months to number of days
        numDays += time.date; //add the date to number of days
        
        return numDays;
    }
}
