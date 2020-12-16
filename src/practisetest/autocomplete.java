package practisetest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\v-raango\\workspace\\practisetest\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		WebElement from = driver.findElement(By.id("fromPlaceName"));
		WebElement to = driver.findElement(By.id("toPlaceName"));
		from.click();
		from.sendKeys("kha");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String expectedFromsearch = "Khammam";
		String expectedToSearch = "HYDERABAD";
		// WebDriverWait wait=new WebDriverWait(driver,5);
		List<WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase(expectedFromsearch)) {
				option.click();
				break;
			}
		}
		to.click();
		to.sendKeys("HYD");
		Thread.sleep(2000L);

		List<WebElement> list = driver.findElements(By.cssSelector("li.ui-menu-item a"));
		for (WebElement l : list) {
			if (l.getText().equalsIgnoreCase(expectedToSearch)) {
				l.click();
				break;
			}
		}
	}

}
