package count;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SalesDress 
{
	public static void main(String args[])
	{
	HashMap<LocalDate,List>x=new HashMap<LocalDate,List>();
	Sale2 s1=new Sale2("Shirt",10,7500);
	Sale2 s2=new Sale2("Pant",10,9500);
	Sale2 s3=new Sale2("Shoes",2,7500);
	List<Sale2>o=new ArrayList<Sale2>();
	o.add(s1);
	o.add(s2);
	o.add(s3);
	LocalDate l1=LocalDate.of(2022,10,22);
	x.put(l1,o);
	Sale2 s5=new Sale2("Shirt",5,3500);
	Sale2 s6=new Sale2("Pant",8,6500);
	Sale2 s8=new Sale2("Shoes",3,10500);
	Sale2 s7=new Sale2("Socks",10,1500);
	List<Sale2>o1=new ArrayList<Sale2>();
	o1.add(s5);
	o1.add(s6);
	o1.add(s7);
	o1.add(s8);
	LocalDate l2=LocalDate.of(2022,10,25);
	x.put(l2,o1);
	Sale2 se=new Sale2("Socks",5,500);
	Sale2 sr=new Sale2("Tie",3,600);
	Sale2 st=new Sale2("Watch",1,10500);
	Sale2 sy=new Sale2("Bottle",10,12500);
	List<Sale2>o3=Arrays.asList(se,sr,st,sy);
	LocalDate l3=LocalDate.of(2022,10,27);
	x.put(l3,o3);
	System.out.println("Enter the date to list object");
	Scanner sc=new Scanner(System.in);
	int dd=sc.nextInt();
	int mm=sc.nextInt();
	int yy=sc.nextInt();
	LocalDate i=LocalDate.of(yy,mm,dd);
	salee(i, l3, l2, l1, x);
	}
	public static LocalDate v(LocalDate i)
	{
		return i;
		
	}
	public static int salee(LocalDate i,LocalDate l3,LocalDate l2,LocalDate l1,HashMap x)
	{
		
		if(i.equals(l3))
		{
			System.out.println(x.get(v(i)));	
		}
		else if(i.equals(l2))
			{
				System.out.println(x.get(v(i)));	
			}
			else if(i.equals(l1))
		{
			System.out.println(x.get(v(i)));	
		}
			else
			{
			
			System.out.println("false");
			}
		return 1;
	}
}


