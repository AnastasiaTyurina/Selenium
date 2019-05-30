package com.class8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.cssSelector("a[href='/Students/Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/button[1]")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		WebElement doubleClick=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/button[2]"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleClick).perform();
		Thread.sleep(2000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
