package org.bsc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static void launchbrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
	}
	
	public static void Windowmaximize() {
		driver.manage().window().maximize();
		
	}
	
	public static void launchurl(String url) {
		driver.get(url);
		

	}
	
	public static String pagetitle() {
		String pgtitle = driver.getTitle();
		return pgtitle;
		

	}
	
	public static String pageurl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		

	}
	
	public static void passtext(String txt,WebElement ele){
	    ele.sendKeys(txt);	

	}
	
	public static void clickbtn(WebElement ele) {
		ele.click();

	}
	
	public static void closebrowser() {
		driver.quit();
		

	}
	
	public static void screenshot(String imgname) throws IOException {
		TakesScreenshot ts =(TakesScreenshot) driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+imgname.png");
		FileUtils.copyFile(img, f);

	}
	
	public static Actions a;
	
	public static void movethecursor(WebElement targetwebelement) {
		a = new Actions(driver);
		a.moveToElement(targetwebelement).perform();

	}
	
	public static void dragdrop(WebElement dragwebelement,WebElement dropwebelelment) {
		a= new Actions(driver);
		a.dragAndDrop(dragwebelement, dropwebelelment).perform();

	}
	
	public static JavascriptExecutor js;
	
	public static void scrollthepage(WebElement tarWebEle) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",  tarWebEle);
		

	}
	
	public static void scroll(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
		

	}

}
