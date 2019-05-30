package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Smith");
		driver.findElement(By.name("phone")).sendKeys("5555555");
		driver.findElement(By.id("userName")).sendKeys("JohnSmith@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("123 Main st");
		driver.findElement(By.name("city")).sendKeys("Arlington");
		driver.findElement(By.name("state")).sendKeys("Virginia");
		driver.findElement(By.name("postalCode")).sendKeys("22201");
		driver.findElement(By.id("email")).sendKeys("John123");
		driver.findElement(By.name("password")).sendKeys("000000");
		driver.findElement(By.name("confirmPassword")).sendKeys("000000");
		driver.findElement(By.name("register")).click();
		
	}

}
