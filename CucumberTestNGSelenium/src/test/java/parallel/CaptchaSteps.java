package parallel;

import org.testng.Assert;

import com.Pages.CaptchaPage;
import com.Pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CaptchaSteps {
	private static String title;
	private CaptchaPage cp = new CaptchaPage(DriverFactory.getDriver());
	
	@Given("user has already logged in to captcha application")
	public void user_has_already_logged_in_to_appl() {
		
		DriverFactory.getDriver()
			.get("https://www.google.com/recaptcha/api2/demo?invisible=false");
		
	}
	@Then("validate captcha exist and click")
	public void validate_captcha_exist() {
	    // Write code here that turns the phrase above into concrete actions
		String symbolexist = cp.getCaptchaSymbolExist();
		Assert.assertEquals(symbolexist, "true");
		cp.clickCaptchaCheckbox();
		System.out.println("Captcha check box is checked");
	}
}
