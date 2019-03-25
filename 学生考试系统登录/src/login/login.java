package login;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	public  WebDriver driver;
	public  String url;
	
	@BeforeTest
	public void sept() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		//定义网址
		url="http://localhost:8080/examsys";
	}
	@Test
	public void login1() throws InterruptedException {
		//打开网址
			driver.get(url);
		//用户名输入
			driver.findElement(By.name("username")).sendKeys("hujianming");
		//密码输入
			driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		//选择类型
			new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("管理员");
		//等待7秒
			Thread.sleep(7000);
		//点击登录
			driver.findElement(By.cssSelector("button.tm_btn")).click();
	}
	@AfterClass
	public void gb() throws InterruptedException {
		Thread.sleep(3000);
	}
}
