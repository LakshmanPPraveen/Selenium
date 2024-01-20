package Learning.SeleniumProject;

import java.util.concurrent.TimeUnit;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Home {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		repository rep = new repository();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get(rep.url);
		d.manage().window().maximize();
		d.findElement(By.xpath(rep.xPath)).click();
		Thread.sleep(rep.med);
		System.out.println("Home page loaded Successfully");
		
		// Check if the Title of the page is Home Page.
		
		String pageTitle=d.getTitle();
		System.out.println(pageTitle);
		if (pageTitle.equals(rep.success))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		Thread.sleep(rep.med);
		
		
		d.findElement(By.xpath("//a[@class='btn btn-default btn-wide btn-lg dynamic-button']")).click();
		Thread.sleep(rep.low);
		String startlearning=d.getTitle();
		System.out.println("Start Learning page is loaded and the tile is: "+startlearning);
		
		//Verify whether the tiles are present in the Start Learning Page an get the heading of each tile.
		
		
		
		List<WebElement> tiles = d.findElements(By.xpath(rep.start_learnin_page_tile));
		int size = tiles.size();
		System.out.println(size);
		for (int i = 0; i<size; i++)
		{
	        WebElement Tile = tiles.get(i);
	        System.out.println(Tile);
	        //tiles.get(i).click();
	        String tileTitle =Tile.getText();
	        System.out.println("The tile title is: "+tileTitle);
		}
		List <WebElement> click = d.findElements(By.xpath(rep.Click));
	    size = click.size();
	    for (int i=0;i<size;i++)
	    {
	    	WebElement Text = click.get(i);
	    	Text.click();
	    	d.navigate().back();
	    	d.navigate().refresh();
	    }
		
		d.quit();
		
	}

}
