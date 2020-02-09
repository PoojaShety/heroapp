package com.heroku.pages;

import org.openqa.selenium.WebElement;

import com.heroku.project.api.base.ProjectSpecificScript;

public class ForgotPasswordPage extends ProjectSpecificScript{
	public void EnterEmail() throws InterruptedException
	{
		WebElement email = locateElement("id","email");

        // enter the file path onto the file-selection input field
        email.sendKeys("poojashetty00029@gmail.com");
        
        click(locateElement("id","form_submit"));
        //Thread.sleep(2000);
        
        WebElement emailsent = locateElement("id","content");
        String confirmation = emailsent.getText();
        
        if(confirmation.contains("sent!"))
        {
        	System.out.println("Retrieve password..Email has been sent!");
        }

        

	}

}
