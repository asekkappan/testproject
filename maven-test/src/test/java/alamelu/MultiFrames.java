package alamelu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement multi=driver.findElement(By.xpath("//div[@id='Multiple']//child::iframe"));
		driver.switchTo().frame(multi);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='container']//child::input")).sendKeys("Test");

	}

}
