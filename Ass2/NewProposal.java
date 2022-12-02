package week5.day1.Ass2;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewProposal extends BaseClass {

	@Test
	public void runNewProposal() throws InterruptedException {
		
		shadow.findElementByXPath("//div[@class='sn-polaris-navigation polaris-header-menu']//div[text()='All']").click();
		WebElement filter = shadow.findElementByXPath("//input[@placeholder='Filter']");
		filter.click();
		filter.sendKeys("Proposal");
		shadow.findElementByXPath("//span[contains(text(),'My Proposal')]").click();
		WebElement New = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(New);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("Developer");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		List<WebElement> len = driver.findElements(By.xpath("//tbody[@class='list2_body']//tr"));
		String Result = driver.findElement(By.xpath("//tr["+len.size()+"]//td[4]")).getText();
		System.out.println("Template Description : "+Result);
	}

}
