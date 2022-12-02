package week5.day1.Ass2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class BaseClass {
	
	public ChromeDriver driver;
	public Shadow shadow;
	
	@BeforeMethod
	public void PreCondition() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://dev67059.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Pb*8-zY0axRR");
		driver.findElement(By.id("sysverb_login")).click();
		shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		
	}
	
	@AfterMethod
	public void PostCondition() {
		driver.close();
	}

}
