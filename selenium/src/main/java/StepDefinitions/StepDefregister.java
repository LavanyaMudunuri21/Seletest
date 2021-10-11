package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefregister {
	WebDriver wd;
	public void sleep() {   try {
		Thread.sleep(2000);
		System.out.println("Signupbutton clicked");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Given("I am on the E-learning login page after entering URL in the browser")
	public void i_am_on_the_e_learning_login_page_after_entering_url_in_the_browser() {
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

	@When("I click on signup button")
	public void i_click_on_signup_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	   wd.findElement(By.linkText("Sign up!")).click();
	   sleep();
	   System.out.println("Registration page is displayed Step1:"+ wd.getTitle());
	}

	@When("I Enter valid credential in First name textbox")
	public void i_enter_valid_credential_in_first_name_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		wd.findElement(By.id("registration_firstname")).sendKeys("Firstname test");
		sleep();
		System.out.println("First name is step2:"+wd.findElement(By.id("registration_firstname")).equals("Firstname test"));
	}

	@When("I Enter valid credential in Last name textbox")
	public void i_enter_valid_credential_in_last_name_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		wd.findElement(By.id("registration_lastname")).sendKeys("Lastname test");
		sleep();
		System.out.println("Last name is step3:"+wd.findElement(By.id("registration_lastname")).equals("Lastname test"));
	}

	@When("I Enter valid credential in e-mail textbox")
	public void i_enter_valid_credential_in_e_mail_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		wd.findElement(By.id("registration_email")).sendKeys("testlav123@gmail.com");
		sleep();
		System.out.println("email is step4:"+wd.findElement(By.id("registration_email")).equals("testlav123@gmail.com"));

	}

	@When("I Enter valid credential in username textbox")
	public void i_enter_valid_credential_in_username_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		wd.findElement(By.id("username")).sendKeys("Username_testabc");
		sleep();
		System.out.println("User name is step5:"+wd.findElement(By.id("username")).isDisplayed());

	}

	@When("I Enter valid credential in pass textbox")
	public void i_enter_valid_credential_in_pass_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		wd.findElement(By.id("pass1")).sendKeys("Username@test194");
		sleep();
		System.out.println("Password is step6:"+wd.findElement(By.id("pass1")).equals("Username@test194"));

	}

	@When("I Enter valid credential in confirm password textbox")
	public void i_enter_valid_credential_in_confirm_password_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		wd.findElement(By.id("pass2")).sendKeys("Username@test194");
		sleep();
		System.out.println("Confirm password is step7:"+wd.findElement(By.id("pass2")).equals("Username@test194"));

	}

	@When("I Enter valid credential in phone textbox")
	public void i_enter_valid_credential_in_phone_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		wd.findElement(By.id("registration_phone")).sendKeys("9876547891");
		sleep();
		System.out.println("Mobile number is step8:"+wd.findElement(By.id("registration_phone")).equals("9876547891"));

	}

	@When("I Selected Valid credentials from Language list box")
	public void i_selected_valid_credentials_from_language_list_box() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement selectLanguage = wd.findElement(By.id("registration_language"));
		   Select sel1 = new Select(selectLanguage);
		   sel1.selectByValue("english");
		   sleep();
		   System.out.println("Step9 language selected");
		
	}

	@When("I Click Student radio button in Profile")
	public void i_click_student_radio_button_in_profile() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		sleep();
		 wd.findElement(By.xpath("//input[@value = '5']")).click();
		 //wd.findElement(By.cssSelector("//input[@value = '2']"));		 
		 System.out.println("Radio button clicked step10:");
		
	}

	@When("I Click on Register button")
	public void i_click_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		sleep();
		wd.findElement(By.id("registration_submit")).click();;
		System.out.println("Submit button clicked Step 11:");
	}


	@Then("I shall get confirmation that user registered.")
	public void i_shall_get_confirmation_that_user_registered() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		wd.getTitle();
		System.out.println("Sucessfully registered");
		System.out.println(wd.findElement(By.xpath("//div[@class= 'col-xs-12 col-md-12']")).getText());
	}
}