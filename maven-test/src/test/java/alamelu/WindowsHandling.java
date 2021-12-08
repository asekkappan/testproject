package alamelu;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	// AMMU - SWITCH TO MULTIPLE WINDOW AND CLOSE IT AND COME BACK TO PARENT WINDOW
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href='#Seperate']")).click();

		String parentwindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set<String> multiple_windows = driver.getWindowHandles();
		List<String> li = new ArrayList(multiple_windows);
		for (int i = 0; i < li.size(); i++) {
			String checkwindowhandle = li.get(i);
			if (!checkwindowhandle.equals(parentwindow)) {
				driver.switchTo().window(checkwindowhandle);
				Thread.sleep(5000);
				driver.close();
				break;
			}

		}
		driver.switchTo().window(parentwindow);
	}

}
