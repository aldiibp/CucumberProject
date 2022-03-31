package com.juaracoding.cucumber4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber4.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name = "email")
	WebElement inputEmail;
	
	@FindBy(name = "password")
	WebElement inputPassword;
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	WebElement btnLogin;
	
	@FindBy(className = "author__meta")
	WebElement txtWelcome;
	
	
	public void submitLogin(String email, String password) {
		inputEmail.sendKeys(email);
		inputPassword.sendKeys(password);
		btnLogin.click();
	}

	public String getTxtWelcome() {
		return txtWelcome.getText();
	}
	
}
