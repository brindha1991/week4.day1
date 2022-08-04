package AssignmentWeek4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chittorgarh {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("https://www.chittorgarh.com/");
		//maximize the browser(window)
		driver.manage().window().maximize();
		//Add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		String header = driver.findElement(By.xpath("//table//th[3]")).getText();
		System.out.println(header);

		List<WebElement> Size = driver.findElements(By.xpath("(//table)[2]//tr"));
		int rows = Size.size();
		System.out.println(rows);

		List<String> List=new ArrayList<String>();

		//Get all the Security names
		for(int i =1; i < rows; i++) {
			String names = driver.findElement(By.xpath("(//table)[2]//tr["+i+"]/td[3]")).getText();
			System.out.println(names);
			List.add(names);
		}
		 //Remove duplicate using set
		Set<String>duplicate=new LinkedHashSet<String>(List);
		int size = duplicate.size();
		System.out.println(size);
		
		//check whether the duplicates in security names
		if(List.size()== duplicate.size()) {
			System.out.println("It has no duplicates");
		}
		else {
			System.out.println("It has duplicates");
		}
		

	}

}
