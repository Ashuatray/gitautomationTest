import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class parseExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String name = "Ashutosh sharma";
		parseExample Password = new parseExample();
		String password = Password.getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class =\"login-container\"]/h2")).getText(),"Hello " +name + ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		
	}
	
	public String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String text = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] tmpPswrd = text.split("'");
		String password = tmpPswrd[1].split("'")[0];
		return password;
		
	}

}

