package parallel;

import java.util.List;
import java.util.Map;

import com.Pages.AccountsPage;
import com.Pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class AccountsPageSteps {
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountspage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_appl(DataTable datatable) {
		List<Map<String, String>> credlist = datatable.asMaps();
		String username = credlist.get(0).get("username");
		String password = credlist.get(0).get("password");
		
		DriverFactory.getDriver()
			.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		accountspage = lp.doLogin(username,password);
	}
	
	@Given("user is on accounts page")
	public void user_is_on_accounts_page() {
		String accountspagetilte = accountspage.getAccountsPageTitle();
		System.out.println("Page title is :"+accountspagetilte);
	}
	
	@Then("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectiontable) {
		List<String> expActSectionList = sectiontable.asList();
		System.out.println("Expected Account section list " + expActSectionList);
		
		List<String> actsecList = accountspage.getAccountSectionList();
		System.out.println("Actual Account section list " + actsecList);
		Assert.assertTrue(expActSectionList.containsAll(actsecList));
	}
	
	@Then("accounts section should be {int}")
	public void accounts_section_should_be(Integer expsectioncount) {
		System.out.println("Actual count" + accountspage.getAccountSectionCount());
		System.out.println("Expected count" + expsectioncount);
		Assert.assertTrue(accountspage.getAccountSectionCount()==expsectioncount);
	}
}
