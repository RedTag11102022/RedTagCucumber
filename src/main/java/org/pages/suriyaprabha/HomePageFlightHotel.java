package org.pages.suriyaprabha;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class HomePageFlightHotel extends BaseClass {

	public HomePageFlightHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='active nav-link nav-border-bottom']")
	private WebElement btnHome;

	@FindBy(xpath = "//a[@class='main-link']")
	private WebElement imgMainBanner;

	@FindBy(xpath = "//div[@class='container search-container p-md-4']")
	private WebElement imgSearchBanner;

	@FindAll({@FindBy(xpath="//a[@class='nav-link nav-border-bottom ']"),@FindBy(xpath="//a[@href='/flight-hotel/']")})
	private WebElement btnFlightAndHotel;

	@FindBy(id = "tab_vacations")
	private WebElement btnVacationInBanner;

	@FindBy(xpath = "//li[@class='nav-item flight-hotel-tab']")
	private WebElement btnFlightHotelInBanner;

	@FindBy(xpath = "")
	private WebElement txtTo;

	@FindBy(id = "dyn_departure")
	private WebElement txtFrom;

	@FindBy(id = "dyn_destination")
	private WebElement btnCheckIn;

	@FindBy(xpath = "")
	private WebElement btnCheckOut;

	@FindBy(xpath = "")
	private WebElement dropdownCalendar;

	@FindBy(xpath = "")
	private WebElement dateCheckIn;

	@FindBy(xpath = "")
	private WebElement dateCheckOut;

	@FindBy(xpath = "")
	private WebElement btnSearchNow;

	@FindBy(xpath = "")
	private WebElement dropdownRoom;

	@FindBy(xpath = "")
	private WebElement dropdownPerson;

	@FindBy(xpath = "")
	private WebElement dropdownClass;

	@FindBy(xpath = "")
	private List<WebElement> dropdownEachRoom;

	@FindBy(xpath = "")
	private WebElement dropdownRoom1;

	@FindBy(xpath = "")
	private WebElement dropdownRoom2;

	@FindBy(xpath = "")
	private WebElement dropdownRoom3;

	@FindBy(xpath = "")
	private WebElement dropdownRoom4;

	@FindBy(xpath = "")
	private WebElement dropdownRoom5;

	@FindBy(xpath = "")
	private WebElement dropdownRoom6;

	@FindBy(xpath = "")
	private WebElement dropdownRoom1Adult;

	@FindBy(xpath = "")
	private WebElement dropdownRoom2Adult;

	@FindBy(xpath = "")
	private WebElement dropdownRoom3Adult;

	@FindBy(xpath = "")
	private WebElement dropdownRoom4Adult;

	@FindBy(xpath = "")
	private WebElement dropdownRoom5Adult;

	@FindBy(xpath = "")
	private WebElement dropdownRoom6Adult;

	@FindBy(xpath = "")
	private WebElement dropdownRoom1Children;

	@FindBy(xpath = "")
	private WebElement dropdownRoom2Children;

	@FindBy(xpath = "")
	private WebElement dropdownRoom3Children;

	@FindBy(xpath = "")
	private WebElement dropdownRoom4Children;

	@FindBy(xpath = "")
	private WebElement dropdownRoom5Children;

	@FindBy(xpath = "")
	private WebElement dropdownRoom6Children;

	@FindBy(xpath = "")
	private List<WebElement> dropdownEachRoomChild;

}