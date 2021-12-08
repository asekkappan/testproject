package alamelu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_WebTable_Calendar {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		Actions ac1=new Actions(driver);
		ac1.moveToElement(date).click().build().perform();
		//date.click();
		List<WebElement> webtabledata = driver.findElements(By.xpath("//tbody/tr"));
		for (int i = 2; i < webtabledata.size(); i++) {
			List<WebElement> webtabledata2 = webtabledata.get(i).findElements(By.xpath("//td"));
			for (int j = 0; j < webtabledata2.size(); j++) {
				String str = webtabledata2.get(j).getText();
				System.out.println(str);

			}

		}
	}

}
