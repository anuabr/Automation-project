package page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Rediffapplication {
	WebDriver driver;
	By fullname=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input");
	By rediffemail=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]");
	By password=By.xpath("//*[@id=\"newpasswd\"]");
	By retypepassword=By.xpath("//*[@id=\"newpasswd1\"]");
	By createmyaccount=By.xpath("//*[@id=\"Register\"]");
	By day=By.cssSelector("#tblcrtac > tbody > tr:nth-child(23) > td:nth-child(3) > select:nth-child(1)");
	By month=By.cssSelector("#tblcrtac > tbody > tr:nth-child(23) > td:nth-child(3) > select:nth-child(2)");
	By year=By.cssSelector("#tblcrtac > tbody > tr:nth-child(23) > td:nth-child(3) > select:nth-child(3)");
	By alternateemailaddress=By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input");
	By mobileno=By.xpath("//*[@id=\"mobno\"]");
	By country=By.xpath("//*[@id=\"country\"]");
	By city=By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select");
	By createarediffemailaccount=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[1]/td");
	By logo=By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img");
	By gender=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]");
	By captcha=By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input");
	
	
	
	
	
	
	


	 public Rediffapplication(WebDriver driver)
	  {
		  this.driver=driver;
	  }
	
	 /*public void setvalues(String name,String email,String alteremail,String no) 
	  {
		 driver.findElement(fullname).sendKeys(name);
		 driver.findElement(rediffemail).sendKeys(email);
		 driver.findElement(alternateemailaddress).sendKeys(alteremail);
		 driver.findElement(mobileno).sendKeys(no);
		 
		 }*/

	 
	 public void logo()
		{
			Boolean logo1=driver.findElement(logo).isDisplayed();
			if(logo1)
			{
				System.out.println("logo is display");
			}
			else
			{
				System.out.println("logo is not display");
				
		}
		}
	
	 
	 
	 public void gender()
	 {
	 	Boolean female=driver.findElement(gender).isSelected();
	 	
	 	String title=driver.getTitle();
	 	System.out.println(title);
	 			
	 	if(female)
	 	{
	 		System.out.println("gender is selected");
	 	}
	 	else
	 	{
	 		System.out.println("gender is not selected");
	 		
	 	}			
	 }

	
	  
	 public void copypaste()
	 {
	 	 WebElement name=driver.findElement(fullname);
	 	 name.sendKeys("anu");
	 	 WebElement pswd=driver.findElement(password);
	 	 Actions act=new Actions(driver);
	 	 act.keyDown(name,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	 	 act.keyDown(name,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	 	 act.keyDown(pswd,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	 	 act.perform();
	 	  
	 }

	 
	 
	 
	 public void dropdown()
	 {
	 	WebElement day1=driver.findElement(day);
	 	Select daydetails=new Select(day1);
	 	daydetails.selectByValue("12");
	 	WebElement month1=driver.findElement(month);
	 	Select monthdetails=new Select(month1);
	 	monthdetails.selectByVisibleText("MAR");
	 	WebElement year1=driver.findElement(year);
	 	Select yeardetails=new Select(year1);
	 	yeardetails.selectByIndex(02);
	 /*	WebElement country1=driver.findElement(country);
	 	Select countrydetails=new Select(country1);
	 	countrydetails.selectByVisibleText("India");
	 	WebElement city1=driver.findElement(city);
	 	Select citydetails=new Select(city1);
	 	citydetails.selectByVisibleText("cochin");*/
	 	
	 	}
	 
	 
	 
	 public void screenshot() throws IOException
	 {
		// File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     //FileHandler.copy(src, new File("D://rediff.png"));
		 WebElement button=driver.findElement(createmyaccount);
		 File buttonscreenshot=button.getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(buttonscreenshot,new File("./screenshot//button.png"));
	 }
	 
	 
	 public void scrolldown()
	 {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,200)","");
		 
	 }
	 
	
	  
	 
	 public void createmyaccount()
	  {
		  driver.findElement(createmyaccount).click();
		  
	  }
	 
	 
	
	 }



	 
