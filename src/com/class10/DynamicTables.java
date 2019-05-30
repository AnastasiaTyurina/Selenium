package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class DynamicTables extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);
		
		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")), "Tester");
		sendText(driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")), "test");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
		
		for(WebElement el:rows) {
			System.out.println(el.getText());
		}
		
		String expectedValue="Canada";
		
		for (int i=1; i<=rows.size(); i++) {
			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]")).getText();
		
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr["+i+"]/td[1]")).click();
			}
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
