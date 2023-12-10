package StepDefinations;

import org.junit.Assert;

import com.Pages.LaunchShareKhanPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchShareKhanPageSteps {

	public LaunchShareKhanPage launchShareKhanPage = new LaunchShareKhanPage(DriverFactory.driver);
	private static String title;

	@When("user is on ShareKhan page")
	public void user_is_on_ShareKhan_page() {
		launchShareKhanPage.launchShareKhanSite("https://www.sharekhan.com");

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = launchShareKhanPage.getTitle();
		System.out.println("login page title is : " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("MARKET,NEW TOMARKET,SUPERINVESTOR,ACTIVETRADER,MUTUALFUNDS,RESEARCH,EDUCATIONFIRST & PRODUCTSANDSERVICES should be displayed")
	public void market_new_tomarket_superinvestor_activetrader_mutualfunds_research_educationfirst_productsandservices_should_be_displayed()
			throws InterruptedException {
		Assert.assertTrue(launchShareKhanPage.allElementIsDisplayed());

	}

	@Then("Menu and Menu Element is displayed")
	public void Menu_and_Menu_Element_is_displayed() throws InterruptedException {
		launchShareKhanPage.menuAndMenuElementDisplayed();
	}

	@Then("Mouse hoverover on Market,New To Market,Super Investor,Active Trader,Mutal Funds,Research,Education First and Product and Services")
	public void mouse_hoverover_on_market_NewToMarket_SuperInvestor_ActiveTrader_MutalFunds_Research_EducationFirst_andProductandServices()
			throws InterruptedException {
		launchShareKhanPage.mouseHover_On_Market_And_MarketElements();
		launchShareKhanPage.mouseHover_On_New_TO_Market_And_MarketElements();
		launchShareKhanPage.mouseHover_On_Super_InvestorElements();
		launchShareKhanPage.mouseHover_On_ActiveTrader_AndElements();

	}

	@When("user enters username {string}")
	public void user_enters_username(String userName) {
		launchShareKhanPage.enterUserName(userName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String passWord) {
		launchShareKhanPage.enterPassword(passWord);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		launchShareKhanPage.LoginBtn();
	}

}
