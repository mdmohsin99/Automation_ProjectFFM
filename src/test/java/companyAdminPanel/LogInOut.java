package companyAdminPanel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInOut {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver;
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://104.248.53.138/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login")).sendKeys("omar@email.com");
		driver.findElement(By.id("password")).sendKeys("asdf1234");
		driver.findElement(By.xpath("//*[@id='formContent']/form/input[3]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dropdown-basic-button']")));
		
		/*
		WebElement ele = driver.findElement(By.xpath("//button[@id='dropdown-basic-button']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
		*/

		//driver.findElement(By.xpath("//*[@id='dropdown-basic-button']")).click();
		driver.findElement(By.xpath("//*[@id='kt_header']/div[2]/div/div/div/a[2]")).click();
		
		
		
		
	}


		
}


