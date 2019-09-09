package com.Airline.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Airline.resource.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Base{
	@Before
	public void first() {
		System.out.println("Airline project");
	}
	
	@After
	public void addscren(Scenario scenario) {
		if(scenario.isFailed()) {
			System.out.println(scenario);
final byte[] scren=((TakesScreenshot)driv).getScreenshotAs(OutputType.BYTES);
  System.out.println(scren);
  scenario.embed(scren, "image/png");
		System.out.println(scren);
		
		}
		
	}

}
