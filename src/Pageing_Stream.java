import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageing_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashua\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("th[role='columnheader']")).click();
		List<WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
		
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).getText());
//		}
		List<String> itemName = list.stream().map(s->s.getText()).collect(Collectors.toList());
		List <String> sortedList = itemName.stream().sorted().collect(Collectors.toList());
		sortedList.stream().forEach(System.out::println);
		List<String>price;
		
		do {
			
			List<WebElement> rows= driver.findElements(By.xpath("//tr/td[1]"));
			
			price = rows.stream().filter(s->s.getText().contains("Wheat")).map(s->getitemPrice(s)).collect(Collectors.toList());
			price.stream().forEach(s->System.out.println(s));
			if(price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				
			}
			
			
		}while(price.size()<1);
		
		driver.close();
	}
	
	private static String getitemPrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
		
		
		
	}

}
