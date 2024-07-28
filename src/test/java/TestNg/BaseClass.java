package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	
	@BeforeMethod( alwaysRun = true )
	public void method1() {
		
		System.out.println("inside Before Method");
	}
	
	@AfterMethod( alwaysRun = true )
	public void method2() {
		
		System.out.println("inside After Method");
	}
	
	@BeforeTest( alwaysRun = true )
	public void method4() {
		
		System.out.println("inside Before Test");
	}
	
	@AfterTest( alwaysRun = true )
	public void method3() {
		
		System.out.println("inside After Test");
	}
}
