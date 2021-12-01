package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopAndNoteBooksPageObject;
import utilities.UtilityClass;

public class LaptopAndNBooksStepDef extends Base {
	
	LaptopAndNoteBooksPageObject labtopandNBooksPageObj = new LaptopAndNoteBooksPageObject();
	
	@Given("user is on Retail website")
	public void user_is_on_Retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Actual Title is matching with expected title");
		UtilityClass.takeScreenShot();	
	}
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		labtopandNBooksPageObj.laptopsAndNoteBooks();
		logger.info("user clicked on Laptop &NoteBook tab");
		UtilityClass.takeScreenShot();
		
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		labtopandNBooksPageObj.showAllLaptopsAndNoteBooks();
		logger.info("user clicked on show all laptops and NoteBooks option");
		UtilityClass.takeScreenShot();
			
	}
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		labtopandNBooksPageObj.macBook();
		logger.info("user clicked on MacBook item");
		UtilityClass.takeScreenShot();
	}
		
	@When("User click add to Cart button")
	public void user_click_add_to_Cart_button() {
		labtopandNBooksPageObj.addToCart();
		logger.info("user clicked add to cart button");
		UtilityClass.takeScreenShot();
		
	}
		
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		labtopandNBooksPageObj.successMessage();
		logger.info("user sees success massage");
		UtilityClass.takeScreenShot();
		
	}
	@Then("User should see ‘1 tem(s)-602.00’ showed to the cart")
	public void user_should_see_1_tem_602_showed_to_the_cart() {
		labtopandNBooksPageObj.showItem602();
		logger.info("user sees item 602 in the cart");
		UtilityClass.takeScreenShot();
		
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		labtopandNBooksPageObj.cartOption();
		logger.info("user clicked on cart option");
		UtilityClass.takeScreenShot();
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		labtopandNBooksPageObj.removeMac();
		logger.info("user clicked on x button to remove the item");
	}
	@Then("item should be removed and cart should show ‘0 item(s)’")
	public void item_should_be_removed_and_cart_should_show_0_item () {
		labtopandNBooksPageObj.cartEmpty();
		logger.info("item is removed from cart");
		UtilityClass.takeScreenShot();
	}
	
	@And("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_MacBook(){
		labtopandNBooksPageObj.comparisonIconMacBook();
		logger.info("user click on MakBook comparison icon");
		UtilityClass.takeScreenShot();
		
	}
	@And("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() {
		labtopandNBooksPageObj.comparisonIconMakBookAir();
		logger.info("user click on MakBook comparison icon");
		UtilityClass.takeScreenShot();
	}
	
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison(){
		labtopandNBooksPageObj.comparisonSucessMessage();
		logger.info("user sees success message that MacBook Air is added to product comparison");
		UtilityClass.takeScreenShot();
		
	}
	@And("User click on Product comparison link")
	public void user_click_on_Product_comparison_link () {
		labtopandNBooksPageObj.productComprisonLink();
		logger.info("user clicks on product comparison link");
		UtilityClass.takeScreenShot();
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_Product_Comparison_Chart() {
		labtopandNBooksPageObj.comparisonChart();
		logger.info("user sees comparison chart");
		UtilityClass.takeScreenShot();
	}
	@And("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() {
		labtopandNBooksPageObj.messageYouMustLogin();
		logger.info("user clicks on heart icon to add sony Vaio");
		UtilityClass.takeScreenShot();
		
	}
	@Then ("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list(){
		labtopandNBooksPageObj.messageYouMustLogin();
		logger.info("user gets a message to login or create account to save Sony to wish list");
		UtilityClass.takeScreenShot();
		
	}
	@And("User click on ‘MacBook Pro’ item")
	public void user_click_on_MacBook_Pro_item(){
		labtopandNBooksPageObj.macBookProIcon();
		logger.info("user clicked on MacBook Pro icon");
		UtilityClass.takeScreenShot();
		
	}
	@Then("User should see  ‘$2,000.00’ price tag is present on UI.")
	public void user_should_see_$2000_price_tag_is_present_on_UI(){
		labtopandNBooksPageObj.priceTagIsPresent();
		logger.info("user sees the 2000 price tag is present");
		UtilityClass.takeScreenShot();
	}


}
