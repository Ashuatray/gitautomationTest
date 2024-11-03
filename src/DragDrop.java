import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("div[id='column-a']"));
		
		WebElement destination = driver.findElement(By.cssSelector("div[id='column-b']"));
		a.dragAndDrop(destination, source).build().perform();
		//driver.close();
		
		
		// TODO Auto-generated method stub

	}

}
