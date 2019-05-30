package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCSS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("anastasia.interpreting@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("789546788aA!");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id$='0_2']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
