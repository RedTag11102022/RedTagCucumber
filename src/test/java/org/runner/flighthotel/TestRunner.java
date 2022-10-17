package org.runner.flighthotel;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.JVMreports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition", dryRun = false, tags = {
		"@tc2" }, plugin = { "pretty:prettyreport.txt",
				"html:src\\test\\resources\\Reports\\HtmlReport",
				"json:src\\test\\resources\\Reports\\JsonReport\\jsonReport.json",
				"json:src\\test\\resources\\Reports\\JunitReport\\junitReport.xml"})
public class TestRunner {
	
	@AfterClass
	public static void report() {
		JVMreports.generateJVMReport("src\\test\\resources\\Reports\\JsonReport\\jsonReport.json");
		System.out.println("JVM Report Generated");
	}

}
