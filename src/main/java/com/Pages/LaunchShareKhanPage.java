package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ElementUtil;

public class LaunchShareKhanPage {

	private WebDriver driver;
	private ElementUtil eutil;

	private By Market = By.xpath("(//li[@class='largeMenu'])[1]");
	private By NewToMarket = By.xpath("(//li[@class='largeMenu'])[2]");
	private By SuperInvestor = By.xpath("(//li[@class='largeMenu'])[3]");
	private By ActiveTrader = By.xpath("(//li[@class='largeMenu'])[4]");

	private By MutualFunds = By.xpath("(//li[@class='largeMenu'])[5]");
	private By Research = By.xpath("(//li[@class='largeMenu'])[6]");
	private By EducationFirst = By.xpath("(//li[@class='largeMenu'])[7]");
	private By ProductAndServices = By.xpath("(//li[@class='largeMenu'])[8]");
	private By close = By.xpath("//span[@role='button']");
	private By Login = By.xpath("//a[text()='Login/Trade']");

	private By Menu = By.xpath("//li[@class='hamburgerMenu']");
	private By MenuElements = By.xpath("//ul[@id='hamburgerMenu' and @class='open']");

	private By MarketSummary = By.xpath("(//ul[@class='subList']/li/a)[11]");
	private By marketstats = By.xpath("(//ul[@class='subList']/li/a)[12]");
	private By Derivatives = By.xpath("(//ul[@class='subList']/li/a)[13]");
	private By News = By.xpath("(//ul[@class='subList']/li/a)[14]");
	private By Ipo = By.xpath("(//ul[@class='subList']/li/a)[15]");
	private By Npo = By.xpath("(//ul[@class='subList']/li/a)[16]");
	private By Bonds = By.xpath("(//ul[@class='subList']/li/a)[17]");
	private By indices = By.xpath("(//ul[@class='subList']/li/a)[18]");
	private By EventsAndCalnder = By.xpath("(//ul[@class='subList']/li/a)[19]");
	private By Commodity = By.xpath("(//ul[@class='subList']/li/a)[20]");

	private By Overview = By.xpath("(//ul[@class='subList']/li/a)[21]");
	private By MustHaveStocks = By.xpath("(//ul[@class='subList']/li/a)[22]");
	private By Offering = By.xpath("(//ul[@class='subList']/li/a)[23]");
	private By KnowledgeCenter = By.xpath("(//ul[@class='subList']/li/a)[24]");
	private By OtherImportantThings = By.xpath("(//ul[@class='subList']/li/a)[25]");
	private By SharekhanClassroom = By.xpath("(//ul[@class='subList']/li/a)[26]");
	private By IHaveMoney = By.xpath("(//ul[@class='subList']/li/a)[27]");

	private By SuperOverview = By.xpath("(//ul[@class='subList']/li/a)[28]");
	private By ResearchForInvestors = By.xpath("(//ul[@class='subList']/li/a)[29]");
	private By MarketUpdate = By.xpath("(//ul[@class='subList']/li/a)[30]");
	private By SuperMustHaveStocks = By.xpath("(//ul[@class='subList']/li/a)[31]");
	private By SuperShareKhanClassRoom = By.xpath("(//ul[@class='subList']/li/a)[32]");
	private By PortFolio = By.xpath("(//ul[@class='subList']/li/a)[33]");
	private By SuperOfferingInvestors = By.xpath("(//ul[@class='subList']/li/a)[34]");
	private By ExchangeMargin = By.xpath("(//ul[@class='subList']/li/a)[35]");
	private By otherImportantThings = By.xpath("(//ul[@class='subList']/li/a)[36]");
	private By joinShareKhan = By.xpath("(//ul[@class='subList']/li/a)[37]");
	private By LtcgTax = By.xpath("(//ul[@class='subList']/li/a)[38]");

	private By ActiveOverview = By.xpath("(//ul[@class='subList']/li/a)[39]");
	private By ActiveResearchForTrader = By.xpath("(//ul[@class='subList']/li/a)[40]");
	private By ActiveMarketUpdate = By.xpath("(//ul[@class='subList']/li/a)[41]");
	private By ActiveMustDo = By.xpath("(//ul[@class='subList']/li/a)[42]");
	private By ActivePortFolio = By.xpath("(//ul[@class='subList']/li/a)[43]");
	private By ActiveOpeningTrader = By.xpath("(//ul[@class='subList']/li/a)[44]");
	private By LearnAndTrade = By.xpath("(//ul[@class='subList']/li/a)[45]");
	private By ActiveotherImportantThings = By.xpath("(//ul[@class='subList']/li/a)[46]");
	private By ActivejoinShareKhan = By.xpath("(//ul[@class='subList']/li/a)[47]");
	private By ActiveShareKahanClassRoom = By.xpath("(//ul[@class='subList']/li/a)[48]");
	private By ActiveExchangeMargin = By.xpath("(//ul[@class='subList']/li/a)[49]");

	private By LoginId = By.xpath("//input[@name='emailLoginId']");
	private By Password = By.xpath("//input[@name='br_pwd']");
	private By LoginBtn = By.xpath("//button[@type='submit']");

	private By TotpLoginBtn = By.xpath("//button[@type='submit']");

	public LaunchShareKhanPage(WebDriver driver) {
		this.driver = driver;
		eutil = new ElementUtil(driver);
	}

	public void launchShareKhanSite(String url) {
		eutil.launchUrl(url);
		eutil.doClick(close);
	}

	public String getTitle() {
		return eutil.doGetTitle();
	}

	public boolean allElementIsDisplayed() throws InterruptedException {
		Thread.sleep(1000);
		eutil.doIsDisplayed(Market);
		Thread.sleep(1000);
		eutil.doIsDisplayed(NewToMarket);
		Thread.sleep(1000);
		eutil.doIsDisplayed(SuperInvestor);
		Thread.sleep(1000);
		eutil.doIsDisplayed(MutualFunds);
		Thread.sleep(1000);
		eutil.doIsDisplayed(ActiveTrader);
		Thread.sleep(1000);
		eutil.doIsDisplayed(Research);
		Thread.sleep(1000);
		eutil.doIsDisplayed(EducationFirst);
		Thread.sleep(1000);
		eutil.doIsDisplayed(Login);
		Thread.sleep(1000);
		return eutil.doIsDisplayed(ProductAndServices);
	}

	public void menuAndMenuElementDisplayed() throws InterruptedException {
		eutil.clickElementWhenReady(Menu, 20, 5);
		Thread.sleep(2000);
		eutil.doActionMoveToElement(MenuElements);
	}

	public void mouseHover_On_Market_And_MarketElements() throws InterruptedException {
		Thread.sleep(2000);
		eutil.doActionMoveToElement(Market);
		eutil.doActionMoveToElement(MarketSummary);
		eutil.doActionMoveToElement(marketstats);
		eutil.doActionMoveToElement(Derivatives);
		eutil.doActionMoveToElement(News);
		eutil.doActionMoveToElement(Ipo);
		eutil.doActionMoveToElement(Npo);
		eutil.doActionMoveToElement(Bonds);
		eutil.doActionMoveToElement(indices);
		eutil.doActionMoveToElement(EventsAndCalnder);
		eutil.doActionMoveToElement(Commodity);
	}

	public void mouseHover_On_New_TO_Market_And_MarketElements() throws InterruptedException {

		eutil.refresh();
		eutil.doActionMoveToElement(NewToMarket);
		Thread.sleep(2000);
		eutil.doActionMoveToElement(Overview);
		eutil.doActionMoveToElement(MustHaveStocks);
		eutil.doActionMoveToElement(Offering);
		eutil.doActionMoveToElement(KnowledgeCenter);
		eutil.doActionMoveToElement(OtherImportantThings);
		eutil.doActionMoveToElement(SharekhanClassroom);
		eutil.doActionMoveToElement(IHaveMoney);
	}

	public void mouseHover_On_Super_InvestorElements() throws InterruptedException {

		eutil.refresh();
		eutil.doActionMoveToElement(SuperInvestor);
		Thread.sleep(2000);
		eutil.doActionMoveToElement(SuperOverview);
		eutil.doActionMoveToElement(ResearchForInvestors);
		eutil.doActionMoveToElement(MarketUpdate);
		eutil.doActionMoveToElement(SuperMustHaveStocks);
		eutil.doActionMoveToElement(SuperShareKhanClassRoom);
		eutil.doActionMoveToElement(PortFolio);
		eutil.doActionMoveToElement(SuperOfferingInvestors);
		eutil.doActionMoveToElement(ExchangeMargin);
		eutil.doActionMoveToElement(otherImportantThings);
		eutil.doActionMoveToElement(joinShareKhan);
		eutil.doActionMoveToElement(LtcgTax);
	}

	public void mouseHover_On_ActiveTrader_AndElements() throws InterruptedException {
		eutil.refresh();
		eutil.doActionMoveToElement(ActiveTrader);
		Thread.sleep(2000);
		eutil.doActionMoveToElement(ActiveOverview);
		eutil.doActionMoveToElement(ActiveResearchForTrader);
		eutil.doActionMoveToElement(ActiveMarketUpdate);
		eutil.doActionMoveToElement(ActiveMustDo);
		eutil.doActionMoveToElement(ActivePortFolio);
		eutil.doActionMoveToElement(ActiveOpeningTrader);
		eutil.doActionMoveToElement(LearnAndTrade);
		eutil.doActionMoveToElement(ActiveotherImportantThings);
		eutil.doActionMoveToElement(ActivejoinShareKhan);
		eutil.doActionMoveToElement(ActiveShareKahanClassRoom);
		eutil.doActionMoveToElement(ActiveExchangeMargin);
	}

	public void enterUserName(String un) {
		eutil.doClick(Login);
		eutil.switchToChild();
		eutil.doSendKeys(LoginId, un);
	}

	public void enterPassword(String pwd) {
		eutil.doSendKeys(Password, pwd);
	}

	public void LoginBtn() throws InterruptedException {

		eutil.doClick(LoginBtn);
		Thread.sleep(15000);
		eutil.doClick(TotpLoginBtn);

	}

	public PortFolioPage doLogin(String un, String pwd) throws InterruptedException {
		eutil.doClick(Login);
		eutil.switchToChild();
		eutil.doSendKeys(LoginId, un);
		eutil.doSendKeys(Password, pwd);
		eutil.doClick(LoginBtn);
		Thread.sleep(15000);
		eutil.doClick(TotpLoginBtn);
		return new PortFolioPage(driver);
	}

}
