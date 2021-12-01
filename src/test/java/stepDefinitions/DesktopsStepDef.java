package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;
import utilities.UtilityClass;

public class DesktopsStepDef extends Base{
	
	DesktopsPageObject desktopsPageObject = new DesktopsPageObject();

	@Given ("^User is on Retail website$")
	public void user_is_on_Retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Actual Title is matching with expected title");
		UtilityClass.takeScreenShot();	
	}
	
	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() {
		desktopsPageObject.clickOnDesktops();
		logger.info("user clicked on Desktops tab");
		UtilityClass.takeScreenShot();	
	}
	
	@And("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() {
		desktopsPageObject.showAllDesktops();
		logger.info("user clicked on Show all Desktops");
		UtilityClass.takeScreenShot();
		
	}
	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		desktopsPageObject.contentsOfDesktops();
		logger.info("user sees all items are present in Desktops page");
		UtilityClass.takeScreenShot();
			
	}
//	@And("^User click  ADD TO CART option on ‘HP LP3065’ item$")
//	public void user_click_ADD_TO_CART_option_on_HP_LP3065_item(){
//		desktopsPageObject.clickonAddToCart();
//		logger.info("user clicked on Add To Cart option on HP LP3056");
//		UtilityClass.takeScreenShot();
//		
//	}
	
//	@And("^User select blue from Available Options$")
//	public void user_select_blue_from_Available_Options() {
//		desktopsPageObject.clickOnAvailableOptions();
//		logger.info("user selected blue from Available Options");
//		UtilityClass.takeScreenShot();	
//	}
	
	@And("^User select quantity 1$")
	public void user_select_quantity_1() {
		desktopsPageObject.qunatity1IsSelected();
		logger.info("user selected quanity 1");
		UtilityClass.takeScreenShot();
		
	}
	@And("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() {
		desktopsPageObject.clickAddToCartButton();
		logger.info("user clicked on Add to Cart Button");
		UtilityClass.takeScreenShot();
		
	}
	
	@Then("^User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_3065_to_your_Shopping_cart(){
		desktopsPageObject.isSucessMessagePresent();
		logger.info("success message is present and seend by user");
		UtilityClass.takeScreenShot();
		
	}
	
	@And("^User click  ADD TO CART option on ‘Canon EOS 5D’ item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_5D_item() {
		desktopsPageObject.addToCartCanon();
		logger.info("user clicked on Add To Cart option on Canon EOS 5D item");
		UtilityClass.takeScreenShot();
		
	}

	@And ("^User select color from dropdown ‘Red’$")
	public void user_select_color_from_dropdown_Red () {
		desktopsPageObject.selectRedColorOption();
		logger.info("red color option is selected from dropdown");
		UtilityClass.takeScreenShot();		
	}
//	@And ("^User select quantity 1$")
//	public void userSelectQuantityOne() {
//		desktopsPageObject.selectQuanity1();
//		logger.info("quantity 1 is seleted");
//		UtilityClass.takeScreenShot();	
//	}
	
//	@And("^User click add to Cart button$")
//	public void user_click_add_to_Cart_option() {
//		desktopsPageObject.addToCartOption();
//		logger.info("user clicked on addtoCart option");
//		UtilityClass.takeScreenShot();
//		
//	}
	
	@And("^User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_5D_to_your_shopping_cart(){
		desktopsPageObject.isAddToCartSucessMessagePresent();
		logger.info("user sees success message that Canon EOS has been added to shopping cart");
		UtilityClass.takeScreenShot();
	}
	
	@And("^User click on Canon EOS 5D item$")
	public void user_click_on_Canon_EOS_5D_item() {
		desktopsPageObject.canonEOSItem();
		logger.info("user clicked on Canon EOS 5D item");
		UtilityClass.takeScreenShot();
	}
	@And("^User click on write a review link$")
	public void user_click_on_write_a_review_link() {
		desktopsPageObject.writeReview();
		logger.info("user clicked on write a review link");
		UtilityClass.takeScreenShot();
	}
	@And("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information (String name, String review, String rating) {
		desktopsPageObject.writeNameAndReviewAndRating(name, review, rating);
		logger.info("user put thier name" + name + "and wrote thier review" + review + "and gave rating" + rating);
		UtilityClass.takeScreenShot();
	}
	@And("^User click on Continue Button$")
	public void user_click_on_Continue_Button() {
		desktopsPageObject.clickOnContinueButton();
		logger.info("user clicked on continue button");
		UtilityClass.takeScreenShot();
	}
	@Then ("^User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”$")
	public void then_User_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval(){
		logger.info("user sees message: Thank you for your review");
		UtilityClass.takeScreenShot();
		Assert.assertTrue(desktopsPageObject.thankYourForYourReview());
	}
}
