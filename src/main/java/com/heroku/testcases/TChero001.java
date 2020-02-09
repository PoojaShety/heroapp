package com.heroku.testcases;

import org.testng.annotations.Test;

import com.heroku.pages.HomePage;
import com.heroku.project.api.base.ProjectSpecificScript;

public class TChero001 extends ProjectSpecificScript{
 
	@Test
    public void runTChero001(){
    	new HomePage()
    	.clickDynamic()
    	.clickOnExample()
    	.clickStartButton()
    	.assertText();
    }	
}
