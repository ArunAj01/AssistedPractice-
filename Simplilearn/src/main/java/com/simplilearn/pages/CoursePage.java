package com.simplilearn.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {

	@FindBy(css="#root > div > div > div.dual-info > div > div.bootcamp-wrap > div.banner.no-partner > div > div.banner-left.col-md-8 > h1")
	private WebElement vertifyAutomationTesting;
	
	public CoursePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	public String VerifyAutomationTesting() {
		String ActualText=vertifyAutomationTesting.getText();
		return ActualText;
		}
}
