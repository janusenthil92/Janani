package org.chr;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LaunchBro {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JANANI\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRows.size(); i++) {
			WebElement rows = tRows.get(i);
			List<WebElement> head = rows.findElements(By.tagName("th"));
			List<WebElement> data = rows.findElements(By.tagName("td"));
			for (int j = 0; j < head.size(); j++) {
				WebElement thead = head.get(j);
				String text2 = thead.getText();
				System.out.println(text2);
				for (int j2 = 0; j2 < data.size(); j2++) {
					WebElement tData = data.get(j2);
					String text = tData.getText();
					System.out.println(text);
				}
				
				
				
				
			}
			
		}
		
		
		
		
	}	
}	
	
		
		

		
		
		
