package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class hoverOver extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement hover= driver.findElement(By.xpath("//span[text()='DEMO SITES']"));
		Actions action=new Actions(driver);
		action.moveToElement(hover).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Automation Practice Switch Windows']")).click();
		Thread.sleep(2000);
		driver.close();
		
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement hoverOver= driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span"));
		Actions action2=new Actions(driver);
		action2.moveToElement(hoverOver).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
