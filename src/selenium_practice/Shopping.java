package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	/*	driver.findElement(By.xpath("(//*[text()=\"Create an Account\"])[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Sri");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("kanth");
		driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("sri12345@gamail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sri12345@");
		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("sri12345@");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		*/
		
		driver.findElement(By.xpath("//*[@name=\"login[username]\"]")).sendKeys("sri12345@gamail.com");
		driver.findElement(By.xpath("//*[@name=\"login[password]\"]")).sendKeys("sri12345@");
		driver.findElement(By.cssSelector("button.login[id=\"send2\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1300)");
		
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[2]/div[3]/div/div/ol/li[4]/div/a/span/span/img")).click();
		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-169\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-53\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("4");
		driver.findElement(By.xpath("(//*[@class=\"product-addto-links\"]//span)[1]")).click();
	}

}
