package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setup {

	public static WebDriver Driver;
	
	public static void setupMethod(){ 
		
		// Set the system property for ChromeDriver and instantiate the WebDriver
		
		System.setProperty("webdriver.gecko.driver",
				"E:\\SeleniumTraining\\Tools\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		Driver = new ChromeDriver();
	}
}
