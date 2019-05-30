package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href*='Select']")).click();
		WebElement country=driver.findElement(By.cssSelector("select[id='countriesSingle']"));
		Select select=new Select(country);
		List<WebElement> list=select.getOptions();
		System.out.println(list.size());
		select.selectByVisibleText("United states of America");
		Thread.sleep(2000);
		
		WebElement country2=driver.findElement(By.cssSelector("select[id='countriesMultiple']"));
		Select select2=new Select(country2);
		List<WebElement> list2=select2.getOptions();
		System.out.println(list2.size());
		if (select2.isMultiple()) {
			for(int i=0; i<list2.size(); i++) {
			select2.selectByIndex(i);
			}
		}
		Thread.sleep(2000);
		select2.deselectByVisibleText("China");
		Thread.sleep(2000);
		driver.quit();
		

	}

}
