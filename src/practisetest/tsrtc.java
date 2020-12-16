package practisetest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tsrtc {

	private static final int INTEGER_MAX = 0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\v-raango\\workspace\\practisetest\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		WebElement from=driver.findElement(By.id("fromPlaceName"));
		WebElement to=driver.findElement(By.id("toPlaceName"));
		from.click();
		from.sendKeys(Keys.SHIFT,"HYD");
		from.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		WebDriverWait wait=new WebDriverWait(driver,10);
		boolean flag=wait.until(ExpectedConditions.textToBePresentInElementValue(from, "HYDERABAD") );
		if(flag){
		String src=from.getText();
		System.out.println(src);
		}
		else{
			System.out.println("Text not seen");
		}
		to.click();
		to.sendKeys(Keys.SHIFT,"KHA");
		int n=10;
		System.out.println(n);
		String dstn=to.getText();
		//System.out.println("Before "+src);
		for(int i=0;i<n;i++){
			
			to.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000L);
			if(dstn.equalsIgnoreCase("KHAMMAM"))
			{   
				to.sendKeys(Keys.ENTER);
				
				break;
			}
				
		}
		
		System.out.println("After "+dstn);
		
		
	}

}
