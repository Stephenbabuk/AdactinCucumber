package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	
	  public WebDriver driver;
	  
	  public SearchHotel(WebDriver ldriver) { this.driver = ldriver;
	  PageFactory.initElements(driver, this);
	  
	  }
	 

	@FindBy(id = "location")
	private WebElement Searchlocation;

	@FindBy(id = "hotels")
	private WebElement SearchHotels;

	@FindBy(id = "room_type")
	private WebElement SelectRoom_type;

	@FindBy(id = "room_nos")
	private WebElement SelectRoom_nos;

	@FindBy(id = "datepick_in")
	private WebElement SelectDatepick_in;

	@FindBy(id = "datepick_out")
	private WebElement SelectDatepick_out;

	@FindBy(id = "adult_room")
	private WebElement SelectAdult_room;

	@FindBy(id = "child_room")
	private WebElement SelectChild_room;

	@FindBy(id = "Submit")
	private WebElement SelectSubmit;
	
	public WebElement getSearchlocation() {
		return Searchlocation;
	}

	public WebElement getSearchHotels() {
		return SearchHotels;
	}

	public WebElement getSelectRoom_type() {
		return SelectRoom_type;
	}

	public WebElement getSelectRoom_nos() {
		return SelectRoom_nos;
	}

	public WebElement getSelectDatepick_in() {
		return SelectDatepick_in;
	}

	public WebElement getSelectDatepick_out() {
		return SelectDatepick_out;
	}

	public WebElement getSelectAdult_room() {
		return SelectAdult_room;
	}

	public WebElement getSelectChild_room() {
		return SelectChild_room;
	}

	public WebElement getSelectSubmit() {
		return SelectSubmit;
	}

}
