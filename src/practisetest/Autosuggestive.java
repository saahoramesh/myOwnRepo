package practisetest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		System.setProperty("webdriver.chrome.driver","C:\\Users\\v-raango\\workspace\\practisetest\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		int ifrcnt=driver.findElements(By.tagName("iFrame")).size();
		System.out.println("iframeCount is: "+ ifrcnt);
		WebElement w=driver.findElement(By.tagName("iFrame"));
		
//		//driver.findElement(By.cssSelector("a.mmtLogo.makeFlex")).click();
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.alertIsPresent());
		
//		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.switchTo().alert().dismiss();
//		WebDriverWait wait1=new WebDriverWait(driver,10);
//		wait1.until(ExpectedConditions.alertIsPresent());
		//WebElement element = driver.findElement(By.id("promtButton");
		
		
		Alert promptAlert  = driver.switchTo().alert();
		   ((JavascriptExecutor) driver).executeScript("arguments[0].dismiss();",w);
		  		   
		  
		WebElement fromCity=driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
	    fromCity.click();
	    String k=Keys.chord(Keys.ARROW_DOWN,Keys.ENTER);
	    fromCity.sendKeys(Keys.SHIFT,"hyd");
	    fromCity.sendKeys(k);
	    System.out.println(fromCity.getText());
	    
		

	}

}
