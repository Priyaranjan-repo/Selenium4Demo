package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://google.com";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println("Priyaranjan Das is Great guy");
		driver.close();
	}
}
