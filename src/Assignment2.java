import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		driver.findElement(By.name("name")).sendKeys("Ashutosh sharma");
		driver.findElement(By.name("email")).sendKeys("Ashutosh143@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Ashutosh");
		driver.findElement(By.id("exampleCheck1")).click();
		Select forms = new Select(dropdown);
		forms.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("03-02-2000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
		driver.close();
		// TODO Auto-generated method stub

	}

}
