package basicTatoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class Task5 extends Task4 {

	void task5()
	{
		WebDriver driver= task4();
		System.out.println("Task5");
		driver.findElement(By.linkText("Generate Token")).click();
		String z= driver.findElement(By.id("token")).getText();
		System.out.println(z);
		String s="";
		for(int i=7; i<z.length();i++)
			s=s+z.charAt(i);
		Cookie k = new Cookie("Token",s );
		driver.manage().addCookie(k);
		driver.findElement(By.linkText("Proceed")).click();
	}
}
