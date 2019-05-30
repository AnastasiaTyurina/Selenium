package com.class5;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Iterator<WebElement> it=links.iterator();
		int count=0;
		while(it.hasNext()) {
			WebElement link= it.next();
			if(!link.getText().isEmpty()){
				System.out.println(link.getText());
				count++;
			}	
		}
		System.out.println(count);
		driver.quit();
	}

}
