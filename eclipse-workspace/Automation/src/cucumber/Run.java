package cucumber;
	import cucumber.api.CucumberOptions;
	import cucumber.api.testng.AbstractTestNGCucumberTests;

	
	@CucumberOptions(features="src/features/Login.feature",glue="steps")
	public class Run extends AbstractTestNGCucumberTests {

			
	}

