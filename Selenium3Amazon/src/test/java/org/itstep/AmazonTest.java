package org.itstep;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class AmazonTest {
	WebDriver driver = null;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\TESTS\\WEB DRIVERS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}

	

	@Test
	public void test() {
WebElement enter = driver.findElement(By.id("nav-link-accountList"));
String href = enter.getAttribute("href");
driver.get(href);
		


WebElement reg = driver.findElement(By.id("createAccountSubmit"));
String href1 = reg.getAttribute("href");
driver.get(href1);


WebElement name = driver.findElement(By.id("ap_customer_name"));
name.sendKeys("Misha");



WebElement mail = driver.findElement(By.id("ap_email"));
mail.sendKeys("rararara101@yandex.ua");


WebElement passw = driver.findElement(By.id("ap_password"));
passw.sendKeys("123456");



WebElement passw2 = driver.findElement(By.id("ap_password_check"));
passw2.sendKeys("123456");



WebElement enter2 = driver.findElement(By.id("continue"));
enter2.submit();


		
	}

	@After
	public void tearDown() throws Exception {
	}

}
