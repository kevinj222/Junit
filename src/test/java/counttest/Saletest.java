package counttest;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import count.SalesDress;
public class Saletest 
{@Test
	public void testing()
	{
	LocalDate expect=LocalDate.of(2022,10,2);
	LocalDate actual=count.SalesDress.v(expect);
	assertEquals(expect,actual);
	
	}

}
