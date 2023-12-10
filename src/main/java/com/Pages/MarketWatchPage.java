package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ElementUtil;

public class MarketWatchPage {

	private WebDriver driver;
	private ElementUtil eutil;

	public MarketWatchPage(WebDriver driver) {

		this.driver = driver;
		eutil = new ElementUtil(driver);
	}

	private By MarketWatch = By.xpath("//span[text()='MARKETWATCH']");
	private By UnderLineElement = By.xpath("//li[@class='ng-scope subActive']");
	private By optionChainBtn = By.xpath("//button[text()='Option Chain']");
	private By subMenu = By.cssSelector("ul#submenu");
	private By TradeNow = By.xpath("//span[text()='TRADE NOW']");

	private By createWatchList = By.xpath("//button[text()='Create Watchlist']");
	private By OkButtonDisable = By.xpath("//button[text()='Create Watchlist']");
	private By CancleButtonEnable = By.xpath("//button[text()='Create Watchlist']");
	private By EnterWatchListName = By.xpath("(//input[@type='text'])[1]");
	private By ClickOk = By.xpath("//button[text()='OK']");
	private By TemplateName = By.xpath("//div[text()='Template has been successfully created.']");
	private By close = By.xpath("//button[text()='Close']");
	private By addBtn = By.xpath("//button[text()='ADD']");
	private By CheckBox = By.xpath("(//input[@type='checkbox'])[2]");
	private By DeleteWatchList = By.xpath("//span[@ng-click='bulkDelete()']");
	private By DeletedWatchListLast = By.xpath("//button[text()='Delete Scrip from WATCHLIST']");
	private By DeletedWatchListMsg = By.xpath("//div[text()='Please Select Scrip for Bulk Delete']");

	private By Scriptname = By.xpath("//input[@placeholder='Enter the script name']");
	private By SUZLON = By.xpath("//span[text()='SUZLON']");

	private By setting = By.xpath("//li[@click-details='settings']");
	private By deleteWatchList = By.xpath("//span[text()=' Delete watchlist']");
	private By deleteWatchListFinal = By.xpath("(//button[@type='button'])[1]");
	private By DeleteWatchListMsg = By.xpath("//div[text()='Template has been successfully deleted.']");
	private By DeleteWatchListFInal = By.xpath("//button[text()='Close']");

	private By RenameWatchList = By.xpath("//span[text()=' Rename watchlist']");
	private By RenameFileName = By.xpath("//input[@name='newWatchlist']");
	private By OkBtn = By.xpath("//button[text()='OK']");
	private By closeBtn = By.xpath("//button[text()='Close']");

	public void deleteWatchList() throws InterruptedException {
		eutil.clickElementWhenReady(setting, 10);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(deleteWatchList);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(deleteWatchListFinal);
		Thread.sleep(2000);
		eutil.doIsDisplayed(DeleteWatchListMsg);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(DeleteWatchListFInal);

	}

//	public void addScript() throws InterruptedException {
//		eutil.doActionSendKeys(Scriptname, "SUZLON");
//		Thread.sleep(2000);
//		eutil.doActionMoveToElementClick(SUZLON);
//		Thread.sleep(2000);
//		eutil.doActionMoveToElementClick(addBtn);
//	}

	public void createWatchList() throws InterruptedException {
		eutil.clickElementWhenReady(createWatchList, 10);
		Thread.sleep(2000);
		OkBtnIsDisable();
		CancleButtonEnable();
		Thread.sleep(2000);
		eutil.doActionSendKeys(EnterWatchListName, "WatchList");
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(ClickOk);
		Thread.sleep(5000);
		eutil.doIsDisplayed(TemplateName);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(close);

	}

	public void renameWatchList() throws InterruptedException {
		eutil.clickElementWhenReady(setting, 10);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(RenameWatchList);
		Thread.sleep(2000);
		eutil.doActionSendKeys(RenameFileName, "Abc");
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(OkBtn);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(closeBtn);

	}

	public boolean AddBtnIsDisable() throws InterruptedException {
		Thread.sleep(2000);
		return eutil.isEnabled(addBtn);
	}

	public boolean userisOnmarketWatchPage() throws InterruptedException {
		Thread.sleep(2000);
		return eutil.doIsDisplayed(MarketWatch);
	}

	public boolean myWatchListIsUnderLined() throws InterruptedException {
		Thread.sleep(2000);
		return eutil.doIsDisplayed(UnderLineElement);
	}

	public boolean OkBtnIsDisable() throws InterruptedException {
		Thread.sleep(2000);
		return eutil.isEnabled(OkButtonDisable);
	}

	public boolean optionChainBtnIsEnabledOrDisable() throws InterruptedException {
		Thread.sleep(2000);
		return eutil.isEnabled(optionChainBtn);
	}

	public boolean CancleButtonEnable() throws InterruptedException {
		Thread.sleep(2000);
		return eutil.isEnabled(CancleButtonEnable);
	}

	public boolean subMenuIsDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		eutil.doIsDisplayed(subMenu);
		return eutil.doIsDisplayed(createWatchList);

	}

	public TradeNowPage gotoTradeNowPage() {
		eutil.clickElementWhenReady(TradeNow, 10);
		return new TradeNowPage(driver);
	}

}
