package Form_Submit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Submission {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tudip.com/contact/");
		
		
		driver.findElement(By.id("catapultCookie")).click();
		driver.findElement(By.xpath("//input[@name = 'first-name']")).sendKeys("Gitesh");
		driver.findElement(By.xpath("//input[@name = 'last-name']")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@name = 'your-email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name = 'your-subject']")).sendKeys("QA");
		driver.findElement(By.xpath("//textarea[@name = 'your-message']")).sendKeys("Thank you!");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@title = 'reCAPTCHA']"));
		
		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//div[@class = 'recaptcha-checkbox-border']")).click();
		
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		System.out.println("quiting driver");
		driver.quit();
		

	}


}
