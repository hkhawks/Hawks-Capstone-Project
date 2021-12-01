package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPageObject;
import utilities.UtilityClass;

public class RetailPageStepDef extends Base{
	RetailPageObject retailPageObject = new RetailPageObject();
	
	@Given("^user is on Retail website$")
	public void user_is_on_Retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Actual Title is matching with expected title");
		UtilityClass.takeScreenShot();
	}
	
	@When("User click  on MyAccount")
	public void user_click_on_my_account() {
		retailPageObject.clickOnMyAccount();
		logger.info("user clicked on MyAccount");
		UtilityClass.takeScreenShot();
		

	}
	@When("User click on Login")
	public void user_click_on_login() {
		retailPageObject.clickOnLogin();
		logger.info("user clicked on login");
		UtilityClass.takeScreenShot();

	}
	 @When("^User enter username ‘hawks11@tekshool.com’ and password 'Hawks2021’$")
	   public void user_enter_username_hawks11_tekshool_com_and_password_hawks2021(String emailValue, String passwordValue) {
		   retailPageObject.enterEmailAndPassword(emailValue, passwordValue);
			logger.info("user enters username and password");
			UtilityClass.takeScreenShot();
	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
	   retailPageObject.clickOnLoginButton();
		logger.info("user clicks on login button");
		UtilityClass.takeScreenShot();
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
	    retailPageObject.myAccountTextisPresent();
		logger.info("uer is logged in to my account dashboard");
		UtilityClass.takeScreenShot();
	}
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	   retailPageObject.registerAfiliateAccount();
		logger.info("user clicked on register for affiliate account link");
		UtilityClass.takeScreenShot();
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		retailPageObject.enterCompany(info.get(0).get("comapnyName"));
		retailPageObject.etenrWebsite(info.get(0).get("website"));
		retailPageObject.enterTaxID(info.get(0).get("taxId"));
		retailPageObject.enterChequePayee(info.get(0).get("chequePagee"));
		retailPageObject.selectCheque();
		logger.info("user filled the form");
		UtilityClass.takeScreenShot();
		
	}
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailPageObject.clickAgreeBox();
		logger.info("user checks the box");
		UtilityClass.takeScreenShot();
	}
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailPageObject.clickContinueButton();
		logger.info("user clicks on continue button");
		UtilityClass.takeScreenShot();
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retailPageObject.successMessage();
		logger.info("user sees a success message");
		UtilityClass.takeScreenShot();
	}
	
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_Edit_your_affiliate_informationlink() {
		retailPageObject.editAffiliateInfo();
		logger.info("user clicks on edit your affiliate info link");
		UtilityClass.takeScreenShot();
		
	}
	@And("user click on Bank Transfer radio button")
	public void user_click_on_Bank_Transfer_radio_button() {
		retailPageObject.selecBankOption();
		logger.info("user clicks on Bank transfer button");
		UtilityClass.takeScreenShot();
		
	}
	@And("User fill Bank information with below information")
	public void user_fill_Bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		retailPageObject.enterBankName(info.get(0).get("bankName"));
		retailPageObject.enterBranchNum(info.get(0).get("branchNumber"));
		retailPageObject.enterSwiftCode(info.get(0).get("swiftCode"));
		retailPageObject.enterAccountName(info.get(0).get("accountName"));
		retailPageObject.enterAccountNumber(info.get(0).get("accountNumber"));
		logger.info("user filled the bank information");
		UtilityClass.takeScreenShot();
		
	}
	@And("User click on Continue button")
	public void user_click_on_Continue_button() {
		retailPageObject.continueButton();
		logger.info("user clicked on continue button");
		UtilityClass.takeScreenShot();
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_MSG() {
		retailPageObject.successMessageAlert();
		logger.info("user sees success MSG");
		UtilityClass.takeScreenShot();
	}
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_Edit_your_account_information_link(){
		retailPageObject.editAccountInfo();
		logger.info("user clicked on your account info link");
		UtilityClass.takeScreenShot();
	}
	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		
	List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
	retailPageObject.modifyFName(info.get(0).get("fName"));
	retailPageObject.modifyLName(info.get(0).get("lName"));
	retailPageObject.modifyEmail(info.get(0).get("email"));
	retailPageObject.modifyPhone(info.get(0).get("phone"));
	logger.info("user modified the information");
	UtilityClass.takeScreenShot();
	}
	
	@And ("User click on continue button")
	public void user_click_on_cont_button() {
		retailPageObject.clickOnConButton();
		logger.info("suer clicked on continue button");
		UtilityClass.takeScreenShot();
	}
	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated(){
		retailPageObject.successMsg();
		logger.info("user sees a message: you account has been successfully updated");
		UtilityClass.takeScreenShot();
	}
	



}
