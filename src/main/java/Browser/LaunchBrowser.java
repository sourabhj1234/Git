package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static WebDriver openBrowser() {
		ChromeOptions option = new ChromeOptions();//1
		option.addArguments("--disable-notifications");
		     WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver(option);
			driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));//implicit wait
			driver.navigate().to("https://app.growpital.com/login");
			return driver;
		
	}
}

