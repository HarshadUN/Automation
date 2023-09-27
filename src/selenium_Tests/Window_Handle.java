package selenium_Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.xpath("//a[@title='Learn more about Meta Pay']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator <String> it =windows.iterator();
		String ParentID=it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);
		String text =driver.findElement(By.xpath("//h1[@class='_8l4s _8l3l _9j1z _8ww0 home__hero-heading']")).getText();
		System.out.println(text.split(",")[1].trim().split("more")[1]);
		String email = text.split(",")[1].trim().split("more")[1];
		driver.switchTo().window(ParentID);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		
		

	}

}
