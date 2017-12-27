package autotest.autotest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterClass;

public class base {
  @BeforeMethod
  public void beforeMethod() {
	 
  }

  @AfterMethod
  public void afterMethod() {
	 
  }

  @BeforeClass
  public void beforeClass() {
	  DOMConfigurator.configure("log4j.xml");
	 
  }

  @AfterClass
  public void afterClass() {
	
  }

}
