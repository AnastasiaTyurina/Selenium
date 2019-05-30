package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Homework3 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/**
		 *  Table headers and rows verification
		 *  1.Open chrome browser
		 *  2.Go to “https://jqueryui.com/”
		 *  3.Click on “Datepicker”
		 *  4.Select August 10 of 2019
		 *  5.Verify date “08/10/2019” has been entered succesfully
		 *  6.Close browser
		 */
		String url="https://jqueryui.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[6]/a")).click();
		
		WebElement frame=driver.findElement(By.cssSelector("iframe.demo-frame"));
		switchToFrame(frame);
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		WebElement element=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div"));
		String text=element.getText();
		while(!text.contains("August 2019")) {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			element=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div"));
			text=element.getText();
			}

		String expectedDate="10";
		List<WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement cell:cells) {
			String cellText=cell.getText();
			if(cellText.equals(expectedDate)) {
				cell.click();
			}
		}
		element=driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		String expectedText=element.getAttribute("value");
		if(expectedText.equals("08/10/2019")) {
			System.out.println("Entry was successful");
		}else {
			System.out.println("Entry was unsuccessful");
		}
		Thread.sleep(2000);
		//driver.quit();
	}

}
