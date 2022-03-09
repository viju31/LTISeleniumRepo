package github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./exe file/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.name("Email")).sendKeys("ahujavijay.12@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("ahuja123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.close();
	}

}
