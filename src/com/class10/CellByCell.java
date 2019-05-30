package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class CellByCell extends CommonMethods {

	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();
		List <WebElement> rows=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		List <WebElement> cols=driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
		
		for(int i=1; i<=rows.size(); i++) {
			for(int j=1; j<=cols.size(); j++) {
				String cell=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(cell);
			}
		}
		
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		
		for(WebElement cel:cells) {
			String text=cel.getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
