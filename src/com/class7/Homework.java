package com.class7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.CommonMethods;

public class Homework extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();
		Thread.sleep(2000);
		String parent=driver.getTitle();
		String parentId=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a")).click();
		Thread.sleep(2000);
		Set <String> allWindows=driver.getWindowHandles();
		Iterator <String> it= allWindows.iterator();
		parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		child=driver.getTitle();
		System.out.println(child);
		String childId=driver.getWindowHandle();
		if(child.equals("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro")) {
			System.out.println("contains");
		}else {
			System.out.println("does NOT contain");
		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(2000);
		Set <String> allWindows2=driver.getWindowHandles();
		it = allWindows2.iterator();
		parent=it.next();
		String child2=it.next();
		driver.switchTo().window(child2);
		child2=driver.getTitle();
		System.out.println(child2);
		String childId2=driver.getWindowHandle();
		if(child2.equals("New Window")) {
			System.out.println("contains");
		}else {
			System.out.println("does NOT contain");
		}
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("The Internet")) {
			System.out.println("contains");
		}else {
			System.out.println("does NOT contain");
		}
		driver.quit();
		
		
		
		
		
		
		
	}

}
