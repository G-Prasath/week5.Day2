package week5.day1.Ass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateNewCaller extends BaseClass {

	@Test
	public void runCreateNewCaller() throws InterruptedException {
		
		shadow.findElementByXPath("//div[@class='sn-polaris-navigation polaris-header-menu']//div[text()='All']").click();
		WebElement filter = shadow.findElementByXPath("//input[@placeholder='Filter']");
		filter.click();
		filter.sendKeys("Callers");
		shadow.findElementByXPath("//mark[text()='Callers']").click();
		WebElement New = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(New);
		driver.findElement(By.xpath("//button[text()='New']")).click();		
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Guru");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Prasath");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		String result = driver.findElement(By.xpath("//div[@class='outputmsg_text']")).getText();
		System.out.println("Result : "+result);
		
	}

}
