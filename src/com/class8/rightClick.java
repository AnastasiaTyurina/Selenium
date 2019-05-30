package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class rightClick extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.saucedemo.com");
		WebElement rightCLick = driver.findElement(By.cssSelector("input#user-name"));
		Actions action = new Actions (driver);
		action.contextClick(rightCLick).perform();
		Thread.sleep(2000);
		driver.close();

		setUpDriver("chrome", "https://www.saucedemo.com");
		WebElement rightClick2 = driver.findElement(By.cssSelector("input[type='password']"));
		Actions action2 = new Actions (driver);
		action2.contextClick(rightClick2).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
