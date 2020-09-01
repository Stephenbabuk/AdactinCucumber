package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	public static WebDriver driver;

	public SelectHotel(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;

	@FindBy(id = "continue")
	private WebElement continuebtn;
	
	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}


	public WebElement getContinuebtn() {
		return continuebtn;
	}

}
