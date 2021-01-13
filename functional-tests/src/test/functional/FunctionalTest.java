package test.functional;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTest {

	private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","/Library/Java/JUNIT/chromedriver");
		driver = new ChromeDriver();
	    	// Seems no more working in last Chrome versions
		// driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     }

    // Test de la Story #1-homepage (https://trello.com/c/WKTneu9o/1-homepage)
	/*@Test
    public void testHomepage() throws Exception {
        driver.get("https://www.meetup.com/fr-FR/");
		assertEquals(driver.getTitle(), "Partagez vos passions | Meetup");
		// TODO
		// To Be Completed By Coders From Coding Factory
        System.out.println(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content"));
        assertTrue(driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content").contains("Partagez vos passions et faites bouger votre ville"));
        assertEquals(driver.findElement(By.tagName("h1")).getText(),"Le monde vous tend les bras");
        assertEquals(driver.findElement(By.className("exploreHome-hero-subTitle")).getText(),"Rejoignez un groupe local pour rencontrer du monde, tester une nouvelle activité ou partager vos passions.");
        assertEquals(driver.findElement(By.cssSelector("#joinMeetupButton")).getText(),"Rejoindre Meetup");
        assertEquals(driver.findElement(By.cssSelector("#joinMeetupButton")).getAttribute("href"),"https://www.meetup.com/fr-FR/register/");
    }*/

    // Test de la Story #4-Jobs
    @Test
    public void testJobs() throws Exception {
        driver.get("https://www.meetup.com/fr-FR/careers/");
        // TODO
        // To Be Completed By Coders From Coding Factory
        assertEquals(driver.findElement(By.cssSelector("p.insetParagraph")).getText(),"Join our team, find your people");
        assertEquals(driver.findElement(By.cssSelector("a.jobsBanner")).getText(),"Explore Opportunities");
        assertEquals(driver.findElement(By.cssSelector("a._stayInTouch-module_clickable__3g3mA")).getAttribute("href"),"https://www.meetup.com/careers/all-opportunities");
        assertEquals(driver.findElement(By.cssSelector("p._perksAndBenefits-module_isTitle__1-YvW")).getText(),"Perks and benefits");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
