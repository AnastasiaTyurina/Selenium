package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.syntaxtechs.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("syntax")) {
			System.out.println("URL contains Syntax");
		}else {
			System.out.println("URL doesn't contain Syntax");
		}
		driver.close();
	}

}
