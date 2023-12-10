package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ElementUtil;

public class ShareKhanAccountPage {

	private WebDriver driver;
	private ElementUtil eutil;

	public ShareKhanAccountPage(WebDriver driver) {

		this.driver = driver;
		eutil = new ElementUtil(driver);
	}

	private By Accounts = By.xpath("//a[@click-details='ACCOUNTS']");
	private By equityBankAccount = By.xpath("(//ul[@class='accountul'])[2]");
	private By banckAccountNo = By.xpath("//select[@name='bankList']");
	private By equitytrading = By.xpath("//select[@name='segment']");
	private By AccountInfo = By.xpath("(//div[@class='row'])[8]");

	private By SelectSegMent = By.xpath("//select[@name='segment']");

	private By BankAccountInformation = By.xpath("//select[@name='bankList']/option");
	private By BankDetailsAccountInformation = By.xpath("//select[@name='bankList']/option");

	private By MarketWatch = By.xpath("//span[text()='MARKETWATCH']");

	public void userIsOnAccountPage() {
		eutil.doIsDisplayed(Accounts);
	}

	public String getsAccountsDetails() {
		return eutil.getTextWithWait(BankAccountInformation);
	}

	public String getsBankAccountsDetails() {
		return eutil.getTextWithWait(BankDetailsAccountInformation);
	}

	public boolean AccountInfoAllDisplayed() throws InterruptedException {
		Thread.sleep(5000);
		eutil.doIsDisplayed(equityBankAccount);
		eutil.doIsDisplayed(banckAccountNo);
		eutil.doIsDisplayed(equitytrading);
		return eutil.doIsDisplayed(AccountInfo);
	}

	public void selectDropDownValueIPOByValue() throws InterruptedException {
		Thread.sleep(2000);
		eutil.doSelectDropDwon(SelectSegMent, "IPO");
		Thread.sleep(5000);
		eutil.doIsDisplayed(SelectSegMent);
	}

	public void selectDropDownValueEMFByValue() throws InterruptedException {
		eutil.refresh();
		Thread.sleep(2000);
		eutil.doSelectDropDwon(SelectSegMent, "EMF");
		Thread.sleep(5000);
		eutil.doIsDisplayed(SelectSegMent);
	}

	public MarketWatchPage gotoMarketWatchPage() {
		eutil.clickElementWhenReady(MarketWatch, 10);
		return new MarketWatchPage(driver);
	}

}
