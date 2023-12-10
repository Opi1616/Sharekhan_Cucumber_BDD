package StepDefinations;

import org.junit.Assert;

import com.Pages.LaunchShareKhanPage;
import com.Pages.PortFolioPage;
import com.Pages.ShareKhanAccountPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ShareKhanAccountStepPage {

	private PortFolioPage portFolioPage = new PortFolioPage(DriverFactory.driver);
	private ShareKhanAccountPage shareKhanAccountPage;

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
		shareKhanAccountPage = portFolioPage.doClickOnAccounts();
		shareKhanAccountPage.userIsOnAccountPage();

	}

	@Then("Account bank Deatils all Elements should be displayed")
	public void account_bank_deatils_all_elements_should_be_displayed() throws InterruptedException {

		Assert.assertTrue(shareKhanAccountPage.AccountInfoAllDisplayed());
	}

	@Then("user gets Banks Account Deatils this Info should be match with user Account Deatils")
	public void user_gets_banks_account_deatils_this_info_should_be_match_with_user_account_deatils() {
		String accountDetails = shareKhanAccountPage.getsAccountsDetails();
		System.out.println(accountDetails);
		String BankAccountDetails = shareKhanAccountPage.getsBankAccountsDetails();
		System.out.println(BankAccountDetails);
		Assert.assertEquals(accountDetails, BankAccountDetails);

	}

	@Then("user selects IPO Account")
	public void user_selects_ipo_account() throws InterruptedException {
		shareKhanAccountPage.selectDropDownValueIPOByValue();
	}

	@Then("user selects EMF Account")
	public void user_selects_emf_account() throws InterruptedException {
		shareKhanAccountPage.selectDropDownValueEMFByValue();
	}

}
