package com.heroku.testcases;

import org.testng.annotations.Test;

import com.heroku.pages.HomePage;
import com.heroku.project.api.base.ProjectSpecificScript;

public class TChero003 extends ProjectSpecificScript {
    @Test
	public void runTChero003() {
		new HomePage()
		.clickBrokenImage()
		.assertBrokenImages();
	}
	
}
