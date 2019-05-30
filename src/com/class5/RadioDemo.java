package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anast/OneDrive/Documents/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement maleRadio=driver.findElement(By.id("sex-0"));
		System.out.println(maleRadio.isDisplayed());
		System.out.println(maleRadio.isEnabled());
		System.out.println(maleRadio.isSelected());
		Thread.sleep(2000);
		// 1 way of clicking on the element
		maleRadio.click();
		System.out.println(maleRadio.isSelected());
		Thread.sleep(2000);
		// 2 way of clicking on the element (preferred)
		List<WebElement> professionList=driver.findElements(By.name("profession"));
		System.out.println(professionList.size());
		for(WebElement profession:professionList) {
			String value=profession.getAttribute("value");
			if(value.equals("Automation Tester")) {
				profession.click();
				// if(profession.isEnabled()){
				//      profession.click();
				// }
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
