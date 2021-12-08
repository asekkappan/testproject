package alamelu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class XpathPractice1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-6']/child::input[@id='firstName']")).sendKeys("Alamelu");
        driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-6']/child::input[@id='lastName']")).sendKeys("Sekkappan");
        driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']/child::input[1]")).sendKeys("alamelsek@gmail.com");
        driver.findElement(By.xpath("//div[@id='userNumber-wrapper']/child::div/following-sibling::div")).sendKeys("2404324577");
        

	}

}


