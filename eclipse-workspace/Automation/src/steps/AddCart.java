		package steps;
		
		import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	
	import cucumber.api.java.en.And;
		import cucumber.api.java.en.Then;
		import cucumber.api.java.en.When;
		
		public class AddCart extends AbstractPageStepDefinition {
			WebDriver driver = getDriver();
			
			@When ("the user enters dresses in the search bar")
			public void theuserentersdressesinthesearchbar() {
				driver.findElement(By.id("search_query_top")).sendKeys("dresses");
				
			}
			@And ("the user clicks the search button")
			public void theuserclicksthesearchbutton() {
				driver.findElement(By.name("submit_search")).click();
				
				
				
			}
			
			@Then ("the dresses page appears")
		public void thedressespageappears() {
				driver.findElement(By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/div/h5/a")).click();
				
			}
			
			@Then ("the add to his car")
		public void theaddtohiscar() throws Throwable {
				driver.findElement(By.name("Submit")).click();
				Thread.sleep(5000);
				
			}
			@And ("the user pay the dress")
		public void theuserpaythedress() throws Throwable {
				driver.findElement(By.xpath("//div[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
				Thread.sleep(5000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)");
				driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
				
				driver.findElement(By.name("processAddress")).click();
				
				driver.findElement(By.name("cgv")).click();
				
				
				driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
			}
		}
