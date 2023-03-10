package counttest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import count.Listdup;

public class Listduptest
{
	@Test
	public void testing()
	{
		List<String>x=new ArrayList<String>();
		x.add("kevin");
		x.add("G");
		x.add("abu");
		x.add("G");
		x.add("sasi");
		x.add("sa");
		long expect=2;
		long actual=Listdup.dist(x);
		assertEquals(expect,actual);
	}

}
