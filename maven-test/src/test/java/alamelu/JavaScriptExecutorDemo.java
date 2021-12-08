package alamelu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.getElementById('lastName').value='Alamelu'; ");
        js.executeScript("document.getElementById('userEmail').value='alamelsek@gmail.com';");
        WebElement radiobtn=driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
        js.executeScript("arguments[0].click();", radiobtn);
        		
       
	}
}
