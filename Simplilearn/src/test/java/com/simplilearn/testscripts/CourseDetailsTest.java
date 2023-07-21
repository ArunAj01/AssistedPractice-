package com.simplilearn.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.simplilearn.pages.CoursePage;
import com.simplilearn.pages.LandingPage;

public class CourseDetailsTest {

WebDriver driver;
	
	@BeforeTest
	public void lauchApp() {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//1) Open the browser
		driver=new ChromeDriver(options);
		
		//2) Maximize it
		driver.manage().window().maximize();
		
		//3) Navigate to application
		driver.get("https://www.simplilearn.com");
	}
	
	@Test
	public void courseDetails() {
		
	//4) Hover the pointer over 'All Courses'.
		LandingPage landingpage=new LandingPage(driver);
		landingpage.hoverOverAllCourses();
		
	//5) Hover the pointer over 'Software Development'
		landingpage.hoverOverSoftwareDevelopment();
		
	//6) Click on 'Automation Testing Masters Program'
		landingpage.clickAutomationTesting();
		
	//7) Verify the text ‘Automation Test Engineer' is visible on the next page
		CoursePage coursePage=new CoursePage(driver);
		String exceptedText="Automation Test Engineer";
		String ActualText=coursePage.VerifyAutomationTesting();
		Assert.assertEquals(exceptedText, ActualText);
		

	}
	
	@AfterTest
	public void closeBrowser() {
	//driver.quit();	
	}
}
