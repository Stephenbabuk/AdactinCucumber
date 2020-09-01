package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookedItinerary;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class ProjectObjectManager {

	public static WebDriver driver;

	private HomePage hp;
	private SearchHotel sh;
	private SelectHotel sl;
	private BookAHotel bh;
	private BookingConfirmation bc;
	public BookingConfirmation getBc() {
		return bc;
	}

	public void setBc(BookingConfirmation bc) {
		this.bc = bc;
	}

	private BookedItinerary bi;
	
	public ProjectObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
	}

	public HomePage getHp() {
		hp = new HomePage(driver);

		return hp;
	}

	public SearchHotel getSh() {
		sh = new SearchHotel(driver);
		return sh;
	}

	public SelectHotel getSl() {
		sl = new SelectHotel(driver);
		return sl;
	}

	public BookAHotel getBh() {
		bh = new BookAHotel(driver);
		return bh;
	}

	public BookedItinerary getBi() {
		bi = new BookedItinerary(driver);
		return bi;
	}

}
