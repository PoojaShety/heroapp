package com.heroku.testcases;

import org.testng.annotations.Test;

import com.heroku.pages.HomePage;
import com.heroku.project.api.base.ProjectSpecificScript;

public class TChero002 extends ProjectSpecificScript {
    @Test
	public void runTChero002() {
		new HomePage()
		.clickDropdown()
		.clickOption();
	}
}
