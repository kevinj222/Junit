package count;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Freql
{
	public static Map<String, Long> dist(List x)
	{
    Map<String, Long> fmap= (Map<String, Long>) x.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	return fmap ;
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

