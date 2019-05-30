package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Homework2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * TC 1: Table headers and rows verification1.Open browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
		 * 2.Login to the application
		 * 3.Create an Order
		 * 4.Verify order of that person is displayed in the table “List of All Orders”
		 * 5.Click on edit of that specific order
		 * 6.Verify each order details
		 * 7.Update street address
		 * 8.Verify in the table that street has been updated
		 * 9.Close browser
		 */
		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);
		WebElement element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
		sendText(element, "Tester");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
		sendText(element, "test");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a")).click();
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]"));
		selectValueFromDD(element, "FamilyAlbum");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"));
		sendText(element, "3");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]"));
		sendText(element, "Anastasia Tyurina");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]"));
		sendText(element, "2511 20th Rd N");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]"));
		sendText(element, "Arlington");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox4\"]"));
		sendText(element, "Virginia");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]"));
		sendText(element, "22201");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList_2\"]"));
		selectRadioButtonOrCheckBox(element);
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]"));
		sendText(element, "454678000134");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]"));
		sendText(element, "10/20");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_InsertButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[1]/a")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id, 'ctl00_MainContent_orderGrid')]/tbody/tr"));
		String expectedValue="Anastasia Tyurina";
		for (int i=1; i<=rows.size(); i++) {
			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'ctl00_MainContent_orderGrid')]/tbody/tr["+i+"]")).getText();
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[contains(@id, 'ctl00_MainContent_orderGrid')]/tbody/tr["+i+"]/td[13]/input")).click();
				break;
			}
		}
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_ddlProduct\"]"));
		verifyEntry(element, "FamilyAlbum");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtQuantity\"]"));
		verifyEntry(element, "3");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_txtName\"]"));
		verifyEntry(element, "Anastasia Tyurina");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]"));
		verifyEntry(element, "2511 20th Rd N");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox3\"]"));
		verifyEntry(element, "Arlington");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox4\"]"));
		verifyEntry(element, "Virginia");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox5\"]"));
		verifyEntry(element, "22201");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_cardList_2\"]"));
		System.out.println(element.isSelected());
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox6\"]"));
		verifyEntry(element, "454678000134");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox1\"]"));
		verifyEntry(element, "10/20");
		element=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_TextBox2\"]"));
		sendText(element, "1654 East 19th st");
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder_UpdateButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[1]/a")).click();
		String expectedValue2="1654 East 19th st";
		for (int i=1; i<=rows.size(); i++) {
			String rowText=driver.findElement(By.xpath("//table[contains(@id, 'ctl00_MainContent_orderGrid')]/tbody/tr["+i+"]")).getText();
			if(rowText.contains(expectedValue2) && rowText.contains(expectedValue)) {
				Thread.sleep(2000);
				driver.quit();
				break;
			}
		}
		
	}

}
