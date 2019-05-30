package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class iframe extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		//Way 1 
		//driver.switchTo().frame("iframe_a");
		//Way 2
		//WebElement elem=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		//driver.switchTo().frame(elem);
		//Way 3
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("arif");
		driver.switchTo().defaultContent();
		
	}

}
