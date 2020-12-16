package practisetest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Autocomplete_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String country="India";
		String to="GOA (GOI)";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\v-raango\\workspace\\practisetest\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/practice-project");
		
		
		
		
		driver.findElement(By.id("name")).sendKeys("ramesh angoth");;
		driver.findElement(By.id("email")).sendKeys("raslice8@gmail.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@type='submit']")));
		//driver.findElement(By.id("agreeTerms")).click();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
	//	src.click();
		////src.sendKeys("Ind");
	//	Thread.sleep(3000L);
		List<WebElement> drps=driver.findElements(By.cssSelector("li.ui-menu-item"));
		for(WebElement drp:drps){
			if(drp.getText().equalsIgnoreCase(country)){
				drp.click();
				break;
			}
		}
		Thread.sleep(3000L);
		//System.out.println(src.getText());
		
	}
	

}
