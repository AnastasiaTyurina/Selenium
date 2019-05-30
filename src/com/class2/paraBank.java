package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Bob");
		driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
		driver.findElement(By.id("customer.address.street")).sendKeys("2511 20th Rd N");
		driver.findElement(By.id("customer.address.city")).sendKeys("Arlington");
		driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("22201");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("3478471010");
		driver.findElement(By.id("customer.ssn")).sendKeys("555265555");
		driver.findElement(By.id("customer.username")).sendKeys("Bob666");
		driver.findElement(By.id("customer.password")).sendKeys("789555");
		driver.findElement(By.id("repeatedPassword")).sendKeys("789555");
		
	}

}
