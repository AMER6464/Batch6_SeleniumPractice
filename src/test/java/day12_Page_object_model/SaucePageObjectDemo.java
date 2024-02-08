

package day12_Page_object_model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utils.BrowserUtils;
import Utils.DataReader;
import Utils.Driver;
import pages.SauceDemoLoginPage;

public class SaucePageObjectDemo {

public static void main(String[] args)  throws InterruptedException{
	sauceLoginDemo();
	
	}


public static void sauceLoginDemo() throws InterruptedException {
	
	SauceDemoLoginPage loginPage = new SauceDemoLoginPage();
	
	BrowserUtils utils = new BrowserUtils();
	
	// go to website 
	Driver.getDriver().get(DataReader.getProperty("sauce_url"));
	
	// wait for the username field
	utils.waitForElementToBeVisible(loginPage.loginUsername);
	
	
	// type username    // Driver.getDriver().findElement(By.id("user-name")).sendKeys(DataReader.getProperty("sauce_username"));
	
	utils.highlightElement(loginPage.loginUsername);
	loginPage.loginUsername.sendKeys(DataReader.getProperty("sauce_username"));
	
	// type password
	loginPage.loginPassword.sendKeys(DataReader.getProperty("sauce_password"));
	
	// click signin
	loginPage.loginBtn.click();
	
	Driver.quitDriver();
}

 
  }


