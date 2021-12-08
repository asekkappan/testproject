package alamelu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/webtable/");
		driver.manage().window().maximize();
		List<WebElement> webtabledata=driver.findElements(By.xpath("//table//tr"));
		System.out.println(webtabledata.size());
		
        for(int i=0;i<webtabledata.size();i++) {
        	//System.out.println(i);
        	String name=webtabledata.get(i).findElement(By.xpath("//tr["+(i+1)+"]//td[1]//b")).getText();
        	
        	System.out.println(name);
        	
        	if (name.equals("Title")) {
        	    String val=webtabledata.get(i).findElement(By.xpath("//tr["+(i+1)+"]//td[2]")).getText();
        		System.out.println(val);
        		break;
      	}
        }
	}

}
