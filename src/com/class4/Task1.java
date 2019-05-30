package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anastasia.interpreting@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("789546788aA!");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}

}
