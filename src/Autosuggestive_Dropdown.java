import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_Dropdown{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().fullscreen();
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("in ");
		Thread.sleep(1000);
		List<WebElement> countrys = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"]"));
		System.out.println(countrys.size());
		for(WebElement option:countrys) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		
		//driver.close();

	}
}
	
