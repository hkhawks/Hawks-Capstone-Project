package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopAndNoteBooksPageObject extends Base {
	
	
	public LaptopAndNoteBooksPageObject () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksIcon;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopAndNoteBooks; 
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookItem;
	
	@FindBy(id = "//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement addToCart1;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath = "//h2[text()='$602.00']")
	private WebElement item602Showed;
	
	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement cartOption;
	
	@FindBy(xpath = "//i[@class='fa fa-times-circle']")
	private WebElement removeItem;
	
	@FindBy(xpath = "//body/div[@id='error-not-found']/div[1]/div[1]/p[1]")
	private WebElement cartIsEmpty;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement productComparisonIconMacBook;
	
	@FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement productComparisonIconMacBookAir;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement compareSuccessMessage;
	
	@FindBy(xpath = "//a[contains(text(),'product comparison')]")
	private WebElement comparisonLink;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/td[1]")
	private WebElement compareChart;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement wishList;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]")
	private WebElement youMustLogin;
	
	@FindBy(xpath ="//a[text()='MacBook Pro']")
	private WebElement macBookPro;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[2]/li[1]/h2[1]")
	private WebElement price2000IsPresent;

	

	public void laptopsAndNoteBooks () {
		laptopsAndNotebooksIcon.click();
	}
	public void showAllLaptopsAndNoteBooks() {
		showAllLaptopAndNoteBooks.click();
	}
	public void macBook() {
		macBookItem.click();
		
	}
	 public void addToCart() {
		 addToCart1.click();
	 }
	
	 public boolean successMessage() {
		 if(successMessage.isDisplayed())
			 return true;
		 else
			 return false;
	 }
	 public boolean showItem602() {
		 if(item602Showed.isDisplayed())
			 return true;
		 else 
			 return false;
	 }
	 public void cartOption() {
		 cartOption.click();
	 }
	 
	 public void removeMac() {
		 removeItem.click();
	 }
	 public boolean cartEmpty() {
		 if(cartIsEmpty.isDisplayed())
			 return true;
		 else
			 return false;
	 }
	 
	 public void comparisonIconMacBook() {
		 productComparisonIconMacBook.click();
	 }
	 public void comparisonIconMakBookAir() {
		 productComparisonIconMacBookAir.click();
	 }
	 public boolean comparisonSucessMessage() {
		 if(compareSuccessMessage.isDisplayed())
			 return true;
		 else
			 return false;
	 }
	 public void productComprisonLink() {
		 comparisonLink.click();
	 }
	 public boolean comparisonChart() {
		 if(compareChart.isDisplayed())
			 return true;
		 else 
			 return false;
	 }
	 public void sonWishList() {
		 wishList.click();
	 }
	 
	 public boolean messageYouMustLogin() {
		 if(youMustLogin.isDisplayed())
			 return true;
		 else 
			 return false;
	 }
	 public void macBookProIcon() {
		 macBookPro.click();
	 }
	 
	 public boolean priceTagIsPresent() {
		 if(price2000IsPresent.isDisplayed())
			 return true;
		 else
			 return false;
	 }
	 
	 
	 
	 
	

}
