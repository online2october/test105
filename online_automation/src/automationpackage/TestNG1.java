package automationpackage;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void a() {
		System.out.println("hello a method");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("hello b method");
	}
	
	@BeforeSuite
	public void c() {
		System.out.println("hello c method");
	}
	
	@BeforeClass
	public void d() {
		System.out.println("hello d method");
	}
	
	@BeforeMethod
	public void e() {
		System.out.println("hello e method");
	}
	
	@Test(priority = -10)
	public void testagain() {
		System.out.println("again test method");
	}
	
	@AfterMethod
	public void aftermethod(){
		
   System.out.println("hello after method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("hello afterclass method");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("hello aftertest method");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("hello aftersuite method");
	}

}
