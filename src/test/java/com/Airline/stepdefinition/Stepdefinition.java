package com.Airline.stepdefinition;

import java.awt.AWTException;

import com.Airline.resource.Base;
import com.Airlinr.object.Bookingpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Base{
	@Given("user launch the browser")
	public void user_launch_the_browser() throws AWTException {
		openbrowser();
	   
	}

	@When("user select the from option and return option")
	public void user_select_the_from_option_and_return_option() {
		Bookingpage page1= new Bookingpage();
		Bookingpage page1op2= new Bookingpage();
		
		formop(page1.getFrom()).selectByIndex(1);
		formop(page1op2.getGetdest()).selectByIndex(1);
		
		

	}

	@Then("close the browser")
	public void close_the_browser() {
	driv.quit();    
	}



}
