import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartAutosuggestive {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("Ashu");
		Thread.sleep(1000);
		List<WebElement> products = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		for(int i=0;i<products.size();i++) {
			System.out.println(products.get(i).getText());
		}
		
		System.out.println(products.size());
		driver.close();
		//li class="_3D0G9a"
		// TODO Auto-generated method stub
	}

}
