package com.class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		
		driver.findElement(By.linkText("Switch to")).click();
		driver.findElement(By.id("alert")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert=driver.switchTo().alert();
		String alertText = confirmAlert.getText();
		System.out.println(alertText);
		confirmAlert.dismiss();
		
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("Hello");
		promptAlert.accept();
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
