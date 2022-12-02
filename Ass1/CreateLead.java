package week5.day1.Ass1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	@Test(dataProvider = "CreateLead")
	
	public void runCreateLead(String cname, String fname, String lname, String pno) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pno);
		driver.findElement(By.name("submitButton")).click();
}
	@DataProvider(name = "CreateLead")
	public String[][] getData() {
		String[][] data = new String[2][4];
		
		//first set of data. First row
		data[0][0] = "Testleaf";
		data[0][1] = "Guru";
		data[0][2] = "edward";
		data[0][3] = "99";
		
		//first set of data. Second row
		data[1][0] = "Zoho";
		data[1][1] = "Prasath";
		data[1][2] = "saras";
		data[1][3] = "98";
		return data;
		
	}
}






