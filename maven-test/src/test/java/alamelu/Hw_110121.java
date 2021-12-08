package alamelu;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw_110121 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.findElement(By.id("firstName")).sendKeys("Alamelu");
        driver.findElement(By.id("lastName")).sendKeys("Sek");
        driver.findElement(By.id("userEmail")).sendKeys("alamelsek@gmail.com");
        driver.findElement(By.id("userNumber")).sendKeys("2404324577");
        
		// TODO Auto-generated method stub

	}

}
