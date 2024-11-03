import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart_practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String[] needItems = {"Cucumber","Beetroot","Cauliflower"};
		
		addCart(driver,needItems);
		// TODO Auto-generated method stubj

	}
	
	public static void addCart(WebDriver driver , String[] needItems) {
		
		int j=0;
		
		List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++) {
			
			String[] name = products.get(i).getText().split("-");
			
			String finalName = name[0].trim();
			
			List<String> listNeedItems = Arrays.asList(needItems);
			
			if(listNeedItems.contains(finalName)) {
				
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==listNeedItems.size()) {
					
					break;
				}
			}	
			
		}
		
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("Ashutosh sharma");
		
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
		driver.findElement(By.cssSelector("input.promoCode")).clear();
		
		driver.navigate().refresh();
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		//driver.close();
	}

}
