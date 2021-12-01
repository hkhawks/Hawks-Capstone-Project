package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePPageObject extends Base{
	public HomePPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	
	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement euro;
	
	@FindBy(xpath = "//body[1]/nav[1]/div[1]/div[1]/form[1]/div[1]/button[1]/strong[1]")
	private WebElement euroSign;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/p[1]")
	private WebElement shoppingCartEmpty;
	
	public void cucrrencyValu() {
		currency.click();
	}
	public void euroValue() {
		euro.click();
	}
	public boolean euroSignIsPresent() {
		if(euroSign.isDisplayed())
			return true;
		else
			return false;
	}
	public void shoppingCartClick() {
		shoppingCart.click();
	}
	public boolean emptyMessage() {
		if(shoppingCartEmpty.isDisplayed())
			return true;
		else 
			return false;
	}
	

}
