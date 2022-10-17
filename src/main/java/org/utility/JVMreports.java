package org.utility;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.openxml4j.opc.Configuration;

public class JVMreports {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir") + "\\src\\test");

	}

	public static void generateJVMReport(String json) {
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\JVMReport");
		Configuration con = new Configuration(loc, "RedTagFlightHotel-Suriyaprabha");
		con.addClassifications("Browser Name", "chrome");
		con.addClassifications("Browser Version", "106");
		con.addClassifications("OS", "Windows 11");
		con.addClassifications("Environment", "QA");
		con.addClassifications("Sprint", "1");

		List<String> jsonFiles = new LinkedList<>();
		jsonFiles.add(json);
		ReportBuilder r = new ReportBuilder(jsonFiles, con);
		r.generateReports();

	}

}
