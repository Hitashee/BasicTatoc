package basicTatoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task1 extends GetDriver{
	public WebDriver task1(){
		
		WebDriver driver= getDriver();
		System.out.println("Task1");
		driver.get("http://10.0.1.86/tatoc/basic/grid/gate");
		System.out.println("Click on green Box");
		driver.findElement(By.className("greenbox")).click();
		return driver;
	}
}
