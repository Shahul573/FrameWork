package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	WebDriver driver;

	public void browserLaunch() {
		driver = new ChromeDriver();
	}

	public void enterApplUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void elementSendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void elementClick(WebElement element) {
		element.click();
	}

	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String getApplnUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public WebElement findLocatorById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public void fireFoxBrowserLaunch() {
		driver = new FirefoxDriver();

	}

	public void iEBrowserLaunch() {
		driver = new InternetExplorerDriver();

	}

	public void edgeBrowserLaunch() {
		driver = new EdgeDriver();

	}

	public String getTex(WebElement element) {
		String text = element.getText();
		return text;

	}

	public String getAttribute(WebElement element) {
		String value = element.getAttribute("value");
		return value;

	}

	public void closeWindow() {
		driver.quit();

	}

	public WebElement findLocatorByClass(String attributevalue) {
		WebElement element = driver.findElement(By.className(attributevalue));
		return element;

	}

	public WebElement findLocatorByXpath(String value) {
		WebElement element = driver.findElement(By.xpath(value));
		return element;

	}

	public boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public boolean elementIsEnabled(WebElement element) {

		boolean enabled = element.isEnabled();
		return enabled;
	}

	public boolean elementIsSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;

	}

	public void implicitWait(int seconds) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

}
