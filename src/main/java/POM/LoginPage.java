package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		@FindBy (xpath="//input[@class=\"email-input\"]")private WebElement userName;
		@FindBy (xpath="//input[@type=\"password\"]")private WebElement password;
		@FindBy (xpath="//button[@class=\"custom-button \"]")private WebElement login;
		@FindBy (xpath="//div[@class=\"user-info\"]")private WebElement profile;
		@FindBy (xpath="//a[@class=\"popup-content\"]")private WebElement viewprofile;
		@FindBy (xpath="(//button[@class=\"custom-button unVerified\"])[2]")private WebElement UploadDoc;

		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void enterUserName(String user) {
			userName.sendKeys(user);
		}
		
		public void enterPassWord(String pass) {
			password.sendKeys(pass);
		}
		
		public void clickOnlogin() {
			login.click();
			}
		public void clickOnprofile() {
			profile.click();
		}
		public void clickOnviewprofile() {
			viewprofile.click();
		}
		
		public void clickOnUploadDoc() {
			UploadDoc.click();
		}
		
	
		}

