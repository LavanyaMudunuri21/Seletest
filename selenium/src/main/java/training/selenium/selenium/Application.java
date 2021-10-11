package training.selenium.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Application {

	public static void main(String[] args) {
		System.out.println("Hello selenium");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\MudunuriLavanya\\eclipse-workspace\\training\\selenium\\Drivers\\geckodriver.exe");
		WebDriver wd;
		try {
			wd = new FirefoxDriver();
			wd.manage().window().maximize();
			Thread.sleep(2000);
			//wd.navigate().to("https://artoftesting.com/samplesiteforselenium");
			//System.out.println("navigate text");
			wd.get("https://artoftesting.com/samplesiteforselenium");
			System.out.println("get text");
			Thread.sleep(20000);
			
		//	wd.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}