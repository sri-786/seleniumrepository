package package2;



import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Text_case2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Apple watch");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		String parentHandle=driver.getWindowHandle();
		//System.out.println(parentHandle);
		
		driver.findElement(By.xpath("//*[@data-image-source-density=\"1\"]")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
		//System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				String title=driver.switchTo().window(handle).getTitle();
				System.out.println(title);
				driver.close();
	}
}

		Thread.sleep(3000);
		
		driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		Set<String> handless=driver.getWindowHandles();
		for(String handlee:handless) {
			//System.out.println(handle);
			if(!handlee.equals(parentHandle)) {
				String title=driver.switchTo().window(handlee).getTitle();
				System.out.println(title);
				driver.close();
}
}
	Thread.sleep(3000);
	driver.quit();

	}
	
	}


