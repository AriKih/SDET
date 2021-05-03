
package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginRegisteredUser extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	
	@Given("the user is on the landing page")
	  public void thenewuseisonthelandingpage() throws Throwable {
			driver.get("http://automationpractice.com/index.php");			
	  }
	
	  @When("he press signin")
	  public void hepresssignin()throws Throwable {
		  driver.findElement(By.xpath("//nav/div[1]/a")).click();
		  Thread.sleep(5000);
	  }
	 @Then("user entered the credentials")
	  public void  Userenteredthecredentials () throws Throwable {
	  driver.findElement(By.id("email")).sendKeys("t3stauto2@yopmail.com");
		driver.findElement(By.id("passwd")).sendKeys("passwd");
		Thread.sleep(10000);
 }

 @Then("will have access")
 public void willhaveccess() throws Throwable {
	  driver.findElement(By.id("SubmitLogin")).click();
/*	
		String title2= driver.findElement(By.xpath("//h1")).getText();
		System.out.println(title2);
		
		Assert.assertEquals(title2,"MY ACCOUNT");
		*/
		Thread.sleep(5000);
 }
	
}
