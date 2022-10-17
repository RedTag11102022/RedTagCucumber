package org.stepdefinition.flighthotel;

import org.utility.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClassFlightHotel extends BaseClass {

	@Before
	public void setUp() {
		browserLaunch("chrome");
		urlLaunch("http://www.redtag.ca");
		implicitlyWait(20);
	}
	@After
	public void down() {
//		quit();
	}

}
