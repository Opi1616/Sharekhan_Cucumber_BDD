package StepDefinations;

import org.junit.Assert;

import com.Pages.MarketWatchPage;
import com.Pages.TradeNowPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TradeNowStepsPage {

	private MarketWatchPage marketWatchPage = new MarketWatchPage(DriverFactory.driver);
	private TradeNowPage TradeNowPage;

	@Given("user is on TradeNow Page")
	public void user_is_on_MarkeWatch_page() throws InterruptedException {
		TradeNowPage = marketWatchPage.gotoTradeNowPage();
		TradeNowPage.userIsOnTradeNowPage();
	}

	@Then("TradeNow Page Elements should be displayed")
	public void trade_now_page_elements_should_be_displayed() throws InterruptedException {
		Assert.assertTrue(TradeNowPage.ElementsIsDisplayed());
	}

	@Then("user verifed the Normal Order is underlined")
	public void user_verifed_the_normal_order_is_underlined() throws InterruptedException {
		Assert.assertTrue("normal_Order_Is_underLined", TradeNowPage.normalOrder_Is_Underlined());
	}

	@Then("user verifed the option Place Order button is disabled")
	public void user_verifed_the_option_place_order_button_is_disabled() throws InterruptedException {
		Assert.assertFalse("placeOrder_Button_Is_Disabled", TradeNowPage.placeOrder_Button_Is_Disabled());
	}

	@Then("user verifed the option reset button is disabled")
	public void user_verifed_the_option_reset_button_is_disabled() throws InterruptedException {
		Assert.assertFalse("placeOrder_Button_Is_Disabled", TradeNowPage.reset_Button_Is_Disabled());
	}

	@Then("verify that theuser is able to place order")
	public void verify_that_theuser_is_able_to_place_order() throws InterruptedException {
		TradeNowPage.BuyOrder();
	}

}
