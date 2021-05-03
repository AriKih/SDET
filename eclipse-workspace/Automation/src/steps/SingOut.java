package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SingOut extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	
	@Given("user is on the site")
	public void userisonthesite() throws Throwable {
	driver.findElement(By.xpath("//h1"));
		String title2= driver.findElement(By.xpath("//h1")).getText();
		System.out.println(title2);
		
		Assert.assertEquals(title2,"MY ACCOUNT");
	}

  
  @When("user sing out")
	public void singout() throws Throwable {
		driver.findElement(By.xpath("//header[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
		
	  }
	@Then("User can not buy nothing")
	public void Icannotbuynothing() throws Throwable {
		String title= driver.findElement(By.xpath("//h1")).getText();
		Assert.assertEquals(title,"AUTHENTICATION");
		
	  }
}