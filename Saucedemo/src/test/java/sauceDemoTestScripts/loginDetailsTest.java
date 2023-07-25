package sauceDemoTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sauceDemoPages.AddItemPage;
import sauceDemoPages.CheckOutPage;
import sauceDemoPages.DetailsPage;
import sauceDemoPages.FinishPage;
import sauceDemoPages.LandingPage;
import sauceDemoPages.VerifyTestPage;

public class loginDetailsTest {

WebDriver driver;
	
	@BeforeTest
	public void LauchApp() {
		
		
		//1) Open the browser
		driver=new ChromeDriver();
		
		//2) Maximize it
		driver.manage().window().maximize();
		
		//3) Navigate to application
		driver.get("https://www.saucedemo.com");
	}
	
	@Test
	public void BuyItem() {
		
		//Enter username and password
		LandingPage landingPage=new LandingPage(driver);
		
		landingPage.UserName();
		landingPage.Password();
		landingPage.clickLoginButton();
		
		
		//add first product
		AddItemPage AddItemPage=new AddItemPage(driver);
		AddItemPage.AddFirstItem();
		
		
		//click cart icon at top right 
		AddItemPage.ClickViewCart();
		
		//click checkout
		CheckOutPage checkOutPage=new CheckOutPage(driver);
		checkOutPage.ClickCheckout();
		
		//enter details
		DetailsPage detailsPage=new DetailsPage(driver);
		detailsPage.FirstName();
		detailsPage.Lastname();
		detailsPage.Postalcode();
		
		//click continue
		detailsPage.ClickContinue();
		
		//click finish
		FinishPage finishPage=new FinishPage(driver);
		finishPage.ClickCheckout();
		
		//verify the text
		VerifyTestPage verifyTestPage=new VerifyTestPage(driver);
		String exceptedText="Thank you for your order!";
		String ActualText=verifyTestPage.VerifyText();
		Assert.assertEquals(exceptedText, ActualText);
	}
	
	
	@AfterTest
	public void CloseApp() {
		//close browser
	}
	
}
