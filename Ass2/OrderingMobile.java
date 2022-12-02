package week5.day1.Ass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class OrderingMobile extends BaseClass {

	@Test
	public void runOrderingMobile() {
		
		shadow.findElementByXPath("//div[@class='sn-polaris-navigation']//div[@aria-label='All']").click();
		shadow.findElementByXPath("//spn[@class='item-icon']//span[text()='Service Catalog']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		driver.findElement(By.xpath("(//h2//strong)[1]")).click();
		driver.findElement(By.xpath("//label[text()='Blue']")).click();
		driver.findElement(By.xpath("//label[text()='256 GB']")).click();
		driver.findElement(By.xpath("//label[text()='No']")).click();		
		WebElement opt = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select se = new Select(opt);
		se.selectByValue("500MB");
		driver.findElement(By.xpath("//button[contains(text(),'Order Now')]")).click();
		String result = driver.findElement(By.xpath("//span[@aria-live='assertive']")).getText();
		String Req = driver.findElement(By.xpath("//a[@id='requesturl']//b")).getText();
		
		if(result.equals("Thank you, your request has been submitted")) {
			System.out.println("Order Status : Success.");
			System.out.println("Request Number : "+Req);
		}
		else {
			System.out.println("Order Status : Failure");
		}			
	}

}
