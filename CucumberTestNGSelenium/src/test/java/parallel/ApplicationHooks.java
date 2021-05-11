package parallel;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	private DriverFactory hDriverFactory;
	private WebDriver hdriver;
	private ConfigReader hconfig;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() {
		hconfig = new ConfigReader();
		prop = hconfig.init_prop();
	}
	
	@Before(order = 1)	
	public void LaunchBrowser() {
		String browserName = prop.getProperty("browser");
		hDriverFactory = new DriverFactory();
		hdriver =  hDriverFactory.init_Driver(browserName);	
	}
	
	@After(order = 0)
	public void quitBrowser() {
		hdriver.quit();
	}
	
	@After(order = 1)
	public void tearDown(Scenario sc) {
		if(sc.isFailed()) {
			String screenshotName = sc.getName().replaceAll(" ", "_");
			byte [] sourcepath = ((TakesScreenshot)hdriver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcepath, "image/png", screenshotName);
			
		}
	}
	
}
