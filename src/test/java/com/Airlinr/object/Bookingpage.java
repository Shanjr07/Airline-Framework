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
	 public WebElement getMon() {
		return mon;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getDDAy() {
		return DDAy;
	}
	public WebElement getRet() {
		return ret;
	}
	public WebElement getOneway() {
		return oneway;
	}
	public WebElement getAdcount() {
		return adcount;
	}
	@FindBy(xpath="//select[@id='ddlDepMonth']")
	 private WebElement mon;
	 @FindBy(xpath="//select[@id='ddlDepDay']")
	 private WebElement day;
	 @FindBy(xpath="//select[@id='ddlRetMonth']")
	 private WebElement month;
	 @FindBy(xpath="//select[@id='ddlRetDay']")
	 private WebElement DDAy;
	 @FindBy(xpath="//label[text()='Return']")
	 private WebElement ret;
	 @FindBy(xpath="//label[text()='One way']")
	 private WebElement oneway;
	@FindBy(id="ddlAdultCount")
	private WebElement adcount;
	@FindBy(xpath="//input[@type='button']")
	private WebElement button;
	public WebElement getButton() {
		return button;
	}

}
