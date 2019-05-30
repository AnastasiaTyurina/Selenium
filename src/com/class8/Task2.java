package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.cssSelector("a[href='/Students/Actions']")).click();
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
