package BasicTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {

	ExtentReports extent;

	@BeforeTest
	public void reportConfig() {

		String Path = System.getProperty("user.dir") + "\\reports\\result.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
		reporter.config().setReportName("Autoamtion Resluts");
		reporter.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Chandrahas");
	}

	@Test
	public void testDemo() {
	
		extent.createTest("Test Demo");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "RahulShetty");
		extent.flush();
	}
}
