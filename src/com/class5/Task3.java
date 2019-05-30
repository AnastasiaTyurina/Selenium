package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(1000);
		
		 List<WebElement>exp=driver.findElements(By.name("exp"));
	        for(WebElement check:exp) {
	            Thread.sleep(1000);
	        
	            if(check.isEnabled()) {
	                check.click();
	            }
	        }
	        
	     List<WebElement>all=driver.findElements(By.cssSelector("input[name='tool']"));
	        for(WebElement check:all) {
	            Thread.sleep(1000);
	            if(check.isEnabled()) {
	                check.click();
	            }
	        }	
	    driver.findElement(By.cssSelector("input[id='tool-0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='tool-1']")).click();
		Thread.sleep(1000);
		
		
		driver.quit();
	}

}
