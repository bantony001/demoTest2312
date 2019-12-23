package demo.demoTest2312;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\eclipse-workspace\\demoTest2312\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\eclipse-workspace\\demoTest2312\\src\\test\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		System.out.println(browser);
	}
	
	@Test
	public void setUp() {
		// TODO Auto-generated method stub

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Russell Hobbs Automatic Stainless Steel Electric Kettle Dome 1818 1500 Watt - 1.8 Litre");
		driver.findElement(By.xpath("//input[@class='nav-input' and @type='submit']")).click();
		
	}
}
