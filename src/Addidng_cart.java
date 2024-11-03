import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addidng_cart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] needItmes= {"Cucumber","Carrot","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> product = driver.findElements(By.cssSelector("h4[class='product-name']"));
		int j=0;

		System.out.println("practice for the git");
		
		for(int i=0;i<product.size();i++) {
			String[] listProduct= product.get(i).getText().split("-");
			String formatProduct= listProduct[0].trim();
			List<String> productList = Arrays.asList(formatProduct);
			if(productList.contains(formatProduct)) {
				j++;
				driver.findElement(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==needItmes.length) {
					break;
				}
			}
		}
		
		
		
		
		
	
		System.out.println("example of adding cart");
		
		// TODO Auto-generated method stub

	}

}
