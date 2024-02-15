package Assignments;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seventh_lec.BaseTest;

public class sample_test extends setup // import setup method
{
    // setup method runs before the class starts
	@BeforeMethod
	public static void browseropening()
	{
		setup.setupMethod(); 
	}

	//@BeforeTest
	public static void browseropen()
	{
		BaseTest.BaseMethod();
	}
 
	@Test (priority=1)  // Test case to verify title of the page
 	public static void googleVerifyTitle()
 	{
		 Driver.get("https://www.google.co.in/?gws_rd=ssl"); // navigate to the google website
		 String actualTitle = Driver.getTitle();  // get the actual titile of the page 
		 String expectedTitle = "Google"; // expected title of the page
		 
		 // Compare the actual title with the expected title
	        if (actualTitle.equals(expectedTitle)) {
	            System.out.println("Title is as expected: " + expectedTitle);
	        } else {
	            System.out.println("Title is not as expected. Actual title is: " + actualTitle);
	        }
	        
 	}
	
	 @Test (priority=2)// Test case to verify demo button
	  public void verifyDemoButton() {
	      Driver.get("https://leadzen.ai/"); 
	      Driver.findElement(By.xpath("//a[@href='https://tidycal.com/sonakshi/30-minute-meeting']")).click();
	      System.out.println(Driver.getCurrentUrl());
	      System.out.println(Driver.getTitle());  
	}
	 @AfterMethod
		public static void browserclosing()
		{
			 Driver.quit();
		}
		
		
	//@AfterTest
		public static void quit()
		{
			 Driver.quit();
		}
}


