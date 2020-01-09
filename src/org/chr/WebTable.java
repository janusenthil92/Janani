package org.chr;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JANANI\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		WebElement btn = driver.findElement(By.xpath("(//img[@id='user-id-goahead'])[1]"));
		btn.click();
		Thread.sleep(1000);
		WebElement txtUser = driver.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']"));
		txtUser.sendKeys("JananiSenthil");
		WebElement txtPass = driver.findElement(By.xpath("//input[@class='login-input-password']"));
		txtPass.sendKeys("274376asf");
		
		
		
		
			}
			

}