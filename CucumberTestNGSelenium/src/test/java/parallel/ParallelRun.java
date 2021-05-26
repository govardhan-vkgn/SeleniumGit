package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//Govardhan
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedrun.txt"
			},
			glue = {"parallel"},
			features = {"src/test/resources/parallel/Captcha.feature"}	
		)

public class ParallelRun extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
