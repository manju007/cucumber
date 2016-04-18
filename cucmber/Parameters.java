package cucmber;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameters {

	WebDriver driver = null;

	@Given("^I am on the zoo website$")
	public void i_am_on_the_zoo_website() throws Throwable {
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.seleniumframework.com/Practiceform");
	}

	@When("^I click on the \"([^\"]*)\" page$")
	public void clickOnlink(String link) throws Throwable {
		driver.findElement(By.linkText(link)).sendKeys(Keys.ENTER);
	}

	@Then("^I check the page title is \"([^\"]*)\"$")
	public void i_check_the_page_title_is(String title) throws Throwable {
		assertEquals(driver.getTitle().trim(), title);
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		driver.close();
	}

}