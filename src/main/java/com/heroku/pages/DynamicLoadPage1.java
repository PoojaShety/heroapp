package com.heroku.pages;

import org.openqa.selenium.WebElement;

import com.heroku.sel.api.base.SeleniumBaseScripts;

public class DynamicLoadPage1 extends SeleniumBaseScripts {

	public DynamicLoadPage1 clickStartButton() {
			click(locateElement("xpath","//button[text()='Start']"));
			return new DynamicLoadPage1();
		}
	
	public DynamicLoadPage1 assertText() {
		assertTextcheck(locateElement("xpath","//div[@id='finish']//h4[1]"), "Hello World!");
		return this;
	}
	}

