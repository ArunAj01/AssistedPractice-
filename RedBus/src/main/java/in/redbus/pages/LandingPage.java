package in.redbus.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	
	
	//from location
	@FindBy(id="src")
	private WebElement fromvalue;
	
	//to location
	@FindBy(id="dest")
	private WebElement tovalue;
	
	//click datebutton
	@FindBy(xpath="//div[contains(@id,'onwardCal')]")
	private WebElement clickDate;
	
	//choose date
	@FindBy(xpath="(//span[contains(@class,'dkWAbH')])[5]")
	private WebElement date;
	
	//select search bus
	@FindBy(id="search_button")
	private WebElement searchBus;
	

	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectFromLocation() {
		fromvalue.sendKeys("Mumbai");
	}
	
	public void selectToLocation() {
		tovalue.sendKeys("Pune");
	}
	
	public void ClickDate() {
		clickDate.click();
	}
	
	public void selectDate() {
		date.click();
	}
	
	public void SearchBus() {
		searchBus.click();
	}
	
	
}
