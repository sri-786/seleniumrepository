package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shopping2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		Thread.sleep(3000);
		WebElement se = driver.findElement(By.xpath("//*[@class=\"product_sort_container\"]"));
		Select selet = new Select(se);
		selet.selectByValue("lohi");

		driver.findElement(By.xpath("//*[@id=\"item_2_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"item_0_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"item_1_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"item_3_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"item_5_img_link\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Sri");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("kanth");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("542348");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}

}
