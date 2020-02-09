package com.heroku.pages;

import com.heroku.project.api.base.ProjectSpecificScript;

public class DropdownPage extends ProjectSpecificScript {

	public void clickOption() {
		selectDropDownUsingValue(locateElement("id","dropdown"),"2");
	}
	
}
