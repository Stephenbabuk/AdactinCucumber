package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.ProjectObjectManager;
import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookedItinerary;
import com.adactin.pom.BookingConfirmation;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	ProjectObjectManager pom = new ProjectObjectManager(driver);

	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
		// driver = getBrowser("chrome");
		// getUrl("http://adactinhotelapp.com/");
		String url = FileReaderManager.getInstance().getCrInstanace().getUrl();
		getUrl(url);

	}
	
	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
	    System.out.println("         launch the adactin application");
	}

	@When("^user login to the application$")
	public void user_login_to_the_application() throws Throwable {
	   System.out.println("           login to the application");
	}

	/*
	 * @When("^User enter the valid username in User field$") public void
	 * user_enter_the_valid_username_in_User_field() throws Throwable { //HomePage
	 * hp = new HomePage(driver); inputValuesToElements(pom.getHp().getUsername(),
	 * "Stefanbabu"); }
	 * 
	 * @When("^User enters the valid password in password field$") public void
	 * user_enters_the_valid_password_in_password_field() throws Throwable {
	 * //HomePage hp = new HomePage(driver);
	 * inputValuesToElements(pom.getHp().getPassword(), "stefan@143");
	 * 
	 * }
	 */

	@When("^User enter the valid \"([^\"]*)\" in User field$")
	public void user_enter_the_valid_in_User_field(String username) throws Throwable {
		inputValuesToElements(pom.getHp().getUsername(), username);

	}

	@When("^User enters the valid \"([^\"]*)\" in password field$")
	public void user_enters_the_valid_in_password_field(String password) throws Throwable {
		inputValuesToElements(pom.getHp().getPassword(), password);

	}

	@When("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {
		// HomePage hp = new HomePage(driver);
		clickonElement(pom.getHp().getLogin());

	}

	@Then("^User verify the home page and navigate to next page$")
	public void user_verify_the_home_page_and_navigate_to_next_page() throws Throwable {
		
	}

	/*
	 * @When("^User selecting the location of the hotel$") public void
	 * user_selecting_the_location_of_the_hotel() throws Throwable { SearchHotel sh
	 * = new SearchHotel(driver); selectDropDown(pom.getSh().getSearchlocation(),
	 * "Brisbane", "value");
	 * 
	 * }
	 * 
	 * @When("^User select the hotel$") public void user_select_the_hotel() throws
	 * Throwable { SearchHotel sh = new SearchHotel(driver);
	 * selectDropDown(pom.getSh().getSearchHotels(), "Hotel Sunshine", "value");
	 * 
	 * }
	 * 
	 * @When("^User selecting the room type$") public void
	 * user_selecting_the_room_type() throws Throwable { // SearchHotel sh = new
	 * SearchHotel(driver); selectDropDown(pom.getSh().getSelectRoom_type(),
	 * "Double", "value");
	 * 
	 * }
	 * 
	 * @When("^User selecting number of rooms$") public void
	 * user_selecting_number_of_rooms() throws Throwable { // SearchHotel sh = new
	 * SearchHotel(driver); selectDropDown(pom.getSh().getSelectRoom_nos(), "2",
	 * "value");
	 * 
	 * }
	 * 
	 * @When("^User selecting checkin date$") public void
	 * user_selecting_checkin_date() throws Throwable { // SearchHotel sh = new
	 * SearchHotel(driver);
	 * inputValuesToElements(pom.getSh().getSelectDatepick_in(), "17/08/2020");
	 * 
	 * }
	 * 
	 * @When("^User selecting checkout date$") public void
	 * user_selecting_checkout_date() throws Throwable { // SearchHotel sh = new
	 * SearchHotel(driver);
	 * inputValuesToElements(pom.getSh().getSelectDatepick_out(), "18/08/2020");
	 * 
	 * }
	 * 
	 * @When("^User selecting how many Adult per Room$") public void
	 * user_selecting_how_many_Adult_per_Room() throws Throwable { // SearchHotel sh
	 * = new SearchHotel(driver); selectDropDown(pom.getSh().getSelectAdult_room(),
	 * "2", "value");
	 * 
	 * }
	 * 
	 * @When("^user selecting how many childrens per Room$") public void
	 * user_selecting_how_many_childrens_per_Room() throws Throwable { //
	 * SearchHotel sh = new SearchHotel(driver);
	 * selectDropDown(pom.getSh().getSelectChild_room(), "1", "value");
	 * 
	 * }
	 */
	@When("^user Click the Search button$")
	public void user_Click_the_Search_button() throws Throwable {
		// SearchHotel sh = new SearchHotel(driver);
		clickonElement(pom.getSh().getSelectSubmit());

	}

	@When("^User selecting the location \"([^\"]*)\" as \"([^\"]*)\" of the hotel$")
	public void user_selecting_the_location_as_of_the_hotel(String location, String option) throws Throwable {
		selectDropDown(pom.getSh().getSearchlocation(), location, option);

	}

	@When("^User select the hotel \"([^\"]*)\"as \"([^\"]*)\"$")
	public void user_select_the_hotel_as(String hotel, String option) throws Throwable {
		selectDropDown(pom.getSh().getSearchHotels(), hotel, option);
	}

	@When("^User selecting the room type \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selecting_the_room_type_as(String roomtype, String option) throws Throwable {
		selectDropDown(pom.getSh().getSelectRoom_type(), roomtype, option);


	}

	@When("^User selecting number of rooms \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selecting_number_of_rooms_as(String numofroom, String option) throws Throwable {
		selectDropDown(pom.getSh().getSelectRoom_nos(), numofroom, option);


	}

	@When("^User selecting checkin date \"([^\"]*)\"$")
	public void user_selecting_checkin_date(String checkin) throws Throwable {
		inputValuesToElements(pom.getSh().getSelectDatepick_in(), checkin);


	}

	@When("^User selecting checkout date \"([^\"]*)\"$")
	public void user_selecting_checkout_date(String checkout) throws Throwable {
		inputValuesToElements(pom.getSh().getSelectDatepick_out(), checkout);


	}

	@When("^User selecting how many Adult per Room \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selecting_how_many_Adult_per_Room_as(String adultperroom, String option) throws Throwable {
		selectDropDown(pom.getSh().getSelectAdult_room(), adultperroom, option);


	}

	@When("^user selecting how many childrens per Room \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_selecting_how_many_childrens_per_Room_as(String childperroom, String option) throws Throwable {
		selectDropDown(pom.getSh().getSelectChild_room(), childperroom, option);

	}

	@Then("^User verify the search hotel page and navigate to next page$")
	public void user_verify_the_search_hotel_page_and_navigate_to_next_page() throws Throwable {

	}

	@When("^User select the Radio Button$")
	public void user_select_the_Radio_Button() throws Throwable {
		// SelectHotel sl = new SelectHotel(driver);
		clickonElement(pom.getSl().getRadiobutton_0());

	}

	@When("^User click the submit Button$")
	public void user_click_the_submit_Button() throws Throwable {
		// SelectHotel sl = new SelectHotel(driver);
		clickonElement(pom.getSl().getContinuebtn());

	}

	@Then("^User navigate to next page$")
	public void user_navigate_to_next_page() throws Throwable {

	}

	@When("^User enters the first name$")
	public void user_enters_the_first_name() throws Throwable {
		// BookAHotel bh = new BookAHotel(driver);
		inputValuesToElements(pom.getBh().getFirst_name(), "Stefan");
	}

	@When("^User enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
		// BookAHotel bh = new BookAHotel(driver);
		inputValuesToElements(pom.getBh().getLast_name(), "k");

	}

	@When("^User enter the billing Address$")
	public void user_enter_the_billing_Address() throws Throwable {
		// BookAHotel bh = new BookAHotel(driver);
		inputValuesToElements(pom.getBh().getAddress(), "12, Vivekandar st");

	}

	@When("^User enter the credit card number$")
	public void user_enter_the_credit_card_number() throws Throwable {
		// BookAHotel bh = new BookAHotel(driver);
		inputValuesToElements(pom.getBh().getCc_num(), "1234569870012367");

	}

	@When("^User selecting credit card type$")
	public void user_selecting_credit_card_type() throws Throwable {
		// BookAHotel bh = new BookAHotel(driver);
		selectDropDown(pom.getBh().getCc_type(), "VISA", "value");

	}

	@When("^User selecting expiry date$")
	public void user_selecting_expiry_date() throws Throwable {
		// BookAHotel bh = new BookAHotel(driver);
		selectDropDown(pom.getBh().getCc_exp_month(), "May", "visibleText");
		selectDropDown(pom.getBh().getCc_exp_year(), "2021", "value");

	}

	@When("^User enter CVV number$")
	public void user_enter_CVV_number() throws Throwable {
		// BookAHotel bh = new BookAHotel(driver);
		inputValuesToElements(pom.getBh().getCc_cvv(), "1234");

	}

	@When("^User Click the Book now button$")
	public void user_Click_the_Book_now_button() throws Throwable {
		// BookAHotel bh = new BookAHotel(driver);
		clickonElement(pom.getBh().getBookNow());

	}

	@Then("^User navigate to the Booking configuration page$")
	public void user_navigate_to_the_Booking_configuration_page() throws Throwable {

	}

	@When("^User click the My Itineary Button$")
	public void user_click_the_My_Itineary_Button() throws Throwable {
		BookingConfirmation bc = new BookingConfirmation(driver);
		clickonElement(bc.getMy_itinerary());

	}

	@When("^User checking Booked Itineary page and click the logout button$")
	public void user_checking_Booked_Itineary_page_and_click_the_logout_button() throws Throwable {
		BookedItinerary bi = new BookedItinerary(driver);
		clickonElement(bi.getLogout());

	}

	@Then("^User navigated to the logged out page\\.$")
	public void user_navigated_to_the_logged_out_page() throws Throwable {

	}

}
