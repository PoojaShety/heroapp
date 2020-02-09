package com.heroku.pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.heroku.project.api.base.ProjectSpecificScript;

public class EntryAdPagehome extends ProjectSpecificScript {
	
	public EntryAdPagehome clickrestartAd() throws InterruptedException
	{
		click(locateElement("link","click here"));
		wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(ele));)
		System.out.println("Restarting Ad");
		return this;
	}

	


}
