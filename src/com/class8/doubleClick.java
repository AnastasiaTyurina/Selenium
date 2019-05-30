package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class doubleClick extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("username");
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.cssSelector("input[data-test='username']"))).perform();
		Thread.sleep(2000);
		driver.close();
		
		setUpDriver("chrome", "https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input[data-test='password']")).sendKeys("password");
		Actions action2 = new Actions(driver);
		action2.doubleClick(driver.findElement(By.cssSelector("input[data-test='password']"))).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
