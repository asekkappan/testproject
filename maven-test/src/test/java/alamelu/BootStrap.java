package alamelu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        //driver.findElement(By.xpath("//label[contains(text(),'FROM')]")).click();
        
        
        //FROM SECTION
        driver.findElement(By.id("src")).sendKeys("Ch");
        List<WebElement> li=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']//child::li"));
        for (int i=0;i<li.size();i++) {
        	//System.out.println(li.get(i).getText());
        	if(li.get(i).getText().contains("Egmore")) {
        		li.get(i).click();
                break;
        	}
        
       }
        Thread.sleep(10000);
        
        //TO SECTION
        driver.findElement(By.id("dest")).sendKeys("Pud");
        List<WebElement> destlist=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']//child::li"));
        for (int j=0;j<destlist.size();j++) {
        	//System.out.println(destlist.get(j).getText());
        	if(destlist.get(j).getText().equals("Pudukottai")) {
        		
        		destlist.get(j).click();
        		break;
        	}
        }
           
        
        
        
        
        
        
        
        //List<WebElement> li=driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']//child::li"));
        
//        for (int i=0;i<li.size();i++) {
//        	System.out.println(li.get(i).getText());
//        	if (li.get(i).getText().equals("Egmore, Chennai")){
//        		li.get(i).click();
//        		break;
//        	}
//        }
        
//        WebElement from=driver.findElement(By.xpath("//label[contains(text(),'FROM')]"));
//        Wait expwait=new WebDriverWait(driver,Duration.ofSeconds(25));
//        expwait.until(ExpectedConditions.visibilityOf(from));
//        
//        driver.findElement(By from);
//        driver.findElement(By.xpath("//label[contains(text(),'FROM')]")).sendKeys("Ch");
          
        
       
//        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
//
//		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
//
//		List<WebElement> li = driver
//				.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//child::input"));
//
//		for (int i = 0; i < li.size(); i++) {
//
//			String name = li.get(i).getAttribute("value");
//
//			System.out.println(name);

//		}

	}

}
