package week5.day1.Ass2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MandetoryFeildFill extends BaseClass {

	@Test
	public void runMandetoryFeildFill() throws InterruptedException {
		
		shadow.findElementByXPath("//div[@class='sn-polaris-navigation']//div[@aria-label='All']").click();
		WebElement filter = shadow.findElementByXPath("//input[@placeholder='Filter']");
		filter.click();
		filter.sendKeys("Knowledge");
		shadow.findElementByXPath("//mark[text()='Knowledge']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//span[text()='Create an Article']")).click();
		driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_knowledge_base']")).click();
		Set<String> WH = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(WH);
		driver.switchTo().window(lst.get(1));
		shadow.findElementByXPath("//a[text()='IT']").click();
		driver.switchTo().window(lst.get(0));
		WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_category']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='IT']")).click();
		driver.findElement(By.xpath("//span[text()='Java']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("Developer");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		System.out.println("Task Complted");
		
	}

}
