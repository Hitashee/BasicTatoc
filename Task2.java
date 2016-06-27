package basicTatoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task2 extends Task1 {
	WebDriver task2()
	{
		WebDriver driver= task1();
		System.out.println("Task2");
		driver.switchTo().frame("main");
		String color1= driver.findElement(By.cssSelector("#answer")).getAttribute("class");
		System.out.println(color1);
		driver.switchTo().frame("child");
		String color2= driver.findElement(By.cssSelector("#answer")).getAttribute("class");
		System.out.println(color2);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		System.out.println("repaint Box");
		while(!color1.equals(color2))
	    {  
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
			driver.findElement(By.linkText("Repaint Box 2")).click();
			color1= driver.findElement(By.cssSelector("#answer")).getAttribute("class");
			driver.switchTo().frame("child");
			color2= driver.findElement(By.cssSelector("#answer")).getAttribute("class");
	    	
	    	if(color1.equals(color2)){
	    		driver.switchTo().defaultContent();
	    		driver.switchTo().frame("main");
	    		driver.findElement(By.linkText("Proceed")).click();
	    		
	    	   	break;
		    	}
		 }
		return driver;
	}

}
