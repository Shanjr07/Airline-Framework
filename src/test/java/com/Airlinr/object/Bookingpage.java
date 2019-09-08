package com.Airlinr.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Airline.resource.Base;

public class Bookingpage extends Base{
	public Bookingpage() {
		PageFactory.initElements(driv,this);
		
	}
	 @FindBy(name="forigin")
	 private WebElement from;
	public WebElement getFrom() {
		return from;
	}
	@FindBy(name="fdestination")
	private WebElement getdest;
	public WebElement getGetdest() {
		return getdest;
	}
	 
	

}
