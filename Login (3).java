import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	static WebDriverWait wait;
	WebDriver driver;
	@Test
	public void LaunchBrowser() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();

		// For launching  the browser
		driver.get("https://www.marathishaadi.com/");

		// For maximise the window
		driver.manage().window().maximize();

		//For adding implicit wait of 15 seconds
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//For locating username field
		WebElement lets_Begin = driver.findElement(By.xpath("//button[@class='btn-primary form-control']"));
		lets_Begin.click();
		
		WebElement Email_id = driver.findElement(By.xpath("//input[@data-testid='email']"));
		Email_id.sendKeys("rahul@gmail.com");

		//For locating password field
		WebElement password = driver.findElement(By.xpath("//input[@data-testid='password1']"));
		password.sendKeys("121212");
		
		WebElement profile_for = driver.findElement(By.xpath("//div[@class='Dropdown-control postedby_selector']"));
		Select select_Address_Proof_Document = new Select(profile_for);
		select_Address_Proof_Document.selectByVisibleText("Self");
		
		WebElement select_gender_Male = driver.findElement(By.xpath("//input[@id='gender_male']"));
		select_gender_Male.click();
		
		WebElement next_button_On_Panel_1 = driver.findElement(By.xpath("//button[@data-testid='next_button']"));
		next_button_On_Panel_1.click();
		
		//div[@class="Dropdown-placeholder is-selected"]
		WebElement verify_That_Marathi_IS_Selected = driver.findElement(By.xpath("//div[@class=\"Dropdown-placeholder is-selected\"]"));
		Assert.assertEquals(verify_That_Marathi_IS_Selected.getText(), "Marathi");
		
		
		
}
}
