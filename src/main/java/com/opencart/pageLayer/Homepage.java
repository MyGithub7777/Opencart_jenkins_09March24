package com.opencart.pageLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	private WebDriver driver;
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//--------------Obj repo ---------------------
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myaccount_link;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login_link;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register_link;
	
	
	//------------ Action methods ----------------
	public void clickOnMyAccountLink()
	{
		waitForElementToClick(myaccount_link).click();
//		myaccount_link.click();
	}
	
	public void clickOnLoginLink()
	{
		waitForElementToClick(login_link).click();
		
//		login_link.click();
	}
	
	public void clickOnRegisterLink()
	{
		waitForElementToClick(register_link).click();
//		register_link.click();
	}
	
	private WebElement waitForElementToClick(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element));
		return ele;
	}
}
