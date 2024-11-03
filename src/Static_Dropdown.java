import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select Dropdown = new Select(StaticDropdown);
		Dimension size= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getSize();
		System.out.println(size);
		for(int i=0;i<4;i++)
		Dropdown.selectByIndex(2);
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		
		Dropdown.selectByIndex(0);
		System.out.println(Dropdown.getFirstSelectedOption().getText());

		Dropdown.selectByVisibleText("USD");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		//driver.close();

		
		

	}

}
