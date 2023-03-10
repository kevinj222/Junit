package count;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Day
{
public static int coins(long day)
{
	int coin=0;
	if(day<=80)
	{
		coin=5;
	}
	else if(day>80 && day<=172)
		{
			coin=3;
		}
	else if(day>172 && day<=266)
	{
		coin=1;
	}
	else
	{
		coin=0;
	}
	return coin;	
}
public static void main(String args[])
{
	
	LocalDate st = LocalDate.of(2022,01,01);
	Scanner sc=new Scanner(System.in);
	LocalDate end = LocalDate.of(2022,6,21);
	long day= ChronoUnit.DAYS.between(st,end);
	int gold=coins(day);
	System.out.println(gold);
	
}
}