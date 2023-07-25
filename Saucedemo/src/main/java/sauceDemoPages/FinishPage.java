package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
	
	@FindBy(id="finish")
	private WebElement finish;
	
	public FinishPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickCheckout() {
		finish.click();
		
}

}

