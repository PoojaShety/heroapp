package com.heroku.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.heroku.project.api.base.ProjectSpecificScript;

public class BrokenImagePage extends ProjectSpecificScript{
  
	public void assertBrokenImages() {
		int invalidImageCount = 0;
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("Total no. of images are " + imagesList.size());
		for (WebElement imgElement : imagesList) {
			if (imgElement != null) {
				assertBrokenImages(imgElement);
			}
		}
	}
}
