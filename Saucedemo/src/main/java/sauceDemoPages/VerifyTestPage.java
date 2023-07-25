package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyTestPage {

	@FindBy(xpath="//h2[contains(@class,'complete-header')]")
	private WebElement vertifyText;
	
	public VerifyTestPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	public String VerifyText() {
		String ActualText=vertifyText.getText();
		return ActualText;
		}
}
