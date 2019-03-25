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
		//������ַ
		url="http://localhost:8080/examsys";
	}
	@Test
	public void login1() throws InterruptedException {
		//����ַ
			driver.get(url);
		//�û�������
			driver.findElement(By.name("username")).sendKeys("hujianming");
		//��������
			driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		//ѡ������
			new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("����Ա");
		//�ȴ�7��
			Thread.sleep(7000);
		//�����¼
			driver.findElement(By.cssSelector("button.tm_btn")).click();
	}
	@AfterClass
	public void gb() throws InterruptedException {
		Thread.sleep(3000);
	}
}
