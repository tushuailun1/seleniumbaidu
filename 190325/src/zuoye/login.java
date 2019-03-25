package zuoye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
	static WebDriver web;
	static String url;
	@BeforeClass
	public void one(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		web = new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";
		web.get(url);
	}
	@Test
	public void kaos() throws InterruptedException{
		web.findElement(By.name("username")).sendKeys("hujianming");
		web.findElement(By.name("userpass")).sendKeys("hujianming123");
		WebElement select = web.findElement(By.name("usertype"));
		Select s=new Select(select);
		s.selectByIndex(2);
		Thread.sleep(5000);
		web.findElement(By.className("tm_btn")).click();
	}
	@AfterClass
	public void close() throws InterruptedException{
		Thread.sleep(2000);
		web.close();
	}
}
