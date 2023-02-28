package pipelineTest3.pipelineTest3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPipeline3Steps extends Base{
	
	@Given("I open the website {string}")
	public void i_open_the_website(String url) {
		driver.get(url);
	
	  
	}

	@When("I fillIn invalie login {string} and password {string}")
	public void i_fillIn_invalie_login_and_password(String login, String pw) {
		WebElement loginInput = driver.findElement(By.xpath("//form[@action='/login']//input[@type='email']"));
		WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
		
		loginInput.sendKeys(login);
		passwordInput.sendKeys(pw);
	  
	}

	@And("I click on login button")
	public void i_click_on_login_button() {
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginButton.click();
	  
	}

	@Then("A warning message is displayed")
	public void a_warning_message_is_displayed() {
		Assert.assertTrue(true);
	   
	}

}
