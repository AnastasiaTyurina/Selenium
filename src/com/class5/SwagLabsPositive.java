package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsPositive {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[data-test='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
		Thread.sleep(3000);
		boolean isDisplayed=driver.findElement(By.cssSelector("div[class='peek']")).isDisplayed();
		
		if(isDisplayed) {
			System.out.println("The robot icon is displayed");
		}else {
			System.out.println("The robot icon is NOT displayed");
		}
		
		boolean txtDisplayed=driver.findElement(By.cssSelector("div[class='product_label']")).isDisplayed();
		
		if(txtDisplayed) {
			System.out.println("The Products sign is displayed");
		}else {
			System.out.println("The Products sign is NOT displayed");
		}
		
		WebElement product=driver.findElement(By.xpath("//div[text()='Products']"));
		String value=product.getText();
		if(value.contains("Products")) {
			System.out.println("The sign contains the word products");
		}else {
			System.out.println("The sign does NOT contain the word products");
		}
		
		driver.close();
		
	}

}
