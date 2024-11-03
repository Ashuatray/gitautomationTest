import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutosuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("priya");
		Thread.sleep(1000);
		List <WebElement> list =driver.findElements(By.cssSelector("div.s-suggestion-container"));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		System.out.println(list.size());

		System.out.println("this is the example of autosuggestive dropdown");
		System.out.println("this is the example of autosuggestive dropdown");
		//driver.close();

		// TODO Auto-generated method stub

	}

}
