package com.heroku.testcases;

import org.testng.annotations.Test;

import com.heroku.pages.HomePage;
import com.heroku.project.api.base.ProjectSpecificScript;

public class TChero005 extends ProjectSpecificScript{
	@Test
	public void runTChero005() throws InterruptedException
	{
		new HomePage()
		.clickFileUpload()
		.clickChooseFile();
	}

}
