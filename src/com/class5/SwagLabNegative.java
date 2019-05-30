package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabNegative {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standarduser");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[data-test='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		Thread.sleep(3000);
		boolean isDisplayed=driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed();
		if(isDisplayed) {
			System.out.println("An error is displayed");
		}else {
			System.out.println("An error is NOT displayed");
		}
		
		WebElement error=driver.findElement(By.cssSelector("h3[data-test='error']"));
		String value=error.getText();
		if(value.contains("Username and password do not match any user in this service")) {
			System.out.println("The error sign contains the elements");
		}else {
			System.out.println("The error sign does NOT contain the elements");
		}
		driver.close();
	}

}
