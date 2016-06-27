package basicTatoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
class GetDriver {

	public WebDriver getDriver() {
		
		WebDriver driver= new FirefoxDriver();
		return driver;

	}

}
