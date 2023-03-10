package count;

import java.util.ArrayList;
import java.util.List;

public class Listdup 
{
	public static long dist(List x)
	{
		String tar="G";
		long ex=x.stream().filter(t->(((String) t).equalsIgnoreCase(tar))).count();
		return ex;
	}
	public static void main(String args[])
	{
	List<String>x=new ArrayList<String>();
	x.add("kevin");
	x.add("G");
	x.add("abu");
	x.add("G");
	x.add("sasi");
	x.add("G");
	System.out.println(dist(x));
	}

}
