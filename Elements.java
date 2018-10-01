package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {
	static String baseurl="https://tm-am-stg.io-media.com/genesis/";
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver","\\Users\\ashishtanwar\\Desktop\\learn\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(baseurl);
		System.out.println("close");
		driver.close();
	}

}
