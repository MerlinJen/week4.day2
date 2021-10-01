package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		String title = driver.getTitle();
		System.out.println("Main Window Title: " + title);
		driver.switchTo().frame(0);
		Actions builder = new Actions(driver);
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		builder.clickAndHold(resize).perform();
		builder.moveToElement(resize, 40, 80).perform();
		builder.click(resize).perform();
		
	}
}
