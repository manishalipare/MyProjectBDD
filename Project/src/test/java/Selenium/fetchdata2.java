package Selenium;

import org.testng.annotations.Test;

public class fetchdata2 {

	@Test
	public void getData()
	{
		
		String id1 = fetchData.GetData("./resources/testdata.xlsx", "Sheet2", 2, 0);
		System.out.println(id1);
	}
}
