package basicTatoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task4 extends Task3 {
	WebDriver task4()
	{
		WebDriver driver= task3();
		System.out.println("Task4");
		driver.findElement(By.linkText("Launch Popup Window")).click();
		System.out.println("Pop up window launched");
		String  handle= driver.getWindowHandle(); 
		driver.findElement(By.xpath("//a[@href='#']")).click();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			}
		driver.findElement(By.id("name")).sendKeys("xyz");
		System.out.println("Send xyz to textarea");
		driver.findElement(By.id("submit")).click();
		driver.switchTo().window(handle);
		driver.findElement(By.linkText("Proceed")).click();
		return driver;
	}

}
