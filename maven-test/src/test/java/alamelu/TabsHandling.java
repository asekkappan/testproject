package alamelu;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='#Tabbed']")).click();
        String parentwindow=driver.getWindowHandle();
        System.out.println("The parent widow handle name is" + parentwindow);
        driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info']")).click();
        Set<String> multitabs=driver.getWindowHandles();
        List<String> newlist=new ArrayList(multitabs);
        for (int i=0;i<newlist.size();i++) {
        	String checkwindow=newlist.get(i);
        	System.out.println(checkwindow);
        	if(!checkwindow.equals(parentwindow)) {
        		driver.switchTo().window(checkwindow);
        		Thread.sleep(5000);
        		driver.close();
        		break;
        	}
        }
	}

}
