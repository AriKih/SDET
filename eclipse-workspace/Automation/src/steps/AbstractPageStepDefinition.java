package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPageStepDefinition {

	protected static WebDriver driver;
	
		protected WebDriver getDriver() {
			if(driver==null){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\AriadnaBereniceCihMa\\eclipse-workspace\\cucumber\\driver\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				
			}
			return driver;
		}
	
}
