package com.class9;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		String url="http://the-internet.herokuapp.com";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[13]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Disable']")));
		String textToEnter="Hello";
		driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).sendKeys(textToEnter);
		String returnedText=driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).getAttribute("value");
		if(returnedText.equals(textToEnter)) {
			System.out.println("Text is entered");
		}else {
			System.out.println("Text "+textToEnter+" is NOT entered");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
