package org.pages.suriyaprabha;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPageFlightHotel extends BaseClass {

	public LoginPageFlightHotel() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="signinid")
	private WebElement btnSignInHomePage;
	
	@FindBy(xpath="//iframe[contains(@class,'optinly-sidebar-iframe optinly-sidebar-iframe')]")
	private WebElement frameGiftCard;
	
	@FindBy(xpath="//button[contains(@class,'popup-close-btn')]")
	private WebElement btnframeGiftCardClose;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='Email']")
	private WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@name='Password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement btnSignIn;
	
	@FindBy(xpath="//a[contains(@class,'mt-2 forgot-link')]")
	private WebElement btnForgotPassword;
	
	@FindBy(xpath="(//div[@class='col-md-6 mb-3'])[2]")
	private WebElement btnGoogle;
	
	@FindBy(xpath="(//div[@class='col-md-6 mb-3'])[1]")
	private WebElement btnFacebook;
	
	@FindBy(xpath="//button[text()='Done']")
	private WebElement btnForgotPasswordDone;
	
	
	@FindBy(xpath="//a[text()='Sign Up']")
	private WebElement btnSignUp;
	
	@FindBy(xpath="//input[@value='Reset Password']")
	private WebElement btnResetPassword;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement btnSubmitResetPassword;
	
	@FindBy(id="ForgotEmail")
	private WebElement txtEmailAddressAtForgotPassword;
	
	@FindBy(name="email")
	private WebElement txtFacebookEmailAddress;
	
	@FindBy(xpath="(//a[text()='click here'])[1]")
	private WebElement btnClickHereMail;
	
	@FindBy(xpath="//button[text()='Home ']")
	private WebElement btnHome;
	
	@FindBy(id="identifierId")
	private WebElement txtEmailAddressGoogleForgotPassword;
	
	@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[2]")
	private WebElement btnNextInEmailPageGoogleForgotPassword;
	

	@FindBy(name="Passwd")
	private WebElement txtPasswordGoogleForgotPassword;
	
	public WebElement getTxtEmailAddressGoogleForgotPassword() {
		return txtEmailAddressGoogleForgotPassword;
	}


	public WebElement getBtnNextInEmailPageGoogleForgotPassword() {
		return btnNextInEmailPageGoogleForgotPassword;
	}


	public WebElement getTxtPasswordGoogleForgotPassword() {
		return txtPasswordGoogleForgotPassword;
	}

	
	
	public WebElement getBtnHome() {
		return btnHome;
	}


	public WebElement getBtnClickHereMail() {
		return btnClickHereMail;
	}


	public WebElement getTxtFacebookEmailAddress() {
		return txtFacebookEmailAddress;
	}




	public WebElement getTxtEmailAddressAtForgotPassword() {
		return txtEmailAddressAtForgotPassword;
	}


	public WebElement getBtnSubmitResetPassword() {
		return btnSubmitResetPassword;
	}

	public WebElement getFrameGiftCard() {
		return frameGiftCard;
	}

	public WebElement getBtnframeGiftCardClose() {
		return btnframeGiftCardClose;
	}

	public WebElement getBtnResetPassword() {
		return btnResetPassword;
	}

	public WebElement getBtnSignInHomePage() {
		return btnSignInHomePage;
	}

	public WebElement getTxtEmailAddress() {
		return txtEmailAddress;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}

	public WebElement getBtnForgotPassword() {
		return btnForgotPassword;
	}

	public WebElement getBtnGoogle() {
		return btnGoogle;
	}

	public WebElement getBtnFacebook() {
		return btnFacebook;
	}

	public WebElement getBtnSignUp() {
		return btnSignUp;
	}

	public WebElement getBtnForgotPasswordDone() {
		return btnForgotPasswordDone;
	}

}
