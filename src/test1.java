import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.linkedin.com/home");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("username")).sendKeys("Ashu.atray143@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ashu143724");
		driver.findElement(By.className("btn__primary--large")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("error-for-password")).getText());
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("ashutosh sharma");
	

	}

}
