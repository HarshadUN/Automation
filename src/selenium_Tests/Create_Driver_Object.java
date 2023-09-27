package selenium_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Driver_Object {

	public static void main(String[] args) {
		// use 4.11.0 selenium dependency 
		// No need to use System.SetProperty
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.close();
		

	}

}
