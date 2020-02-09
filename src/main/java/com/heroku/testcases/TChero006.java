package com.heroku.testcases;

import org.testng.annotations.Test;

import com.heroku.pages.HomePage;
import com.heroku.project.api.base.ProjectSpecificScript;

public class TChero006 extends ProjectSpecificScript{
	@Test
	public void runTChero006() throws InterruptedException
	{
		new HomePage()
		.clickForgotPassword()
		.EnterEmail();
	}

}