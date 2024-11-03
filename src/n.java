import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class n {

		public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","./chromedriver87/chromedriver.exe");

		    WebDriver driver=new ChromeDriver();   

		    driver.get("http://www.spicejet.com/");

		    driver.manage().window().maximize();

		    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		    System.out.println(driver.getTitle());

		    Thread.sleep(8000);

		    // Date Selection

		    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();

		while(!driver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText().contains("January"))

		{

		driver.findElement(By.xpath("//a[@data-handler='next']")).click();

		//driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

		System.out.println(driver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText());


		}

		List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));

		int count= dates.size();

		for(int i=0; i<count; i++)

		{

		String txt = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).getText();

		if(txt.equalsIgnoreCase("16"))

		{

		driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).click();

		System.out.println(txt);

		break;

		}

		}

        }
		

}
