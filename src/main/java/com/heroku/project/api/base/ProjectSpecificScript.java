package com.heroku.project.api.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.heroku.sel.api.base.SeleniumBaseScripts;

public class ProjectSpecificScript extends SeleniumBaseScripts {
	@BeforeMethod
	  public void beforeMethod() {
		startApp("chrome", "http://the-internet.herokuapp.com/");
		//node = test.createNode(testcaseName);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }


}
