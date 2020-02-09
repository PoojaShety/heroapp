package com.heroku.pages;

import com.heroku.project.api.base.ProjectSpecificScript;

public class EntryAdpage extends ProjectSpecificScript {
	
	public EntryAdPagehome clickclose()
	{
		click(locateElement("xpath","//p[text()='Close']"));
		System.out.println("Clicked on EntryAd Close");
		return new EntryAdPagehome();
	}
	

}
