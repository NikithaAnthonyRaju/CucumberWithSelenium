package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import commonUtility.base;

public class gmailPage {
	
	base base = new base();
	
	private By lnkForWork = By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(@class,'h-c-header__nav-li-link')][contains(text(),'For Work')]");
	
	public void validatePageTitle() {
		Assert.assertTrue(base.getTitle().equalsIgnoreCase("Gmail - Free Storage and Email from Google"));
	}
	
	public void clickForWork() {
		base.elementToBeClickable(lnkForWork);
	}
	
}
