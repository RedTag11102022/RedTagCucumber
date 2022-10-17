package org.stepdefinition.flighthotel;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.pages.suriyaprabha.LoginPageFlightHotel;
import org.utility.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepFlightHotel extends BaseClass {

	LoginPageFlightHotel loginPage = new LoginPageFlightHotel();
	// String facebookWindow="";

	@When("The user has click the {string} button")
	public void the_user_has_click_the_button(String button) throws InterruptedException {
		if (button.equals("Sign In Home Page")) {
			click(loginPage.getBtnSignInHomePage());
		} else if (button.equals("Sign In login Page")) {
			click(loginPage.getBtnSignIn());
		} else if (button.equals("Forgot Password")) {
			click(loginPage.getBtnForgotPassword());
		} else if (button.equals("Reset Password")) {
			click(loginPage.getBtnResetPassword());
		} else if (button.equals("Done")) {
			click(loginPage.getBtnForgotPasswordDone());
		} else if (button.equals("google")) {
			visibilityOfElement(40, loginPage.getBtnGoogle());
			Thread.sleep(5000);
			click(loginPage.getBtnGoogle());
		} else if (button.equals("facbook")) {
			visibilityOfElement(40, loginPage.getBtnFacebook());
			click(loginPage.getBtnFacebook());
		} else if (button.equals("sign Up")) {
			click(loginPage.getBtnSignUp());
		} else {
			throw new NoSuchElementException();
		}
	}

	@When("The user get the email with Reset Password link")
	public void the_user_get_the_email_with_Reset_Password_link() throws InterruptedException {
			Thread.sleep(50000);
	}

	@Then("The user has click the link on the email")
	public void the_user_has_click_the_link_on_the_email() throws InterruptedException {
		Thread.sleep(3000);
	}

	@When("The user has to fill the {string} and {string}")
	public void the_user_has_to_fill_the_and(String email, String pass) throws InterruptedException {
		sendKeys(loginPage.getTxtEmailAddress(), email);
		sendKeys(loginPage.getTxtPassword(), pass);
	}

	@When("The user has to fill the Email Address")
	public void the_user_has_to_fill_the_Email_Address(io.cucumber.datatable.DataTable data)
			throws InterruptedException {
		List<String> emailList = data.asList();
		sendKeys(loginPage.getTxtEmailAddressAtForgotPassword(), emailList.get(0));
		Thread.sleep(5000);
		System.out.println(getAttribute(loginPage.getTxtEmailAddressAtForgotPassword(), "value"));
		Assert.assertEquals("Please enter the valid Email Address", "suriyaprabhatest1989@gmail.com",
				getAttribute(loginPage.getTxtEmailAddressAtForgotPassword(), "value"));
	}


	@Then("The user should be in {string} page")
	public void the_user_should_be_in_page(String page) throws InterruptedException {
		if (page.equals("invalid login")) {
			Assert.assertTrue("Verify LoginPage URL", getCurrentUrl().contains("redtag"));
		} else if (page.equals("valid login")) {
			waitUrl(20, "https://profile.redtag.ca/my-account/promo");
			Assert.assertTrue("Verify LoginPage URL", getCurrentUrl().contains("my-account"));
		} else if (page.equals("valid home")) {
			waitUrl(20, "https://www.redtag.ca/");
			Assert.assertTrue("Verify HomePage URL", getCurrentUrl().contains("redtag"));
		} else if (page.equals("google")) {
//			Assert.assertTrue("Verify Google URL", getCurrentUrl().contains("google"));
			Thread.sleep(3000);
		} else if (page.equals("facebook")) {
			Thread.sleep(5000);
		} else if (page.equals("valid sign up")) {
			Assert.assertTrue("Verify SignUp Page URL", getCurrentUrl().contains("redtag"));
		} else {
			throw new NoSuchElementException();
		}

	}

}