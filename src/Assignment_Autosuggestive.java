import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Autosuggestive {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		String name = "ja";
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys(name);
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.cssSelector(".ui-autocomplete-input")).getAttribute("value"));
		driver.close();
		

		
		
		// TODO Auto-generated method stub

	}

}
