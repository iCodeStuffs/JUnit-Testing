package days;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Days {
    
    static Date d1 = new Date(2009, 12, 25);
    static Date d2 = new Date(2010, 12, 25);
    static Date d3 = new Date(1980, 12, 25);

    public static void main(String[] args) {
        
        Result result = JUnitCore.runClasses(days.Days.class);
		
        for (Failure failure : result.getFailures()) {
             System.out.println(failure.toString());
        }
    }
    
    @Test
    public void test(){
        assertEquals(400, d1.daysTo(d2));
    }
    
    @Test
    public void test2(){
        assertEquals(200, d3.daysTo(d2));
    }
    
    @Test
    public void test3(){
        assertEquals(10000, d3.daysTo(d1));
    }
}
