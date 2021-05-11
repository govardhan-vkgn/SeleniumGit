package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures"},
		glue = {"stepDefinitions","AppHooks"},
		//tags = "@Smoke or @Regression",
		plugin = {"pretty",
				//"json:target/MyReports/jsonreport.json",
				//"junit:target/MyReports/junitreport.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"
			}
		)

public class MyTestRunner {

}
