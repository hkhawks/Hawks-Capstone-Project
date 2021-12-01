package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base{
	public RetailPageObject () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	@FindBy(id = "input-email")
	private WebElement email;
	
	@FindBy(id = "input-password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value ='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountText;
	
	@FindBy(className = "Register for an affiliate account")
	private WebElement registerForAffiliate;
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;
	
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;
	
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxId;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[1]/label[1]")
	private WebElement payment;
	
	@FindBy(id = "input-cheque")
	private WebElement chequePayee;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreeBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement message;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliate;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankRadioButton;
	
	@FindBy(id = "input-bank-name")
	private WebElement bankName;
	
	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement abaNumber;
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCode;
	
	@FindBy(id = "input-bank-account-name")
	private WebElement accountName;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumber;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement contButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement succussAlertMessage;
	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAccount;
	
	@FindBy(id = "input-firstname")
	private WebElement editFName;
	
	@FindBy(id = "input-lastname")
	private WebElement editLName;
	
	@FindBy(id = "input-email" )
	private WebElement editEmail;
	
	@FindBy(id = "input-telephone")
	private WebElement editPhone;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement conButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successM;
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	public void clickOnLogin() {
		login.click();
	}
	public void enterEmailAndPassword(String emailValue, String passwordValue) {
		email.sendKeys(emailValue);
		password.sendKeys(passwordValue);
		
	}
	public void clickOnLoginButton() {
		loginButton.click();
		
	}
	public boolean myAccountTextisPresent() {
		if(myAccountText.isDisplayed())
			return true;
		else
			return false;
	}
	public void registerAfiliateAccount() {
		registerForAffiliate.click();
	}
	public void enterCompany(String companyValue) {
		company.sendKeys(companyValue);
	}
	public void etenrWebsite(String websiteValue) {
		website.sendKeys(websiteValue);
	}
	public void enterTaxID(String taxIdValue) {
		taxId.sendKeys(taxIdValue);
	}
	public void selectCheque() {
		payment.click();
	}
	public void enterChequePayee(String payeeValue) {
		chequePayee.sendKeys(payeeValue);
	}
	public void clickAgreeBox() {
		agreeBox.click();
	}
	public void clickContinueButton() {
		continueButton.click();
	}
	public boolean successMessage() {
		if(message.isDisplayed())
			return true;
		else 
			return false;
	}
	public void editAffiliateInfo() {
		editAffiliate.click();
	}
	public void selecBankOption(){
		bankRadioButton.click();
	}
	public void enterBankName(String bankNameValue) {
		bankName.sendKeys(bankNameValue);
	}
	public void enterBranchNum(String branchNumValue) {
		abaNumber.sendKeys(branchNumValue);
	}
	public void enterSwiftCode(String swiftCodeValue) {
		swiftCode.sendKeys(swiftCodeValue);
	}
	public void enterAccountName(String accountNameValue) {
		accountName.sendKeys(accountNameValue);
	}
	public void enterAccountNumber(String accountNumberValue) {
		accountNumber.sendKeys(accountNumberValue);
	}
	public void continueButton() {
		contButton.click();
	}
	public boolean successMessageAlert() {
		if(succussAlertMessage.isDisplayed())
			return true;
		else
			return false;
	}
	public void editAccountInfo() {
		editAccount.click();
	}

	public void modifyFName(String fNameValue) {
		editFName.sendKeys(fNameValue);
	}
	public void modifyLName(String lNameValue) {
		editLName.sendKeys(lNameValue);
	}
	public void modifyEmail(String emailValue) {
		editEmail.sendKeys(emailValue);
	}
	public void modifyPhone(String phoneValue) {
		editPhone.sendKeys(phoneValue);
	}
	public void clickOnConButton() {
		conButton.click();
	}
	public boolean successMsg() {
		if(successM.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	

}
