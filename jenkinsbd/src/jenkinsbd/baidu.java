package jenkinsbd;


	import java.net.MalformedURLException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

	public class baidu {
		public static WebDriver driver;
		public static String url;
		@BeforeClass
		public static void open() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
			driver=new ChromeDriver();
			
			url="www.baidu.com";
		}
		@AfterClass
		public void guanbi() {
			//driver.quit();
		}
	}


