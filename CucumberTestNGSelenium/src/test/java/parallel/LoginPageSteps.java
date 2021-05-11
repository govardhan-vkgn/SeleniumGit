package parallel;

import com.Pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class LoginPageSteps {
	private static String title;
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on Login page")
	public void user_is_on_login_page() {
	    DriverFactory.getDriver()
	    	.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	@When("user gets title of the page")
	public void user_gets_the_title_of_the_page() {
		title = lp.getLoginPageTitle();
		System.out.println("Page title is : " + title);
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitleName) {
		Assert.assertTrue(title.contains(expectedtitleName));
	}
	
	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
	    //Assert.assertTrue(lp.isForgotPwdLiknExist());
	    Assert.assertTrue(lp.isForgotPwdLiknExist());
	}
	
	@When("user enters username {string}")
	public void user_enters_username(String username) {
	   lp.enterUserName(username);
	}
	
	@When("user enters password {string}")
	public void user_enters_password(String password) {
	   lp.enterPassword(password);
	}
	
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    lp.clickOnLogin();
	}
	
}
