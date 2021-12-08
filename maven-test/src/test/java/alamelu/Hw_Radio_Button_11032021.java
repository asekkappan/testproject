package alamelu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw_Radio_Button_11032021 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#firstName[placeholder='First Name']")).sendKeys("Alamelu");
        driver.findElement(By.cssSelector("input#lastName[placeholder='Last Name']")).sendKeys("Sekkappan");
        driver.findElement(By.cssSelector("#userEmail[placeholder='name@example.com']")).sendKeys("alamelsek@gmail.com");
        driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][2]/child::label")).click();
        driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-1\"]")).click();
        
       
	}

}
