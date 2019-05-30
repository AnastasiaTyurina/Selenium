package com.class6;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownReview {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement countries=driver.findElement(By.cssSelector("select#continents"));
		Select select=new Select(countries);
	
		select.selectByVisibleText("Africa");
		Thread.sleep(2000);
		select.selectByIndex(5);
		Thread.sleep(2000);
		List<WebElement> options=select.getOptions();
		System.out.println(options.size());
		Iterator<WebElement> it=options.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}
		
		WebElement commands=driver.findElement(By.cssSelector("select#selenium_commands"));
		Select select1=new Select(commands);
		if(select1.isMultiple()) {
			select1.selectByVisibleText("Navigation Commands");
			Thread.sleep(2000);
			select1.selectByIndex(2);
			select1.selectByIndex(3);
			select1.selectByIndex(4);
		}
		Thread.sleep(2000);
		
		select1.deselectByIndex(2);
		Thread.sleep(2000);
		select1.deselectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		select1.deselectAll();
		Thread.sleep(2000);
		
		List<WebElement> options1=select1.getOptions();
		System.out.println(options1.size());
		for(int i=0; i<options1.size(); i++) {
			System.out.println(options1.get(i).getText());
		}
		
		Thread.sleep(2000);
		driver.quit();
	
	}

}
