package alamelu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
        Thread.sleep(10000);
        Alert alert=driver.switchTo().alert();
        //alert.dismiss();
        alert.accept();
       
        		
	}

}
