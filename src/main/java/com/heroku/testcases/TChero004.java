package com.heroku.testcases;

import org.testng.annotations.Test;

import com.heroku.pages.HomePage;
import com.heroku.project.api.base.ProjectSpecificScript;

public class TChero004 extends ProjectSpecificScript{
	@Test
	public void runTChero004() throws InterruptedException
	{
	new HomePage()
	.clickEntryAd()
	.clickclose()
	.clickrestartAd();
	
	}
	
}
