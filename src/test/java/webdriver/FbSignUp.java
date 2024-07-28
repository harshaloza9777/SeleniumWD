package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement signUp=driver.findElement(By.partialLinkText("Create new "));
		signUp.click();
		
		WebElement day=driver.findElement(By.id("day"));
		Select dday=new Select(day);
		dday.selectByVisibleText("8");
		
		WebElement month=driver.findElement(By.id("month"));
		Select Mmonth=new Select(month);
		Mmonth.selectByVisibleText("Dec");
		
		WebElement year=driver.findElement(By.id("year"));
		Select yyear=new Select(year);
		yyear.selectByVisibleText("1998");
		
		WebElement radioBtn=driver.findElement(By.xpath("//label[text()='Male']"));
		radioBtn.click();
		
	}

}