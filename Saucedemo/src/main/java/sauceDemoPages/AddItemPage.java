package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddItemPage {
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addfirstitem;
	
	@FindBy(xpath="//a[contains(@class,'shopping_cart_link')]")
	private WebElement viewcart;
	
	public AddItemPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AddFirstItem() {
		addfirstitem.click();
	}
	
	public void ClickViewCart() {
		viewcart.click();
	}

}
