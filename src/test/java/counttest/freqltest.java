package counttest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import count.Freql;
import count.Listdup;

public class freqltest
{
	@Test
	public void test()
	{
	List<String>y=new ArrayList<String>();
	y.add("kevin");
	y.add("G");
	y.add("abu");
	y.add("G");
	y.add("sasi");
	y.add("G");
	Map<String,Long>exp=new HashMap<String,Long>();
	exp.put("kevin",(long)1);
	exp.put("sasi",(long)1);
	exp.put("abu",(long)1);
	exp.put("G",(long)3);
	Map<String,Long>actual=Freql.dist(y);
	assertEquals(exp,actual);
	
	}
}
