package Learning.SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.*;

public class TestClass {

	@SuppressWarnings({ "deprecation"})
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.letskodeit.com/");
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		d.manage().window().maximize();
		Thread.sleep(4000);
		d.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		Thread.sleep(4000);
		d.quit();
		
	}

}
