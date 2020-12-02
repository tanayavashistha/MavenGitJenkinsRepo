package testscripts;

import org.testng.Assert;
import org.testng.annotations.*;

public class Test1 {
  @Test
  public void testMethod1() {
	  System.out.println("In testMethod1()");
	  System.out.println("TestMethod1 done");  
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In beforeSuite()");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("In afterSuite()");
  }

}
