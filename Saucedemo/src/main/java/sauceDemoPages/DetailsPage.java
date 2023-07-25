package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage {

	@FindBy(id="first-name")
	private WebElement firstname;
	
	@FindBy(id="last-name")
	private WebElement lastname;
	
	@FindBy(id="postal-code")
	private WebElement postalcode;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	public DetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void FirstName() {
		firstname.sendKeys("Arun");
		}
	
	public void Lastname() {
		lastname.sendKeys("Aj");
		}
	public void Postalcode() {
		postalcode.sendKeys("600063");
		}
	public void ClickContinue() {
		continueBtn.click();
		}
}
