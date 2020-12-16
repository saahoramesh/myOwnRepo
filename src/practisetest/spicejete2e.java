package practisetest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejete2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\v-raango\\workspace\\practisetest\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//select dropdown departure city
		Thread.sleep(10000L);
		boolean sel=driver.findElement(By.xpath("//input[@value='OneWay']")).isSelected();
		System.out.println(sel);
		driver.findElement(By.xpath("//*[@value='RoundTrip']")).click();
		String round=driver.findElement(By.xpath("//label[text()='Round Trip']")).getText();
		System.out.println(round);
		//assert.assertTrue(sel);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='CCU']")).click();
		Thread.sleep(2000L);	
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		Select stc_dd=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		stc_dd.selectByIndex(2);
		String op1=stc_dd.getFirstSelectedOption().getText();
		System.out.println(op1);

		stc_dd.selectByVisibleText("USD");
		System.out.println(stc_dd.getFirstSelectedOption().getText());
		stc_dd.selectByValue("INR");
		System.out.println(stc_dd.getFirstSelectedOption().getText());
		/* List<WebElement> list=driver.findElements(By.className("ui-state-default"));

        for(WebElement date:list)
        {

        }*/




	}

	
	}


