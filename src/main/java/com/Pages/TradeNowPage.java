package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ElementUtil;

public class TradeNowPage {

	private WebDriver driver;
	private ElementUtil eutil;

	public TradeNowPage(WebDriver driver) {

		this.driver = driver;
		eutil = new ElementUtil(driver);
	}

	private By TradeNow = By.xpath("//span[text()='TRADE NOW']");
	private By placeOrderBtn = By.xpath("//button[text()='Place Order']");
	private By resetBtn = By.xpath("//button[text()='RESET']");
	private By NormalOrder = By.xpath("//a[text()='NORMAL ORDER']");
	private By BuySell = By.xpath("//div[@id='buysellTrade']");
	private By subMenu = By.cssSelector("ul#submenu");
	private By Reports = By.xpath("//span[text()='REPORTS']");

	private By EnterScrip = By.xpath("(//input[@type='text'])[2]");
	private By OPTIEMUS = By.xpath("//span[text()='OPTIEMUS']");
	private By Qty = By.xpath("(//input[@type='text'])[3]");
	private By placeOrder = By.xpath("//button[@apo-click='submit order']");
	private By ConfirmedOrder = By.xpath("//button[@apo-click='submit order']");
	private By ValidateOrder = By.xpath("(//div[@class='table-responsive']//tbody)[1]");

	public void BuyOrder() throws InterruptedException {
		Thread.sleep(2000);
		eutil.doActionSendKeys(EnterScrip, "OPTIEMUS");
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(OPTIEMUS);
		Thread.sleep(2000);
		eutil.doSendKeys(Qty, "2");
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(placeOrder);
		Thread.sleep(2000);
		eutil.doActionMoveToElementClick(ConfirmedOrder);
		Thread.sleep(2000);
		eutil.doActionMoveToElement(ValidateOrder);

	}

	public void userIsOnTradeNowPage() throws InterruptedException {
		Thread.sleep(2000);
		eutil.doIsDisplayed(TradeNow);

	}

	public boolean ElementsIsDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		eutil.doIsDisplayed(BuySell);
		return eutil.doIsDisplayed(subMenu);
	}

	public boolean placeOrder_Button_Is_Disabled() throws InterruptedException {
		Thread.sleep(2000);
		return eutil.isEnabled(placeOrderBtn);
	}

	public boolean reset_Button_Is_Disabled() throws InterruptedException {
		Thread.sleep(2000);
		return eutil.isEnabled(resetBtn);
	}

	public boolean normalOrder_Is_Underlined() throws InterruptedException {
		Thread.sleep(2000);
		return eutil.doIsDisplayed(NormalOrder);
	}

	public ReportsPage gotoReportsPage() {
		eutil.clickElementWhenReady(Reports, 10);
		return new ReportsPage(driver);
	}

}
