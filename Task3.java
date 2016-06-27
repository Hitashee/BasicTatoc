package basicTatoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

class Task3 extends Task2
{
	WebDriver task3()
	{
		WebDriver driver= task2();
		System.out.println("Task3");
		WebElement element = driver.findElement(By.id("dragbox"));
		System.out.println("Drag Box");
		WebElement target = driver.findElement(By.id("dropbox"));
		System.out.println("Drop Box");
		(new Actions(driver)).dragAndDrop(element,target).perform();
		driver.findElement(By.linkText("Proceed")).click();
		return driver;
	}

}
