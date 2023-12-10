package StepDefinations;

import org.junit.Assert;

import com.Pages.ReportsPage;
import com.Pages.TradeNowPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ReportsPageSteps {

	private TradeNowPage TradeNowPage = new TradeNowPage(DriverFactory.driver);
	private ReportsPage reportsPage;

	@Given("user is on Reports Page")
	public void user_is_on_Reports_page() throws InterruptedException {
		reportsPage = TradeNowPage.gotoReportsPage();
		Assert.assertTrue(reportsPage.userIsOnReportsPage());
	}

	@Then("Reports Page all corresponding links should be displayed")
	public void reports_page_all_corresponding_links_should_be_displayed() throws InterruptedException {
		Assert.assertTrue(reportsPage.ReportsPageElementDisplayed());
	}

}
