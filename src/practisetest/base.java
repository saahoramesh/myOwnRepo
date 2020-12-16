package practisetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class base {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\v-raango\\workspace\\practisetest\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int array[]={1,2};
		dropdowns.staticDropDown(driver);
		dropdowns.checkboxes(driver,2,array);
	
		dropdowns.radioButtons(driver,1);
		
	}

}
