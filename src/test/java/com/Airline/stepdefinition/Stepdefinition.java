package com.Airline.stepdefinition;

import java.awt.AWTException;

import com.Airline.resource.Base;
import com.Airlinr.object.Bookingpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Base{
	@Given("user launch the browser")
	public void user_launch_the_browser() throws AWTException, InterruptedException {
		openbrowser();
	   
	}

	@When("user select the from option and return option")
	public void user_select_the_from_option_and_return_option() {
		Bookingpage page1= new Bookingpage();
		Bookingpage page1op2= new Bookingpage();
		Bookingpage page1op3= new Bookingpage();
		Bookingpage page1op4= new Bookingpage();
		Bookingpage page1op5= new Bookingpage();
		Bookingpage page1op6= new Bookingpage();
		//Bookingpage page1op7= new Bookingpage();
		//Bookingpage page1op8= new Bookingpage();
		Bookingpage page1op9= new Bookingpage();

		formop(page1.getFrom()).selectByIndex(1);
		formop(page1op2.getGetdest()).selectByIndex(1);
		formop(page1op3.getMon()).selectByIndex(1);
		formop(page1op4.getDay()).selectByIndex(1);
		formop(page1op5.getMonth()).selectByIndex(1);
		formop(page1op6.getDDAy()).selectByIndex(1);
        click(page1.getRet());	
		
		formop(page1op9.getAdcount()).selectByIndex(1);
        click(page1.getButton());
        //formop(page1op2.getGetdest());
		
		

	}

	@Then("close the browser")
	public void close_the_browser() {
	//driv.quit();    
	}



}
