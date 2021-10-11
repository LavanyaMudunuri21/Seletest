package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Editpassword {

	WebDriver wd;
	public void sleep() {   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	@Given("Login to user credentials")
public void login_to_user_credentials() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();wd.findElement(By.id("login")).sendKeys("Username_testabc");
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
	sleep();
	wd.findElement(By.id("login")).sendKeys("randomuse");
	sleep();
	System.out.println("User id entered");
	 WebElement pass = wd.findElement(By.id("password"));
	   pass.sendKeys("changed@137");
	   System.out.println("password entered"); 
	   pass.sendKeys(Keys.TAB);
	   pass.sendKeys(Keys.ENTER);
	   System.out.println("User logged in");
	   sleep();
}

@When("I click on Edit Profile")
public void i_click_on_edit_profile() {
	sleep();
	sleep();
	wd.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/auth/profile.php']")).click();
	sleep();
	System.out.println("Edit button clicked");
}

@When("I Enter valid credentials in New passord fied")
public void i_enter_valid_credentials_in_new_passord_fied() {
	sleep();
	wd.findElement(By.id("profile_password0")).sendKeys("changed@137");
	System.out.println("current password entered");
    wd.findElement(By.id("password1")).sendKeys("changed@139");
    System.out.println("newpassword typed");
}

@When("I enter password in Confirm Password field")
public void i_enter_password_in_confirm_password_field() {
	 wd.findElement(By.id("profile_password2")).sendKeys("changed@139");;
	    System.out.println("newpassword confirmed");
}

@When("I click on save changes")
public void i_click_on_save_changes() {
	sleep();
	wd.findElement(By.id("profile_apply_change")).click();
    System.out.println("save button clicked");
}

@Then("I shall get confirmation that new profile has been saved")
public void i_shall_get_confirmation_that_new_profile_has_been_saved() {
	sleep();
	sleep();
	System.out.println(wd.findElement(By.className("alert")).getText());
	
}


}
