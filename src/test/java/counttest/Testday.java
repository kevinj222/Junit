package counttest;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

import count.Day;

public class Testday 
{
	@Test
	public void cointest1() 
	{
	int expected=3;
	long days;
	LocalDate startdate=LocalDate.of(2023, 1, 1);
	
	LocalDate enddate = LocalDate.of(2023, 6, 20);
	
	days= ChronoUnit.DAYS.between(startdate,enddate);
	int actual=Day.coins(days);
	assertEquals(expected, actual);
	}
}


