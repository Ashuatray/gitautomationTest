import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_handleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parantWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		String text = driver.findElement(By.cssSelector("div.example h3")).getText().split(" ")[1].split("n")[0];
		System.out.println(text);
		driver.switchTo().window(parantWindow);
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
		
		System.out.println("the example of the git for learnign about branch");
		driver.quit();
		
		
		
		// TODO Auto-generated method stub

	}

}
