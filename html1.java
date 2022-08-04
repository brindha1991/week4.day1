package AssignmentWeek4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class html1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 List<WebElement> Table1row = driver.findElements(By.xpath("(//table)[1]//tr"));
         int rowsize = Table1row.size();
         System.out.println(rowsize);
         
         List<WebElement> Table1column = driver.findElements(By.xpath("(//table)[1]//th"));
         int columnsize = Table1column.size();
         System.out.println(columnsize);
         
         List<WebElement> Table2row = driver.findElements(By.xpath("(//table)[2]//tr"));
         int rowsize2 = Table2row.size();
         System.out.println(rowsize2);
         
         List<WebElement> Table2column = driver.findElements(By.xpath("(//table)[2]//th"));
         int columnsize2 = Table2column.size();
         System.out.println(columnsize2);
	}

}
