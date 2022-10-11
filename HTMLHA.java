package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTMLHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//Launch the URL
		driver.get("https://html.com/tags/table/");
		List<WebElement> rowsList = driver.findElements(By.xpath("//table[@class='attributes-list']//tr[not(th)]"));

		//Get the count of number of rows
		int sizeRows = rowsList.size();
		System.out.println(sizeRows+" Rows");
		//Get the count of number of columns
		List<WebElement> colsList = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		int colsSize=colsList.size();
		System.out.println(colsSize+ " Columns");
	}

}
