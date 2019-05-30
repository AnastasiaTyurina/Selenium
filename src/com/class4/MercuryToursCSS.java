package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursCSS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Smith");
		driver.findElement(By.cssSelector("input[name='register']")).click();
		driver.close();

	}

}
