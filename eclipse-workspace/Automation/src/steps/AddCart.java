		package steps;
		
		import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	
	import cucumber.api.java.en.And;
		import cucumber.api.java.en.Then;
		import cucumber.api.java.en.When;
		
		public class AddCart extends AbstractPageStepDefinition {
			WebDriver driver = getDriver();
			
			@When ("the user enters dresses in the search bar")
			public void theuserentersdressesinthesearchbar() {
				driver.findElement(By.name("search_query")).sendKeys("dresses");
				
			}
			@And ("the user clicks the search button")
			public void theuserclicksthesearchbutton() {
				driver.findElement(By.name("submit_search")).click();
				
				
			}
			
			@Then ("the dresses page appears")
		public void thedressespageappears() {
				driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]")).click();
			}
			
			@Then ("the add to his car")
		public void theaddtohiscar() {
				
				driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
			}
			@And ("the user pay the dress")
		public void theuserpaythedress() {
				driver.findElement(By.name("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
				driver.findElement(By.name("processAddress")).click();
				driver.findElement(By.name("//*[@id='form']/p/button/span")).click();
				driver.findElement(By.name("cgv")).click();
			}
		}
