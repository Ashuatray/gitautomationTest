import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class first_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
			Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked

			How to get the Count of number of check boxes present in the page
		*/
		//code for the first questions.
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		// In this above line the condition is checked by the assertions with TestNG file;
		
		//Answer for the second questions.
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.close();
		
		
	}

}
