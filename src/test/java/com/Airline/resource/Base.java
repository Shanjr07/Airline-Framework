package com.Airline.resource;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driv;
	public static Select s;
	
	public void openbrowser() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAGADESHAN R\\eclipse\\jaga01\\pro\\dri\\chromedriver.exe");
		driv= new ChromeDriver();
		driv.get("https://www.airnorth.com.au/");
		driv.manage().window().maximize();
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		}
	public Select formop(WebElement e) {
		s=new Select(e);
		return s;
		}
	public void click(WebElement ele)
	{
		ele.click();
	}
	public void getopttion() {
		List<WebElement> get = s.getOptions();
		for(int i=0;i<get.size();i++) {
			//WebElement el= get.get(i);
			//String ss= el.getText();
		}
		
		
	}
	

}
