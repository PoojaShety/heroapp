package com.heroku.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.heroku.project.api.base.ProjectSpecificScript;

public class InputsPage extends ProjectSpecificScript {
	
	public InputsPage enterAlphabet() throws InterruptedException
	{
		
		click(locateElement("xpath","//input[@type='number']"));
        Assert.assertEquals("al", 6, "Please enter number");
        
        Thread.sleep(2000);
        return this;
        
       
	}

	
}
