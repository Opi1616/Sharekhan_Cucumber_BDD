package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ElementUtil;

public class ReportsPage {

	private WebDriver driver;
	private ElementUtil eutil;

	public ReportsPage(WebDriver driver) {

		this.driver = driver;
		eutil = new ElementUtil(driver);
	}

	private By Reports = By.xpath("//span[text()='REPORTS']");
	private By subMenu = By.cssSelector("ul#submenu");
	private By Equity = By.xpath("(//div[@class='bodypanel'])[1]");
	private By Derivatives = By.xpath("(//div[@class='bodypanel'])[2]");
	private By Currency = By.xpath("(//div[@class='bodypanel'])[3]");
	private By Commodity = By.xpath("(//div[@class='bodypanel'])[4]");
	private By Mutual_Fund = By.xpath("(//div[@class='bodypanel'])[5]");
	private By Portfolio_Report = By.xpath("(//div[@class='bodypanel'])[6]");
	private By Transaction_Report = By.xpath("(//div[@class='bodypanel'])[7]");

	public boolean userIsOnReportsPage() throws InterruptedException {
		Thread.sleep(2000);
		return eutil.doIsDisplayed(Reports);

	}

	public boolean ReportsPageElementDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		eutil.doIsDisplayed(subMenu);
		eutil.doIsDisplayed(Equity);
		eutil.doIsDisplayed(Derivatives);
		eutil.doIsDisplayed(Currency);
		eutil.doIsDisplayed(Commodity);
		eutil.doIsDisplayed(Mutual_Fund);
		eutil.doIsDisplayed(Portfolio_Report);
		return eutil.doIsDisplayed(Transaction_Report);
	}

}
