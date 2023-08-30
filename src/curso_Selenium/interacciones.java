package curso_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class interacciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chrome
		//System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\chromedriver\\chromedriver.exe");	
		//WebDriver driver_chrome = new ChromeDriver();
		
		//driver_chrome.get("https://www.amazon.com");
		//send keys 
		//driver_chrome.findElement(By.id("twotabsearchtextbox")).sendKeys("nintendo switch");
	    //driver_chrome.findElement(By.id("nav-search-submit-button")).click();
		//clear
		//driver_chrome.findElement(By.id("twotabsearchtextbox")).clear();
		//click()
		//driver_chrome.findElement(By.id("nav-hamburger-menu")).click();
		//submit() ya no es valido
		
		
		
		//firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\geckodriver_mozilla\\geckodriver.exe");	
		WebDriver driver_firefox = new FirefoxDriver();		
		
		driver_firefox.get("https://www.amazon.com");
		//send keys 
		driver_firefox.findElement(By.id("twotabsearchtextbox")).sendKeys("nintendo switch");
	    driver_firefox.findElement(By.id("nav-search-submit-button")).click();
	    driver_firefox.findElement(By.className("s-image")).click();
	    driver_firefox.findElement(By.id("buy-now-button")).click();
		driver_firefox.findElement(By.id("ap_email")).sendKeys("nicolaspiovan5@gmail.com");
	    driver_firefox.findElement(By.id("continue")).click();
		driver_firefox.findElement(By.id("ap_password")).sendKeys("La12esloma");
	    driver_firefox.findElement(By.id("signInSubmit")).click();
		//clear
		//driver_firefox.findElement(By.id("twotabsearchtextbox")).clear();
		//click()
		//driver_firefox.findElement(By.id("nav-hamburger-menu")).click();
		//submit() ya no es valido
		
		
		// edge
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\msedgedriver\\msedgedriver.exe");	
		//WebDriver driver_edge = new EdgeDriver();
		
		//driver_edge.get("https://www.amazon.com");
		//send keys 
		//driver_edge.findElement(By.id("twotabsearchtextbox")).sendKeys("nintendo switch");
	    //driver_edge.findElement(By.id("nav-search-submit-button")).click();
		//clear
		//driver_edge.findElement(By.id("twotabsearchtextbox")).clear();
		//click()
		//driver_edge.findElement(By.id("nav-hamburger-menu")).click();
		//submit() ya no es valido
	}

}