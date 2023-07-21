package com.simplilearn.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private Actions actions;
	private WebDriverWait wait;
	
@FindBy(xpath="//span[contains(@class,'courses-menu')]")
private WebElement allcourse;

@FindBy(xpath="(//a[@title='Software Development'])")
private WebElement softwareDevelopment;

@FindBy(xpath="//*[@id=\"megamenu-box\"]/ul/li[11]/ul/li[2]/div[2]/div[2]/a/a/span")
private WebElement automationTesting;




	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	actions=new Actions(driver);	
	wait= new WebDriverWait(driver, Duration.ofSeconds(60)); 
	}
	
	
	public void hoverOverAllCourses() {
		actions.moveToElement(allcourse).build().perform();
		//allcourse.click();
	}
	
	public void hoverOverSoftwareDevelopment() {
		//actions.moveToElement(softwareDevelopment).build().perform();
		//wait.until(ExpectedConditions.visibilityOf(softwareDevelopment));
		softwareDevelopment.click();
	}
	
	public void clickAutomationTesting() {
		//actions.moveToElement(softwareDevelopment).build().perform();
		wait.until(ExpectedConditions.visibilityOf(automationTesting));
		automationTesting.click();
	}
	
	
}
