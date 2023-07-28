package curso_Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Validando_drivers_m_e_c_1 {
	public static void main(String[] args)  {
		// validando chrome driver
		  System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\chromedriver\\chromedriver.exe");	
		  WebDriver driver_chrome = new ChromeDriver();
		  driver_chrome.get("https://www.google.com");
	   
		// validando firefox geckodriver
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\geckodriver_mozilla\\geckodriver.exe");	
		  WebDriver driver_firefox = new FirefoxDriver();
		  driver_firefox.get("https://www.google.com");
		  
		// validando edgedriver
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\msedgedriver\\msedgedriver.exe");	
		  WebDriver driver_edge = new EdgeDriver();
		  driver_edge.get("https://www.google.com");
	}
}
