package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[contains(@name, 'firstName')]")).sendKeys("John");
		driver.findElement(By.xpath("//input[contains(@name, 'lastN')]")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[contains(@name, 'email')]")).sendKeys("JohnSmith@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name, 'register')]")).click();
		driver.close();
	}

}
