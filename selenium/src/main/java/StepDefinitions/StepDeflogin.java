package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDeflogin {
	WebDriver wd;
	public void sleep() {   try {
		Thread.sleep(2000);
		System.out.println("Signupbutton clicked");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Given("I am on the login page after entering URL in the browser")
	public void i_am_on_the_login_page_after_entering_url_in_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Hello selenium");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\MudunuriLavanya\\eclipse-workspace\\training\\selenium\\Drivers\\geckodriver.exe");
		wd = new FirefoxDriver();
		try {
			wd.manage().window().maximize();
			Thread.sleep(2000);
			//wd.navigate().to("https://artoftesting.com/samplesiteforselenium");
			//System.out.println("navigate text");
			wd.get("http://elearningm1.upskills.in/");
			System.out.println("get text");
			Thread.sleep(2000);
			
		//	wd.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			

	}


	@When("I Enter valid credentials in Username textbox")
	public void i_enter_valid_credentials_in_username_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		wd.findElement(By.id("login")).sendKeys("Username_testabc");
		sleep();
		System.out.println("User id entered");
	}

	@When("I Enter valid credential in pass text box and click login button")
	public void i_enter_valid_credential_in_pass_text_box_and_click_login_button() {
	   WebElement pass = wd.findElement(By.id("password"));
	   pass.sendKeys("Username@test194");
	   System.out.println("password entered"); 
	   pass.sendKeys(Keys.TAB);
	   pass.sendKeys(Keys.ENTER);
	   System.out.println("User logged in");
	   sleep();
	   
	}

	@Then("I shall get confirmation that user login is success")
	public void i_shall_get_confirmation_that_user_login_is_success() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		sleep();
		sleep();
		System.out.println("welcometext");
		System.out.println(wd.findElement(By.xpath("//p[contains(.,'Hello')]")).getText());
		
	}
	

}
