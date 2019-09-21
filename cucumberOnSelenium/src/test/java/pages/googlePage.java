package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import commonUtility.base;

public class googlePage {
	
	base base = new base();
	
	private By btnGetStarted = By.xpath("//a[@class='h-c-header__cta-li-link h-c-header__cta-li-link--primary']");
	private By txtPage = By.xpath("//img[@class='h-c-header__company-logo-img--standard']");
	
	public void validatePageTitle() {
		base.switchTabs(1);
		Assert.assertTrue(base.getTitle().contains("Gmail: Secure Enterprise Email for Business | G Suite"));
		}
	
	public void clickGetButton() {
		base.elementToBeClickable(btnGetStarted);
	}

}
