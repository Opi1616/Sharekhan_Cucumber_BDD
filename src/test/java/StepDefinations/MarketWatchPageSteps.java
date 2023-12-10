package StepDefinations;

import org.junit.Assert;

import com.Pages.MarketWatchPage;
import com.Pages.ShareKhanAccountPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MarketWatchPageSteps {

	private ShareKhanAccountPage shareKhanAccountPage = new ShareKhanAccountPage(DriverFactory.driver);
	private MarketWatchPage marketWatchPage;

	@Given("user is on MarkeWatch page")
	public void user_is_on_MarkeWatch_page() throws InterruptedException {
		marketWatchPage = shareKhanAccountPage.gotoMarketWatchPage();
		marketWatchPage.userisOnmarketWatchPage();
	}

	@Then("MarketPage Elements should be displayed")
	public void market_page_elements_should_be_displayed() throws InterruptedException {
		Assert.assertTrue(marketWatchPage.subMenuIsDisplayed());
	}

	@Then("user verifed the My watchlist is underlined")
	public void user_verifed_the_my_watchlist_is_underlined() throws InterruptedException {
		Assert.assertTrue("my_watchlist_Is_Unerlined", marketWatchPage.myWatchListIsUnderLined());

	}

	@Then("user verifed the option Chain button is disabled")
	public void user_verifed_the_option_chain_button_is_disabled() throws InterruptedException {
		Assert.assertFalse("option_chain_button_Is_disabled", marketWatchPage.optionChainBtnIsEnabledOrDisable());

	}

	@Then("user created watchList")
	public void user_created_watch_list() throws InterruptedException {
		marketWatchPage.createWatchList();

	}

	@Then("user deleted the WatchList")
	public void user_deleted_the_watch_list() throws InterruptedException {
		marketWatchPage.deleteWatchList();
	}

	@Then("user renamed the watchList")
	public void user_renamed_the_watch_list() throws InterruptedException {
		marketWatchPage.renameWatchList();
	}

}
