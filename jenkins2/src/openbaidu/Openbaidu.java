package openbaidu;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Openbaidu {
@Test
public void open() 	
{
	System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
    WebDriver web= new ChromeDriver();
    String url="https://www.baidu.com/";
    web.get(url);
    web.findElement(By.name("wd")).sendKeys("jenkins");
    web.findElement(By.className("btn self-btn bg s_btn")).click();
	}                  
}
