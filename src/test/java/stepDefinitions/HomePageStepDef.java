package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePPageObject;
import utilities.UtilityClass;

public class HomePageStepDef extends Base{
	HomePPageObject homePPageObject = new HomePPageObject();
	
	@Given ("^User is on Retail website$")
	public void user_is_on_Retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Actual Title is matching with expected title");
		UtilityClass.takeScreenShot();	
	}
	@When("User click on Currency")
	public void user_click_on_Currency() {
		homePPageObject.cucrrencyValu();
		logger.info("user clicked on currency");
		UtilityClass.takeScreenShot();
	}
	@And("User Chose Euro from dropdown")
	public void user_Chose_Euro_from_dropdown() {
		homePPageObject.euroValue();
		logger.info("user chose euro");
		UtilityClass.takeScreenShot();
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_Euro() {
		homePPageObject.euroSignIsPresent();
		logger.info("currency changed to euro");
		UtilityClass.takeScreenShot();
		
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePPageObject.shoppingCartClick();
		logger.info("user clicks on shopping cart");
		UtilityClass.takeScreenShot();
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		homePPageObject.emptyMessage();
		logger.info("a message is dispalyed: your shopping cart is emtpy");
		UtilityClass.takeScreenShot();
	}

}
