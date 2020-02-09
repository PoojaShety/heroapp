package com.heroku.testcases;

import org.testng.annotations.Test;

import com.heroku.pages.HomePage;
import com.heroku.project.api.base.ProjectSpecificScript;

public class TChero008 extends ProjectSpecificScript{
	@Test
	public void runTChero008() throws InterruptedException
	{
		new HomePage()
		.clickInputs()
		.enterAlphabet();
	}


}
