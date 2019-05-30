package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:cnn.com");
		//driver.close();
		driver.quit();
	}

}
