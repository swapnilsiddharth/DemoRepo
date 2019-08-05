package gitdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\demo\\Downloads\\sidd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.close();
		System.out.println("this is first change in DemoRepo");
		//comment for checking push -try2
		//adding comment on 5 august
		//new comment thru demorepo
		//comment thru git2
	}

}
