package seleniumcookbook.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumcookbook.tests.pageobjects.BmiCalcPage;
public class BmiCalculatorTests {
	
	@Test
	public void testBmiCalculation()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:/jars_webdriver_testng_datadriven/chromedriver/chromedriver.exe");
		//Open & Navigate to Chrome
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
	
	
		BmiCalcPage bmiCalcPage = new BmiCalcPage(driver);
		
		bmiCalcPage.heightCMS.sendKeys("181");
		bmiCalcPage.weightKg.sendKeys("100");
		bmiCalcPage.Calculate.click();
		
		assertEquals("24.4",bmiCalcPage.bmi.getAttribute("value"));
		assertEquals("Normal", bmiCalcPage.bmi_category.getAttribute("value"));
	
		driver.close();
	
	}



}


	


 