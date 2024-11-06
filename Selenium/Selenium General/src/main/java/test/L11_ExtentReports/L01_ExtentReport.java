package test.L11_ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.utilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class L01_ExtentReport extends TestBase {

    ExtentReports extentReport;
    ExtentTest extentTest;
    ExtentHtmlReporter extentSparkReporter;

    @Test
    public void extentReport() {
        extentReport = new ExtentReports();
        String date = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String filePath = "target/ExtentReport/extentReportTest"+date+".html";

        extentSparkReporter = new ExtentHtmlReporter(filePath);
        extentReport.attachReporter(extentSparkReporter);


        extentReport.setSystemInfo("Browser", "Chrome");
        extentReport.setSystemInfo("Tester", "Taylan");
        extentSparkReporter.config().setDocumentTitle("Extent Report");
        extentSparkReporter.config().setReportName("Smoke Test Report");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setEncoding("UTF-8");

        extentTest = extentReport.createTest("ebay test", "test report");

        driver.get("https://www.ebay.com");
        extentTest.info("user enters ebay page");

        WebElement searchBox = driver.findElement(By.cssSelector("input[type='text']"));
        searchBox.sendKeys("bisiklet", Keys.ENTER);
        extentTest.info("User types to searchBox bicycle and presses enter");

        screenShot();
        extentTest.info("User gets screenshot");
        extentReport.flush();
    }
}
