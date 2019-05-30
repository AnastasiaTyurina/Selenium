package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(1000);
		WebElement continentDD=driver.findElement(By.id("continents"));
		Select obj=new Select(continentDD);
		obj.selectByIndex(3);
		Thread.sleep(1000);
		obj.selectByVisibleText("North America");
		Thread.sleep(1000);
		obj.selectByValue("");
		Thread.sleep(1000);
		

	}

}
