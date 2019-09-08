package com.Airline.resource;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driv;
	public static Select s;
	
	public void openbrowser() throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAGADESHAN R\\eclipse\\jaga01\\pro\\dri\\chromedriver.exe");
		driv= new ChromeDriver();
		driv.get("https://www.airnorth.com.au/");
		driv.manage().window().maximize();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		}
	public Select formop(WebElement e) {
		s=new Select(e);
		return s;
		
	}
	

}
