package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement department=driver.findElement(By.cssSelector("#searchDropdownBox"));
		Thread.sleep(2000);
		Select select=new Select(department);
		List<WebElement> list=select.getOptions();
		System.out.println(list.size());
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		select.selectByVisibleText("Computers");
		Thread.sleep(2000);
		driver.quit();
	
		
	}

}
