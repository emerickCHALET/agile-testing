package test.acceptance;

import java.util.concurrent.TimeUnit;

import java.lang.*;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class HomepageSteps {

	public static WebDriver driver;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
		// Seems no more working in last Chrome versions
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("^je suis sur la homepage$")
	public void je_suis_sur_la_homepage() throws Throwable {
		driver.get("https://www.meetup.com/fr-FR/");
	}

	@Then("^le titre doit être \"([^\"]*)\"$")
	public void le_titre_doit_être(String arg1) throws Throwable {
	    assertEquals(driver.getTitle(), arg1);
	}

	@Then("^la description contient \"([^\"]*)\"$")
	public void la_description_doit_être(String arg1) throws Throwable {
		// By CSS Selector
		assertTrue(driver.findElement(By.cssSelector("meta[name='description']")).getAttribute("content").contains(arg1));
		// By XPATH, si vous préférez...
	    // assertEquals(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content"), arg1);
	}

	@Then("^TO BE COMPLETED$")
	public void to_BE_COMPLETED() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^le bloc des \"([^\"]*)\" est présent$")
	public void le_bloc_des_est_présent(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^je clic sur le bouton \"([^\"]*)\"$")
	public void je_clic_sur_le_bouton(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^je suis sur la page \"([^\"]*)\"$")
	public void je_suis_sur_la_page(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^la recherche est initialisé sur un rayon de \"([^\"]*)\" autour de \"([^\"]*)\", FR$")
	public void la_recherche_est_initialisé_sur_un_rayon_de_autour_de_FR(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^le bouton inscription contient \"([^\"]*)\"$")
	public void le_bouton_inscription_contient(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}


	@After
	public void afterScenario() {
		driver.quit();
	}

}
