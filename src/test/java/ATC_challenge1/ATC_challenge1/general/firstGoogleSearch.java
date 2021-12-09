package ATC_challenge1.ATC_challenge1.general;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class firstGoogleSearch {
	
	public WebDriver driver;
	public POFGoogleS fgsObject;
	
	@Before
	public void FirstChallenge() {
					
		fgsObject = new POFGoogleS (driver);
		
		fgsObject.user_launch_chrome_browser();
		
		fgsObject.user_opens_url("https://www.google.com");
		
		fgsObject.user_types_in_the_search_box_the_criteria("uciencia"); 
		
		fgsObject.user_clic_on_the_search_button(); 
		
		fgsObject.user_clic_the_first_result_on_the_list_if_contains_the_criteria();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//fgsObject.the_user_close_browser();

	}
	
	

}
