package com.heroku.testcases;

import org.testng.annotations.Test;

import com.heroku.pages.HomePage;
import com.heroku.project.api.base.ProjectSpecificScript;

public class TChero007 extends ProjectSpecificScript {
	@Test
	public void runTChero007() throws InterruptedException
	{
		new HomePage()
		.clickLoginPage()
		.enterCredentials();
	}



}
