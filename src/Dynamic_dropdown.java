import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://spicejet.com");
		driver.manage().window().fullscreen();
		driver.findElement(By.cssSelector("div[class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2']")).click();
		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		//driver.findElement(By.xpath("//div[text()='BHO']")).click();
		// this below line of code is example of the Parent-Child relationship locator to identify the object uniquely.
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[text()='BHO']")).click();
		//driver.findElement(by.)\
		driver.close();
		
	}
}
