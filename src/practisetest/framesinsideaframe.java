package practisetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class framesinsideaframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\v-raango\\workspace\\practisetest\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		
		WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Ramesh");
		System.out.println(text);
		driver.switchTo().frame("frame3");
		WebElement cb=driver.findElement(By.cssSelector("input[type='checkbox']"));
		if(!cb.isSelected())
		{
			cb.click();
		}
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[contains(text(),'Friendly ')]"));
		System.out.println(text.getText());
		
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		WebElement anim=driver.findElement(By.id("[animals] "));
		Select d=new Select(anim);
		d.selectByIndex(2);
		
		
	}

}
