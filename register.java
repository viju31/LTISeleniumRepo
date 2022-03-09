package github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./exe file/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.name("FirstName")).sendKeys("ahuja");
	driver.findElement(By.name("LastName")).sendKeys("vijay");
	driver.findElement(By.name("Email")).sendKeys("ahujavijay.12@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("ahuja123");
	driver.findElement(By.name("ConfirmPassword")).sendKeys("ahuja123");
	Thread.sleep(2000);
	driver.findElement(By.name("register-button")).click();
	driver.close();

}
}
