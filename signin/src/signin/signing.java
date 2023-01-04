package signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signing {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
		// Perform the click operation that opens new window
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr467919");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qyvanyd");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
