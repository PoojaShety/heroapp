package com.heroku.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.heroku.project.api.base.ProjectSpecificScript;

public class FileUploadPage extends ProjectSpecificScript{
	
	public void clickChooseFile() throws InterruptedException
	{
		//click(locateElement("id","file-upload"));
		WebElement uploadElement = locateElement("id","file-upload");;

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("C:\\Users\\Dell\\Desktop\\Sample.png");

	        

	        // click the "UploadFile" button
	        click(locateElement("id","file-submit"));
	        Thread.sleep(2000);
	        WebElement successmsg = locateElement("xpath","//h3[text()='File Uploaded!']");
	        String msg = successmsg.getText();
	        if(msg.equals("File Uploaded!"))
	        {
	        	System.out.println("File Uploaded Successfully");
	        }
	        else
	        {
	        	System.out.println("File is not uploaded!");
	        }
	        
	      
	        }
		
	}
	


