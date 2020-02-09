package com.heroku.pages;

import com.heroku.project.api.base.ProjectSpecificScript;


//import herokuapp.pages.Dropdownpage;
//import herokuapp.pages.DynamicLoadingPage;
//import herokuapp.pages.EntryAdPage;

public class HomePage extends ProjectSpecificScript{
	
		
		public DynamicLoadPage clickDynamic()
		{
			click(locateElement("link","Dynamic Loading"));
			return new DynamicLoadPage();
		}
		
		public DropdownPage clickDropdown() {
			click(locateElement("link","Dropdown"));
			return new DropdownPage();
		}
		
		public BrokenImagePage clickBrokenImage() {
			click(locateElement("link", "Broken Images"));
			return new BrokenImagePage();
		}
		
		public EntryAdpage clickEntryAd()
		{
		click(locateElement("link","Entry Ad"));
		return new EntryAdpage();
	    }
		public FileUploadPage clickFileUpload()
		{
			click(locateElement("link","File Upload"));
			return new FileUploadPage();
		}

		public ForgotPasswordPage clickForgotPassword()
		{
			click(locateElement("link","Forgot Password"));
			return new ForgotPasswordPage();
			
		}
		public LoginPage clickLoginPage()
		{
			click(locateElement("link","Form Authentication"));
			return new LoginPage();
			
		}
		public InputsPage clickInputs()
		{
			click(locateElement("link","Inputs"));
			return new InputsPage();
		}
}