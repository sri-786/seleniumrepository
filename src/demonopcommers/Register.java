package demonopcommers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Register {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
	
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcart");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Register the WebPage Enter the all details
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Sri");
		driver.findElement(By.name("LastName")).sendKeys("Kanth");
		
		WebElement select_d=driver.findElement(By.name("DateOfBirthDay"));
		Select select_day=new Select(select_d);
		select_day.selectByIndex(5);
		
		WebElement select_m=driver.findElement(By.name("DateOfBirthMonth"));
		Select select_month=new Select(select_m);
		select_month.selectByValue("3");
		
		WebElement select_y=driver.findElement(By.name("DateOfBirthYear"));
		Select select_year=new Select(select_y);
		select_year.selectByVisibleText("1998");
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys("sri1231@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"Company\"]")).sendKeys("Charani");
		driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("srikanth1234");
		driver.findElement(By.cssSelector("input[name=\"ConfirmPassword\"]")).sendKeys("srikanth1234");
		driver.findElement(By.cssSelector("button.button-1[id=\"register-button\"]")).click();
		
		
	}

}
