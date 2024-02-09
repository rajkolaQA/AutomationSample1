package rajKolaAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation1 {

	public static void main(String[] args) throws Throwable {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,15);
		driver.findElement(By.id("name")).sendKeys("Nagaraju Kola");
		driver.findElement(By.id("email")).sendKeys("rajkola28.marolix@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9640651159");
		driver.findElement(By.id("textarea")).sendKeys("Khammam,Telangana");
		driver.findElement(By.id("male")).click();
		//List<WebElement> days = driver.findElements(By.xpath("//input[@class='form-check-input']"));
		driver.findElement(By.id("sunday")).click();
		Select drpCountry = new Select(driver.findElement(By.id("country")));
		drpCountry.selectByVisibleText("India");
		driver.findElement(By.xpath("//option[text()='Green']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("09/02/2024");

		WebElement alert = driver.findElement(By.xpath("//button[text()='Alert']"));
		alert.click();
		driver.switchTo().alert().accept();



		Thread.sleep(3000);
		driver.close();
	}

}
