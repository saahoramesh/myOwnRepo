package practisetest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void radioButtons(WebDriver driver, int index)

	{ // driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElements(By.xpath("//input[@name='radioButton']")).get(index).click();
		/*
		 * for(WebElement button:buttons) { button.click(); }
		 */
	}

	public static void getSelectedOption(Select dropDown) {
		String getSelectedValue = dropDown.getFirstSelectedOption().getText();
		System.out.println(getSelectedValue);

	}

	public static void checkboxes(WebDriver driver, int noChkboxesRq, int DesiredCheckboxes[])
			throws InterruptedException {

		// WebElement ch=driver.findElement(By.id("checkBoxOption1"));
		// ch.click();
		// ch.click();
		// Thread.sleep(2000L);
		// int index=0;
		int i = 0;
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int chkboxCount = checkBoxes.size();
		while (i < noChkboxesRq) {
			for (int k = 0; k < chkboxCount; k++) {

				if (k == DesiredCheckboxes[i])
				{
				
				String temp = checkBoxes.get(k).getAttribute("id");

				driver.findElement(By.xpath("//*[@id='" + temp + "']")).click();
				}

			}
			i++;

		}

	}
	/*
	 * int count=checkBoxes.size(); System.out.println(); int i=0; //for(int
	 * i=0;i<checkBoxes.size();i++){ while(i<count){
	 * 
	 * { actn=Keys.chord(Keys.TAB,Keys.SPACE); i++; ch.sendKeys(actn); if(i==2){
	 * break; } }
	 * 
	 * }
	 */

	// driver.findElement(By.id("checkBoxOption1")).click();

	public static void staticDropDown(WebDriver driver) {
		Select dropDown = new Select(driver.findElement(By.id("dropdown-class-example")));
		// select by visible text
		dropDown.selectByVisibleText("Option2");
		getSelectedOption(dropDown);

		// select by value
		dropDown.selectByValue("option1");
		getSelectedOption(dropDown);

		// select by index
		dropDown.selectByIndex(3);
		getSelectedOption(dropDown);
	}

}
