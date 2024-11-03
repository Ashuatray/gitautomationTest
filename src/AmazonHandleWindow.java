import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHandleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().fullscreen();
		
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.cssSelector("input.Pke_EE"))).click().keyDown(Keys.SHIFT).sendKeys("Ashutosh");
		
		WebElement move = driver.findElement(By.cssSelector("._1Us3XD"));
		a.moveToElement(move).contextClick();
		a.moveToElement(move).build().perform();
		// TODO Auto-generated method stub

	}

}
