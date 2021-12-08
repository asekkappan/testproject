package alamelu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_Hw_11022021 {

	public static void main(String[] args) {
		//The below line downloads the appropriate chromedriver for the version of chrome we have 
		// and set the environment variable, which is needed
		//for the below command. This driver will be different
		//for different versions of chrome. So, it is better to do it by itslef
		//by having the command -  WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //WebDriver driver=new FireFoxDriver(); for Firefox browsers
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-6']/child::input[@id='firstName']")).sendKeys("Alamelu");
        driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-6'][2]/child::input")).sendKeys("Sekkappan");
        driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']/child::input[@id='userEmail']")).sendKeys("alamelsek@gmail.com");
        driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']//input[@placeholder='Mobile Number']")).sendKeys("2404324577"); 
        driver.
	}

}
