package com.class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"start\"]/button")).click();
		WebDriverWait wait=new WebDriverWait(driver,  30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4")));
		WebElement el=driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));
		if(el.isDisplayed()) {
			String text=el.getText();
			System.out.println("The element "+text+ " is displayed");
		}else {
			System.out.println("The element is NOT displayed");
		}
		
		driver.quit();
		
	}

}
