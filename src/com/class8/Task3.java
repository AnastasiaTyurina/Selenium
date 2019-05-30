package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.cssSelector("a[href='/Students/Actions']")).click();
		Actions action=new Actions(driver);
		WebElement click1=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		WebElement click2=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		WebElement click3=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement click4=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		action.clickAndHold(click1).perform();;
		Thread.sleep(2000);
		action.clickAndHold(click2).perform();;
		Thread.sleep(2000);
		action.clickAndHold(click3).perform();;
		Thread.sleep(2000);
		action.clickAndHold(click4).perform();;
		Thread.sleep(2000);
		driver.close();
		
	}

}
