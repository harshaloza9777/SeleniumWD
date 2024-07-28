package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTCExample extends BaseClass{

	
	
	@Test
	public void TC_02() {
	System.out.println("Inside 02");
	}
	
	@Test
	public void TC_03() {
		System.out.println("Inside 03");	
	}
	@Test
	public void TC_04() {
		System.out.println("Inside 04");	
	}
}
