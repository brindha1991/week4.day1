package AssignmentWeek4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> columns = driver.findElements(By.xpath("//table//th"));
		int countOfColumns = columns.size();
		System.out.println(countOfColumns);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		int countOfrows = rows.size();
		System.out.println(countOfrows);
		
		String text = driver.findElement(By.xpath("//table//tr[3]")).getText();
		System.out.println(text);
		
		
		List<String> progressvalue = new ArrayList<String>();
		for(int i = 3; i<=5;i++) {
			String text2 = driver.findElement(By.xpath("//table//tr["+i+"]/td[2]")).getText();
			progressvalue.add(text2);
		}
		System.out.println(progressvalue);
		

	}

}
