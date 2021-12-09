package ATC_challenge1.ATC_challenge1.general;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POFGoogleS {
	
	public WebDriver driver;
	
	//selectores Google page
	By searchinputfield = By.name("q");
	By searchbtn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	By elementlist = By.tagName("h3"); 
	
	
	public POFGoogleS (WebDriver pdriver) {
		this.driver = pdriver;
	}
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER"));
		driver = new ChromeDriver ();
		driver.manage().window().maximize(); 
	}
	
	@When("User opens URL: {string}")
	public void user_opens_url (String URL)
	{
		driver.get(URL);
	}
	
	@When("User types in the search box the criteria {string}")
	public void user_types_in_the_search_box_the_criteria(String inputText) 
	{
		driver.findElement(searchinputfield).clear();
		driver.findElement(searchinputfield).sendKeys(inputText);
	}
	
	@When("User clic on the search button")
	public void user_clic_on_the_search_button()
	{
		driver.findElement(searchbtn).click();
	}
	
	@Then("User clic the first result on the list if contains the criteria")
	public void user_clic_the_first_result_on_the_list_if_contains_the_criteria() {
		List<WebElement> list = driver.findElements(By.tagName("h3")); 
		
		if (list.get(0).getText().contains("uciencia")) 
		{
			System.out.print(list.get(0).getText()); //imprime el título de la página
			list.get(0).click();//da click en el primer elemento de la lista
		}
		else 
		{
			System.out.print("The search did not return results according to the criteria");
		}
		
	}
	
	@Then("The user close browser")
	public void the_user_close_browser() {
	    driver.quit();
	}
	
	

}
