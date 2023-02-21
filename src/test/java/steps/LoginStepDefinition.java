package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DtabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginpage;
	DtabasePage databasePage;

	@Before
	public void beforeRun() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DtabasePage(); // we created the object this way because it is not part of POM
	}

	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=login/");

	}

	@When("User enters user name as {string}")
	public void user_enters_user_name_as(String username) {
		loginpage.enterUserName(username);
	}

	@When("User enters {string} from mysql database")
	public void user_enters_from_mysql_database(String userDta) {
		/*if (userDta.equalsIgnoreCase("username")) {
			System.out.println("Username from DB:"+ databasePage.getDtaFromDb("username") );
			loginpage.enterUserName(databasePage.getDtaFromDb());
		} else if (userDta.equalsIgnoreCase("password")) {
			System.out.println("Password from DB:"+ databasePage.getDtaFromDb("password") );
			loginpage.enterPassword(databasePage.getDtaFromDb());
		} else {
			System.out.println("user data:" + userDta + "is not found!");
		}*/

		switch (userDta) {
		case "username":
			System.out.println("Username from DB:"+ databasePage.getDtaFromDb("username") );
			loginpage.enterUserName(databasePage.getDtaFromDb("username"));
			break;
		case "password":
			System.out.println("Password from DB:"+ databasePage.getDtaFromDb("password") );
			loginpage.enterPassword(databasePage.getDtaFromDb("password"));
			break;
		default:
			System.out.println("user data:" + userDta + "is not found!");
		}
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginpage.enterPassword(password);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginpage.clickSignInButton();
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginpage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		takeScreenshot(driver);

	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
