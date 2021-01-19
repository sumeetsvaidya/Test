package mavenOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	static ChromeOptions options = new ChromeOptions();
	static String projectPath = System.getProperty("user.dir");
	static WebDriver driver = null;
	
	
	public static void main(String[] args) {
		
	
		//System.setProperty("webdriver.chrome.driver",projectPath + "/Drivers/Chrome/chromedriver"); //For Chrome
		System.setProperty("webdriver.gecko.driver",projectPath + "/Drivers/Gecko/geckodriver"); //For Gecko
		options.setAcceptInsecureCerts(true);
		
		//driver = new ChromeDriver(options); //For chrome driver
		driver = new FirefoxDriver(); //For Gecko driver
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
	}
}
