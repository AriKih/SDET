		package steps;
		
		
		//import cucumber.api.java.en.But;
	import cucumber.api.java.en.*;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.testng.Assert;
		
		
		public class NewUser extends AbstractPageStepDefinition {
			
			WebDriver driver = getDriver();
			
		  
		
		  @Then("create an account")
		  public void account() throws Throwable{
			  driver.findElement(By.id("email_create")).sendKeys("t3stauto13@yopmail.com");
			  driver.findElement(By.name("SubmitCreate")).click();
			  Thread.sleep(5000);
			  
				String title= driver.findElement(By.xpath("//h1")).getText();
				//Assert.assertEquals(title,"AUTHENTICATION");
				 
				 driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("test");
				  driver.findElement(By.id("customer_lastname")).sendKeys("test");
				  
				  driver.findElement(By.id("passwd")).sendKeys("passwd");
				  driver.findElement(By.id("days")).sendKeys("1");
				  driver.findElement(By.id("months")).sendKeys("January");
				  driver.findElement(By.id("years")).sendKeys("2000");
				  driver.findElement(By.id("firstname")).sendKeys("test");
				  driver.findElement(By.id("lastname")).sendKeys("test");
				  driver.findElement(By.id("address1")).sendKeys("test");
				  driver.findElement(By.id("city")).sendKeys("test");
				  driver.findElement(By.id("id_state")).sendKeys("Alaska");
				  driver.findElement(By.id("postcode")).sendKeys("68000");
				  driver.findElement(By.id("id_country")).sendKeys("United States");
				  driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
				  driver.findElement(By.id("alias")).sendKeys("test1");
				  driver.findElement(By.id("submitAccount")).click();
			  
		  }
		  				
		  }
		
		
