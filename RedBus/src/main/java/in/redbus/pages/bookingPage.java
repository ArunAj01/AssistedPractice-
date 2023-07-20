package in.redbus.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bookingPage {
	private WebDriverWait wait;
	
	//selectBus
	@FindBy(xpath="(//div[contains(@class,'button')])[2]")
	private WebElement selectBus;
	
	@FindBy(xpath="//div[contains(@class,'button view-seats fr')]")
	private WebElement viewseat;
	
	@FindBy(xpath="//div[contains(@class,'radio-unchecked')]")
	private WebElement boadringPoint;
	
	@FindBy(xpath="(//div[contains(@class,'radio-unchecked')])[5]")
	private WebElement droppingPoint;
	
	@FindBy(id="gotoseat_btn")
	private WebElement viewseats;
	
	
	public bookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver, Duration.ofSeconds(60)); 
	}
	
	public void SelectBus() {
		
		wait.until(ExpectedConditions.visibilityOf(selectBus));
		selectBus.click();
	}
	
	public void ViewSeat() {
		
		wait.until(ExpectedConditions.visibilityOf(viewseat));
		viewseat.click();
	}
	
	public void ClickBoadringPoint() {
		
		wait.until(ExpectedConditions.visibilityOf(boadringPoint));
		boadringPoint.click();
	}
	public void ClickDroppingPoint() {
		
		wait.until(ExpectedConditions.visibilityOf(droppingPoint));
		droppingPoint.click();
	}
	
	public void ViewSeats() {
		
		
		viewseats.click();
	}

}
