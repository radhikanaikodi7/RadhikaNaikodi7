package StepDefination;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;





public class SearchStepDefination {

	WebDriver driver;
	

	
	@Given("User opens Labcorp url")
	public void User_opens_Labcorp_url() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("Chrome browser is open");
		driver.get("https://www.labcorp.com" );
		driver.manage().window().maximize();
		WebElement carrer=new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='text-a63751913f']"))));
		
				
	}


@When("User clicks on Carrer Link")
public void User_cliks_On_Carrer_Link()
{
	//Click on carrer link
	driver.findElement(By.xpath("//div[@id='text-a63751913f']")).click();
	
	WebElement SearchPage=new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='Search job title or location']"))));
	
	/*
	 * List<WebElement> results=new WebDriverWait(driver,
	 * 20).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(
	 * "//div[@class='job-title']"))); //Assert.assertEquals(true,
	 * driver.findElement(By.xpath("(//span[text()='Category'])[1]")).isDisplayed())
	 * ; Assert.assertEquals(true, driver.findElement(By.
	 * xpath("//span[text()='Senior Test Automation Engineer ']/../../../../p//span/span[text()='Category']"
	 * )).isDisplayed());
	 * //span[text()='Category'])[1]/../../../..//span[text()='Senior Test
	 * Automation Engineer '] Assert.assertEquals(true, driver.findElement(By.
	 * xpath("//span[text()='Senior Test Automation Engineer ']/../../../../p//span/span[text()='Location']"
	 * )).isDisplayed()); Assert.assertEquals(true, driver.findElement(By.
	 * xpath("//span[text()='Senior Test Automation Engineer ']/../../../../p//span/span[text()='Job Type']"
	 * )).isDisplayed()); Assert.assertEquals(true, driver.findElement(By.
	 * xpath("//span[text()='Senior Test Automation Engineer ']/../../../../p//span/span[text()='Job Type']"
	 * )).isDisplayed());
	 */
}
@When("User searches for job in search box and clicks on Search Icon")
public void User_Searches_for_job()
{
	WebElement searchBox=driver.findElement(By.xpath("//input[@placeholder='Search job title or location']"));
	//Enter Text in search box
	searchBox.sendKeys("QA Test Automation Developer");
	searchBox.sendKeys(Keys.ENTER);
}
@Then("User should see the search results")
public void user_should_see_the_search_results()
{
	//Check for results
	List<WebElement> results=new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='job-title']")));
}

@Then("Asserts for Job Tiltle Job Location and Job ID")
public void asserts_forJob_Title_Job_Location_Job_ID()
{
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//span[text()='Senior Test Automation Engineer ']")));
	
	Assert.assertEquals(true, driver.findElement(By.xpath("//span[text()='Senior Test Automation Engineer ']/../../../../p//span/span[text()='Category']")).isDisplayed());
	Assert.assertEquals(true, driver.findElement(By.xpath("//span[text()='Senior Test Automation Engineer ']/../../../../p//span/span[text()='Location']")).isDisplayed());
	Assert.assertEquals(true, driver.findElement(By.xpath("//span[text()='Senior Test Automation Engineer ']/../../../../p//span/span[text()='Job Type']")).isDisplayed());
	Assert.assertEquals(true, driver.findElement(By.xpath("//span[text()='Senior Test Automation Engineer ']/../../../../p//span/span[text()='Job Type']")).isDisplayed());	
}

@Then("click on job title and click on Apply now")
public void click_on_job_title_and_click_on_Apply_now() throws InterruptedException
{
	//click on job
	driver.findElement(By.xpath("//span[text()='Senior Test Automation Engineer ']")).click();
	Thread.sleep(20);
	WebElement ApplyNow=new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Senior Test Automation Engineer ']")));
	//Click on Apply Now
	ApplyNow.click();
}
}