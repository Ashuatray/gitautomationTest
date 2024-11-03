import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] needItems = {"Cucumber","Beetroot","Potato"};
		addCart(driver,needItems, null);
		// TODO Auto-generated method stub

	}
	
	public static void addCart(WebDriver driver, String[] needItems,WebDriverWait w) {
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		int j = 0;
		for(int i=0;i<products.size();i++) {
			String[] name = products.get(i).getText().split("-");
			String formatName = name[0].trim();
			
			List<String> listItems = Arrays.asList(needItems);
			
			if(listItems.contains(formatName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==listItems.size()) {
					break;
				}
			}
		}
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector(".promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		driver.close();
	}

}
