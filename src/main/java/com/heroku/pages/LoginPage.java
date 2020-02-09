package com.heroku.pages;

import org.openqa.selenium.WebElement;

import com.heroku.project.api.base.ProjectSpecificScript;

public class LoginPage extends ProjectSpecificScript{
	public LoginPage enterCredentials()
	{
		WebElement username = locateElement("id","username");
        username.sendKeys("toms");
        WebElement password = locateElement("id","password");
        password.sendKeys("SuperSecretPass");
        
        click(locateElement("xpath","//i[contains(@class,'fa fa-2x')]"));
        
        WebElement errormessage = locateElement("id","flash");
        String errmsg = errormessage.getText();
        System.out.println("Errormessage is"+errmsg);
        return this;  
	}

}
