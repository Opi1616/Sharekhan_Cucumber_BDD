package StepDefinations;

import java.util.List;
import java.util.Map;

import com.Pages.LaunchShareKhanPage;
import com.Pages.PortFolioPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PortfolioStepPage {

	private LaunchShareKhanPage launchShareKhanPage = new LaunchShareKhanPage(DriverFactory.driver);
	private PortFolioPage portFolioPage;

	@Given("user has already logged in shareKhan")
	public void user_has_already_logged_in_share_khan(DataTable dataTable) throws InterruptedException {

		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");

		portFolioPage = launchShareKhanPage.doLogin(userName, password);

	}

	@Given("user is on portFolio page")
	public void user_is_on_port_folio_page() throws InterruptedException {
		portFolioPage.userIsOnPortfolioPage();
	}

	@Then("Name and SearchBar Elements should be displayed")
	public void name_and_search_bar_elements_should_be_displayed() throws InterruptedException {
		portFolioPage.searchBarAccountNameisExist();
	}

	@Then("user is add the virtual")
	public void user_is_add_the_virtual() throws InterruptedException {
		portFolioPage.addVirtualPortFolio();
	}

	@Then("user is add the scrip")
	public void user_is_add_the_scrip() throws InterruptedException {
		portFolioPage.addScrip();
	}

	@Then("user is delete the scrip")
	public void user_is_delete_the_scrip() throws InterruptedException {
		portFolioPage.delete_the_Scrip();
	}

	@Then("user is delete the virtual")
	public void user_is_delete_the_virtual() throws InterruptedException {
		portFolioPage.delete_the_VirtualPortFolio();
	}

	@Then("user is logout the ShareKhan Page")
	public void user_is_logout_the_share_khan_page() throws InterruptedException {
		portFolioPage.doLogOut();
	}

	@Then("user renamed the virtual")
	public void user_renamed_the_virtual() throws InterruptedException {
		portFolioPage.RenameVirtual();
	}

	@Then("user mouse Hover On portFolio  Elements")
	public void user_mouse_hover_on_port_folio_elements() throws InterruptedException {
		portFolioPage.mouseHoverOnElements();
	}

}
