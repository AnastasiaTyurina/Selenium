package com.class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String a=alert.getText();
		if(a.equals("I am an alert box!")) {
			System.out.println("The text #1 is present");
			alert.accept();
		}else {
			System.out.println("The text #1 is NOT present");
		}
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click(); 
		Thread.sleep(2000);
		Alert alert2=driver.switchTo().alert();
		String b=alert2.getText();
		if(b.equals("Press a button!")) {
			System.out.println("The text #2 is present");
			alert.accept();
		}else {
			System.out.println("The text #2 is NOT present");
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
		Thread.sleep(2000);
		Alert alert3=driver.switchTo().alert();
		String c=alert3.getText();
		if(c.equals("Please enter your name")) {
			System.out.println("The text #3 is present");
		}
		else {
			System.out.println("The text #3 is NOT present");
		}
		Thread.sleep(2000);
		alert3.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
