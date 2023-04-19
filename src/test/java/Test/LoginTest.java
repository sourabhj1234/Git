package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Browser.LaunchBrowser;
import POM.BaseTest;
import POM.LoginPage;
import utility.Parameterization;

public class LoginTest extends BaseTest {
		
		 @BeforeMethod
		   public void launchBrowser() {
		WebDriver driver=LaunchBrowser.openBrowser();
		   }
		   
		   @Test
		   
		   public void LoginTest() throws  EncryptedDocumentException, IOException {
			  LoginPage LoginPage = new LoginPage(driver);
			 String user =  Parameterization.getData("Credentials", 0, 1);
			 String pass =  Parameterization.getData("Credentials", 1, 1);
			   LoginPage.enterUserName(user);
			   LoginPage.enterPassWord(pass);
			    LoginPage.clickOnlogin();
			    LoginPage.clickOnprofile();
			    LoginPage.clickOnviewprofile();
			    LoginPage.clickOnUploadDoc();
			    
    driver.findElement(By.xpath("(//input[@type=\"file\"])[1]")).sendKeys("C:\\Users\\Admin\\Downloads\\pandummy.jpg");
	driver.findElement(By.xpath("(//input[@type=\"file\"])[2]")).sendKeys("C:\\Users\\Admin\\Downloads\\adhar dummy.jpg");		    
	driver.findElement(By.xpath("(//input[@type=\"file\"])[3]")).sendKeys("C:\\Users\\Admin\\Downloads\\dummy check");	    
	}
	}

