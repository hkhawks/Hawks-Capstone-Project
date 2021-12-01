package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPageObject extends Base{
	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "//div[@id='content']")
	private WebElement contentsOfDesktops;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
	private WebElement addToCart;
	
	//@FindBy(xpath= "//h3[contains(text(),'Available Options')]")
	//private WebElement availabelOptions;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantity1;
	
	@FindBy(xpath ="//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement addtoCart;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCartCanon;
	
	@FindBy(name = "option[226]")
	private WebElement selectRedColorOption;
	
//	@FindBy(xpath = "//input[@name='quantity']")
//	private WebElement selectQuantity1;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartOption;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement addToCartSuccessMessage;
	
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement clickOnCanonEOSItem;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement clickOnWriteReview;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement writeYourName;
	
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement writeYourReview;
	
	@FindBy(xpath = "//label[contains(text(),'Rating')]")
	private WebElement ratingGoodOrBad; 
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement thankYouMessage;
	
	
	

	public void clickOnDesktops() {
		desktops.click();
	}
	public void showAllDesktops() {
		showAllDesktops.click();
	}
	public boolean contentsOfDesktops() {
		if(contentsOfDesktops.isDisplayed())
			return true;
		else
			return false;
	}
//	public void clickonAddToCart() {
//		addToCart.click();
//	}	
//	public void clickOnAvailableOptions() {
//		availabelOptions.click();
//	}
	
	public boolean qunatity1IsSelected() {
		if(quantity1.isSelected())
		return true;
		else 
		return false;	
	}
	
	public void clickAddToCartButton() {
		addtoCart.click();
	}
	
	public boolean isSucessMessagePresent() {
		if(successMessage.isDisplayed())
			return true;
		else
		return false;
	}
	
	public void addToCartCanon() {
		addToCartCanon.click();
	}
	
	public boolean selectRedColorOption() {
		if(selectRedColorOption.isSelected())
		return true;
		else 
		return false;	
	}
//	public boolean selectQuanity1() {
//		if(selectQuantity1.isSelected())
//		return true;
//		else
//		return false;
//	}
//	public void addToCartOption() {
//		addToCartOption.click();
//	}
	public boolean isAddToCartSucessMessagePresent() {
		if(addToCartSuccessMessage.isDisplayed())
			return true;
		else
		return false;
	}
	
	public void canonEOSItem() {
		clickOnCanonEOSItem.click();
	}
	public void writeReview() {
		clickOnWriteReview.click();
	}
	public void writeNameAndReviewAndRating(String nameValue, String reviewValue, String ratingValue) {
		writeYourName.sendKeys(nameValue, reviewValue, ratingValue);
		//writeYourReview.sendKeys(reviewValue);
		//ratingGoodOrBad.sendKeys(ratingValue);
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public boolean thankYourForYourReview() {
		if(thankYouMessage.isDisplayed())
			return true;
		else
		return false;
		
	}

	
}
