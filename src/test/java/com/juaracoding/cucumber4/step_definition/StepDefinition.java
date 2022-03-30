package com.juaracoding.cucumber4.step_definition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.cucumber.config.AutomationFrameworkConfig;
import com.juaracoding.cucumber4.driver.DriverSingleton;
//import com.juaracoding.cucumber4.pages.BookingPage;
//import com.juaracoding.cucumber4.pages.LoginPage;
import com.juaracoding.cucumber4.utils.ConfigurationProperties;
import com.juaracoding.cucumber4.utils.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import io.cucumber.java.en.Then;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private WebDriver driver;
//	private LoginPage loginPage;
//	private BookingPage bookingPage;

	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects(){
		DriverSingleton.getInstance(configurationProperties.getBrowser());
//		loginPage = new LoginPage();
//		bookingPage = new BookingPage();
	}
	
	
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
//	@When("Customer klik login button")
//	public void customer_klik_login_button() {
//		loginPage.submitLogin(configurationProperties.getEmail(), configurationProperties.getPassword());
//	}
//		
//	@Then("Customer berhasil login")
//	public void customer_berhasil_login() {
//		driver.navigate().refresh();
//		tunggu();
//		assertEquals(configurationProperties.getTxtWelcome(), loginPage.getTxtWelcome());
//	}
	
//	@When("Customer klik menu My Booking")
//	public void customer_klik_menu_my_booking() {
//		tunggu();
//		bookingPage.goToMenuMyBooking();
//	}
//	
//	@Then("Customer melihat page MyBooking")
//	public void customer_melihat_page_title() {
//		assertEquals(configurationProperties.getTxtTitleMyBookingPage(), bookingPage.getTxtTitleMyBookingPage());
//	}
	
	public void tunggu() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
