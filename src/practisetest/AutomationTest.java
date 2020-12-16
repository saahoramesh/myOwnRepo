package practisetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\v-raango\\workspace\\practisetest\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.partialLinkText("Practice ")).click();
		
		driver.findElement(By.cssSelector("input#name")).sendKeys("Ramesh angoth");
		driver.findElement(By.id("email")).sendKeys("raslice@gmail.com");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text=driver.findElement(By.xpath("//h2[text()='Enter code here']")).getText();
		System.out.println(text);
		driver.quit();

	}

}
