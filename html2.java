package AssignmentWeek4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class html2 {

	public static void main(String[] args) {
		
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://html.com/tags/table/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebElement row1 = driver.findElement(By.xpath("((//table)[1]//tr)[2]/td[1]"));
				String text = row1.getText();
				System.out.println(text);
				
				List<String> listOfrow1 = new ArrayList<String>();
				for(int i =2; i <=4; i++) {
					String marketshare = driver.findElement(By.xpath("((//table)[1]//tr)[2]/td["+i+"]")).getText();
					listOfrow1.add(marketshare);
				}
				System.out.println(listOfrow1);
				
				WebElement row2 = driver.findElement(By.xpath("((//table)[1]//tr)[3]/td[1]"));
				 String text1 = row2.getText();
				 System.out.println(text1);
				 
				 List<String> listOfrow2 = new ArrayList<String>();
				 
				
				 for(int j = 2 ; j<=4 ;j++) {
					 String absoluteusage = driver.findElement(By.xpath("((//table)[1]//tr)[3]/td["+j+"]")).getText();
					 listOfrow2.add(absoluteusage);
					
				}
				 System.out.println(listOfrow2);
				
			
	}
}

	