package curso_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class localizadores_amigables {

	public static void main(String[] args) {
		// chrome
		   System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\chromedriver\\chromedriver.exe");	
		   WebDriver driver_chrome = new ChromeDriver();
		  //abrir el navegador
		  driver_chrome.get("https://testautomationu.applitools.com/postman-tutorial/");
		  //abrir en la nav el elemento Enroll Now que está a la derecha del elemento Sign In
		  //driver_chrome.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("can-hide"))).click();
		  //abrir en la nav el elemento TAU 100 que está a la derecha del elemento Learning Paths
		  //driver_chrome.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("nav-link"))).click();
		  //abrir en el menú de chapters el chapter 1.2 que está debajo del 1.1
		  driver_chrome.findElement(RelativeLocator.with(By.tagName("a")).below(By.className("chapter-nav-link"))).click();
		
		//firefox
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\geckodriver_mozilla\\geckodriver.exe");	
		   WebDriver driver_firefox = new FirefoxDriver();
		   //abrir el navegador
		   driver_firefox.get("https://testautomationu.applitools.com/postman-tutorial/");
		   //abrir en la nav el elemento Enroll Now que está a la derecha del elemento Sign In
		   //driver_firefox.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("can-hide"))).click();
		   //abrir en la nav el elemento TAU 100 que está a la derecha del elemento Learning Paths
		   //driver_firefox.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("nav-link"))).click();
		   //abrir en el menú de chapters el chapter 1.2 que está debajo del 1.1
		   driver_firefox.findElement(RelativeLocator.with(By.tagName("a")).below(By.className("chapter-nav-link"))).click();
		   
		
		// edge
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\msedgedriver\\msedgedriver.exe");	
		   WebDriver driver_edge = new EdgeDriver();
		   //abrir el navegador
		   driver_edge.get("https://testautomationu.applitools.com/postman-tutorial/");
		   //abrir en la nav el elemento Enroll Now que está a la derecha del elemento Sign In
		   //driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("can-hide"))).click();
		   //abrir en la nav el elemento TAU 100 que está a la derecha del elemento Learning Paths
		   //driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("nav-link"))).click();
		   //abrir en el menú de chapters el chapter 1.2 que está debajo del 1.1
		   driver_edge.findElement(RelativeLocator.with(By.tagName("a")).below(By.className("chapter-nav-link"))).click();

		   
		   
		


	}

}
