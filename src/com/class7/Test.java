package com.class7;

import utils.CommonMethods;

public class Test extends CommonMethods {

	public static void main(String[] args) {
		
		setUpDriver("firefoxeee", "http://www.google.com");
		driver.close();
	}

}
