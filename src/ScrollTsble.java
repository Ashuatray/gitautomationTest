import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollTsble {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().fullscreen();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(Duration.ofSeconds(3));
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		int sum =0;
		System.out.println("this is the data of the first table \n");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(int i=0;i<values.size();i++) {
			System.out.println(Integer.parseInt(values.get(i).getText()));
			
			sum = sum + Integer.parseInt(values.get(i).getText());
			
			
		}
		System.out.println("\nthe sum of the data of first row is : "+sum+"\n");
		
		
		driver.findElement(By.cssSelector(".table-display"));
		List<WebElement> table2 = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		System.out.println("this is data of table2 :\n");
		int sum2=0;
		
		for(int i=0;i<table2.size();i++) {
			System.out.println(table2.get(i).getText());
			sum2 = sum2 + Integer.parseInt(table2.get(i).getText());
			
		}
		System.out.println("this is the sum of table 2 : "+sum2);
		String expected=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int expected2 = Integer.parseInt(expected);
		System.out.print(sum+ "," +expected2);
		
		Assert.assertEquals(sum,expected2);
		
		
		
		driver.close();		
		// TODO Auto-generated method stub

	}

}
