package com.actitime.generic;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	public static	WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	public void login() throws Throwable {
		Reporter.log("login",true);
		FileLibClass fLib=new FileLibClass();
		String url = fLib.getPropertyData("url");
		String un = fLib.getPropertyData("username");
		String pwd = fLib.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.getUnTbx().sendKeys(un);
		l.getPwTbx().sendKeys(pwd);
		l.getLoginBtn().click();
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		HomePage h=new HomePage(driver);
		h.setLogoutBtn();
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close browser",true);
		driver.quit();
	}
}


















