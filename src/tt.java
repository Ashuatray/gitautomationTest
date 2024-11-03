import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.cssSelector("input[name='checkBoxOption2']")).click();
		String opt = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(opt);
		WebElement options = driver.findElement(By.id("dropdown-class-example"));
		Select option = new Select(options);
		option.selectByVisibleText(opt);
		driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(opt);
		driver.findElement(By.cssSelector("input[id ='alertbtn']")).click();
		String alerttext=driver.switchTo().alert().getText();
		if(alerttext.contains(opt)) {
			System.out.println("string match"); 
			
		}else {
			System.out.println("string not matched");
		}
		driver.switchTo().alert().accept();
		
		
		//driver.close();
		// TODO Auto-generated method stub

	}

}
