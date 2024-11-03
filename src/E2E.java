import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");

		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".r-1862ga2.r-1loqt21.r-1enofrn.r-tceitz.r-u8s1d.css-76zvg2")).click();
		driver.findElement(By.xpath("//div[text()='KQH']")).click();
		driver.findElement(By.cssSelector("div[class='css-76zvg2 r-1xedbs3 r-ubezar']")).click();
		driver.findElement(By.xpath("//div[text()='one way']")).click();
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		Thread.sleep(1000);
		for(int i=0;i<=4;i++) {
			driver.findElement(By.cssSelector("div[data-testid*='Adult-testID-plus']")).click();
		}
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		driver.findElement(By.xpath("//div[text()='CAD']")).click();
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();
		
		
		
		driver.close();

		//driver.findElement(By.clr-1loqt21')).click();
		//driver.close();
	}

}
