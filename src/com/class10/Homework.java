package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Homework extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/**
		 TC 1: Users Application Form Fill1.Open chrome browser
		 2.Go to “http://uitestpractice.com/”
		 3.Click on “Forms” link
		 4.Fill out the entire form5.Close the browser
		 */
		
		String url="http://uitestpractice.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a")).click();
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		sendText(element, "Anastasia");
		element=driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		sendText(element, "Tyurina");
		element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[4]/input"));		
		selectRadioButtonOrCheckBox(element);
		element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[3]/input"));		
		selectRadioButtonOrCheckBox(element);
		element=driver.findElement(By.xpath("//*[@id=\"sel1\"]"));
		selectValueFromDD(element, "Belarus");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		element=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		selectValueFromDD(element, "Oct");
		element=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		selectValueFromDD(element, "1988");
		String expectedDate="29";
		List<WebElement> cells=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td"));
		for(WebElement cell:cells) {
			String cellText=cell.getText();
			if(cellText.equals(expectedDate)) {
				cell.click();
			}
		}
		element=driver.findElement(By.xpath("//*[@id=\"phonenumber\"]"));
		sendText(element, "3478471052");
		element=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		sendText(element, "anastasia789");
		element=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		sendText(element, "anastasia.tyurina@yahoo.com");
		element=driver.findElement(By.xpath("//*[@id=\"comment\"]"));
		sendText(element, "Cup of Java from Syntax");
		element=driver.findElement(By.xpath("//*[@id=\"pwd\"]"));
		sendText(element, "syntax675");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[12]/div/button")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		

	}

}
