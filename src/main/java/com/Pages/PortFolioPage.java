package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ElementUtil;

public class PortFolioPage {

	private WebDriver driver;
	private ElementUtil eutil;

	public PortFolioPage(WebDriver driver) {

		this.driver = driver;
		eutil = new ElementUtil(driver);

	}

	private By portFolioPage = By.cssSelector("nav.navigation");
	private By userId = By.xpath("(//a[@click-name='trading top menu'])[7]");
	private By trading = By.cssSelector("li#tradingSegment");
	private By Accounts = By.xpath("//span[text()='ACCOUNTS']");
	private By portfolio = By.xpath("//span[text()='PORTFOLIO']");

	private By Logout1 = By.xpath("//a[@click-details='username']");
	private By Logout = By.xpath("(//a[text()='Logout'])[1]");

	private By DetailedView = By.xpath("//a[text()='DETAILED VIEW']");
	private By AddVirtualPortFolio = By.xpath("//button[@class='blk-sm-button']");
	private By AlerText = By.xpath("(//input[@type='text'])[1]");
	private By AddFolder = By.xpath("//button[text()='Add Folder']");
	private By Successmsg = By.xpath("//div[text()='Success']");
	private By close = By.xpath("//button[text()='Close']");

	private By scripName = By.xpath("(//li[@click-name='tab'])[2]");
	private By AddScrip = By.xpath("(//button[text()='Add Scrip'])[2]");
	private By virtualPortFolio = By.xpath("//span[text()='Virtual Portfolio']");
	private By EnterScriptname = By.xpath("(//input[@type='text'])[1]");
	private By EnterScripComptname = By.xpath("//span[text()='TATACHEM']");
	private By Date = By.xpath("//input[@name='bsdate']");
	private By DateTwentyOne = By.xpath("//span[text()='21']");
	private By SelectTransaction = By.xpath("//select[@name='b']");
	private By EnterQty = By.xpath("//input[@type='number']");
	private By AddScripLast = By.xpath("(//button[text()='Add Scrip'])[1]");
	private By closeScrip = By.xpath("//button[text()='Close ']");
	private By tata = By.xpath("//span[text()='TATACHEM']");

	private By DeleteScrip = By.xpath("//span[@ng-click='removeStock(x.scripcode)']");
	private By DeleteStock = By.xpath("(//button[@type='button'])[1]");
	private By StockDelete = By.xpath("//div[text()='stock deleted successfully.']");
	private By Ok = By.xpath("//button[text()='OK']");

	private By TestPortFolio = By.xpath("//li[text()='Test']");
	private By DeleteTestPortFolio = By.xpath("//button[text()='Delete Portfolio']");
	private By DeleteTestPortFolioFolder = By.xpath("//button[text()='Delete Folder']");
	private By SuccessMsg = By.xpath("//div[text()='Portfolio deleted successfully.']");
	private By closeAlert = By.xpath("//span[@class='icon pull-right cross']");

	private By virtual = By.xpath("(//li[@click-name='tab'])[2]");
	private By RenamePortfolio = By.xpath("//button[text()='Rename Portfolio']");
	private By NewName = By.xpath("//input[@name='newFolderName']");
	private By RenameFolder = By.xpath("//button[text()='Rename Folder']");
	private By OkLast = By.xpath("//button[text()='OK']");

	private By MyWatchList = By.cssSelector("a#watchlist");
	private By Myportfolio = By.cssSelector("li#Portfolio");
	private By MyinvestmentCart = By.cssSelector("a#investmentCart");
	private By MyAlert = By.xpath("//a[@title='Alert']");

	public void userIsOnPortfolioPage() throws InterruptedException {
		Thread.sleep(2000);
		eutil.doIsDisplayed(portfolio);
	}

	public void mouseHoverOnElements() throws InterruptedException {
		Thread.sleep(2000);
		eutil.doActionMoveToElement(MyWatchList);
		eutil.doActionMoveToElement(Myportfolio);
		eutil.doActionMoveToElement(MyinvestmentCart);
		eutil.doActionMoveToElement(MyAlert);
	}

	public void RenameVirtual() throws InterruptedException {
		eutil.clickElementWhenReady(virtual, 10);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(RenamePortfolio);
		Thread.sleep(2000);
		eutil.doActionSendKeys(NewName, "New");
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(RenameFolder);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(OkLast);
		Thread.sleep(2000);
		eutil.doIsDisplayed(virtual);

	}

	public void searchBarAccountNameisExist() throws InterruptedException {
		Thread.sleep(2000);
		eutil.doActionMoveToElement(portFolioPage);
		eutil.doActionMoveToElement(userId);
		eutil.doActionMoveToElement(trading);
	}

	public void addVirtualPortFolio() throws InterruptedException {
		eutil.clickElementWhenReady(DetailedView, 10);
		Thread.sleep(2000);
		eutil.clickElementWhenReady(AddVirtualPortFolio, 10);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(AlerText);
		Thread.sleep(2000);
		eutil.doActionSendKeysonActiveElement(AlerText, "Test");
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(AddFolder);
		Thread.sleep(2000);
		eutil.doIsDisplayed(Successmsg);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(close);

	}

	public void addScrip() throws InterruptedException {
		eutil.clickElementWhenReady(scripName, 10);
		Thread.sleep(2000);
		eutil.clickElementWhenReady(AddScrip, 10);
		Thread.sleep(2000);
		eutil.doIsDisplayed(virtualPortFolio);
		eutil.doActionMoveToElementClick(EnterScriptname);
		Thread.sleep(2000);
		eutil.doActionSendKeysonActiveElement(EnterScriptname, "TATACHEM");
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(EnterScripComptname);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(Date);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(DateTwentyOne);
		Thread.sleep(2000);
		eutil.doDropDownselectByValue(SelectTransaction, "Buy");
		Thread.sleep(2000);
		// eutil.doActionSendKeysonActiveElement(EnterPrice, "469");
		// Thread.sleep(2000);
		eutil.doActionSendKeysonActiveElement(EnterQty, "100");
		Thread.sleep(2000);
		eutil.clickElementWhenReady(AddScripLast, 10);
		Thread.sleep(2000);
		eutil.clickElementWhenReady(closeScrip, 10);
		Thread.sleep(2000);
		eutil.doIsDisplayed(tata);

	}

	public void delete_the_Scrip() throws InterruptedException {
		eutil.clickElementWhenReady(DeleteScrip, 10);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(DeleteStock);
		Thread.sleep(2000);
		eutil.doIsDisplayed(StockDelete);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(Ok);
	}

	public void delete_the_VirtualPortFolio() throws InterruptedException {
		eutil.clickElementWhenReady(TestPortFolio, 10);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(DeleteTestPortFolio);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(DeleteTestPortFolioFolder);
		Thread.sleep(2000);
		eutil.doIsDisplayed(SuccessMsg);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(closeAlert);
		eutil.refresh();

	}

	public void doLogOut() throws InterruptedException {
		eutil.refresh();
		Thread.sleep(2000);
		eutil.doActionMoveToElement(Logout1);
		eutil.doActionMoveToElementClick(Logout);

	}

	public ShareKhanAccountPage doClickOnAccounts() {
		eutil.clickElementWhenReady(Accounts, 10);
		return new ShareKhanAccountPage(driver);

	}

}
