package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpathfunctions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/about.htm;jsessionid=CCEABC702078B425F5DB278CC34CF710");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()=\"Register\"]")).click();                              //using text() function
		driver.findElement(By.xpath("//*[starts-with(@id,\"customer.firstName\")]")).sendKeys("Sri"); //using starts-with function
		driver.findElement(By.xpath("//*[starts-with(@id,\"customer.lastName\")]")).sendKeys("Kanth");
		
		driver.findElement(By.xpath("//*[contains(@id,\"street\")]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("Hyderabad"); //by using relative xpath
		driver.findElement(By.xpath("//*[contains(@id,\"sta\")]")).sendKeys("Telangana");
		driver.findElement(By.xpath("//*[contains(@id,\"zip\")]")).sendKeys("546748");
		driver.findElement(By.xpath("//*[contains(@name,\"pho\")]")).sendKeys("7250936398");
		driver.findElement(By.xpath("//*[contains(@name,\"ssn\")]")).sendKeys("721-07-4416");
		driver.findElement(By.xpath("(//*[contains(@name,\"username\")])[2]")).sendKeys("Srikanth");//using index contain function
		driver.findElement(By.xpath("//*[contains(@id,\"pas\")]")).sendKeys("sri123456");
		driver.findElement(By.xpath("//*[starts-with(@id,\"repeat\")]")).sendKeys("sri123456");
		driver.findElement(By.xpath("//*[@value=\"Register\"]")).click();
		
		}

}
