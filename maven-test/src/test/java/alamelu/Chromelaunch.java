package alamelu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromelaunch {

	public static void main(String[] args) {
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\12404\\OneDrive\\Documents\\Selenium\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.cnn.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       
        //driver.close();
        
	}

}
