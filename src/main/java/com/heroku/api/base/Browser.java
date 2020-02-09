package com.heroku.api.base;

import java.net.MalformedURLException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public interface Browser {
   	
		public void startApp(String browser, String url);
		/**
		 * This method will locate the element using any given locator
		 * @param locatorType  - The locator by which the element to be found
		 * @param locValue - The locator value by which the element to be found
		 * @author Sarath - TestLeaf
		 * @throws NoSuchElementException
		 * @return The first matching element on the current context.
		 */
		public WebElement locateElement(String locatorType, String value);	
		
		/**
		 * This method will locate the element using id
		 * @param locValue - The locator value by which the element to be found
		 * @author Sarath - TestLeaf
		 * @throws NoSuchElementException
		 * @return The first matching element on the current context.
		 */
        public void close();
}