package package2;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Text_case1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gbsk2\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		

		// 3-
		WebElement coloumndriver = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		int s=coloumndriver.findElements(By.tagName("a")).size();
		System.out.println(s);

		// 4- click on each link in the coloumn and check if the pages are opening-
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			
		} // opens all the tabs
		Set<String> abc = driver.getWindowHandles();// 4
	/*	Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
}*/
		
		//CONVERTING SET TO LIST TO ITERATION
		
		List<String> win_id_list=new ArrayList<>(abc);
		System.out.println(win_id_list);
//		String parentWindowID=win_id_list.get(0);
//		System.out.println(parentWindowID);
//		String childWindowID=win_id_list.get(1);
//		System.out.println(childWindowID);
		

		for(int i=0;i<s;i++)
		{
			driver.switchTo().window(win_id_list.get(i));
			System.out.println(driver.getTitle());
			
			}
			
		}
		

}
