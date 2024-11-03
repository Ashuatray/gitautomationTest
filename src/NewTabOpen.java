import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabOpen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println(driver.findElements(By.tagName("a")).size());
//		WebElement footer = driver.findElement(By.cssSelector("div[id='gf-BIG']"));
//		System.out.println(footer.findElements(By.tagName("a")).size());
//		 we can create a sub part of the particular any column and the any section within in the driver load page ;
		WebElement footerClm = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerClm.findElements(By.tagName("a")).size());
		int clmSize= footerClm.findElements(By.tagName("a")).size();
		
		String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		for(int i=0;i<clmSize-1;i++) {
			driver.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			String window=it.next();
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
		
		

	}

}
