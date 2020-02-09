package com.heroku.pages;

import com.heroku.sel.api.base.SeleniumBaseScripts;

//import herokuapp.pages.HomePage;

public class DynamicLoadPage extends SeleniumBaseScripts {

	public DynamicLoadPage1 clickOnExample() {
		click(locateElement("link","Example 1: Element on page that is hidden"));
		return new DynamicLoadPage1();	
	}
	
	
	}
