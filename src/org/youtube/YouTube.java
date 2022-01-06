package org.youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\YouTube1\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
	searchBox.sendKeys("oo anta va mama");
	WebElement click = driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]"));
	click.click();
	WebElement song = driver.findElement(By.xpath("//yt-formatted-string[text()='#OoAntavaOoOoAntava Full Song | Pushpa Songs | Allu Arjun,Rashmika |DSP | Sukumar | Samantha']"));
	song.click();
	WebElement fsc = driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']"));
	fsc.click();
	
	}

}
