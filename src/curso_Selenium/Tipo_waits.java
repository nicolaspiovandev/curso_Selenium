package curso_Selenium;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.edge.EdgeDriver;

public class Tipo_waits {

	public static void main(String[] args) {
		// chrome
		   System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\chromedriver\\chromedriver.exe");	
		   WebDriver driver_chrome = new ChromeDriver();

		   //Implicit wait (tiempo de espera implícito, pausa hasta que se encuentre X elemento)
		   //driver_chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   //driver_chrome.get("https://testautomationu.applitools.com/postman-tutorial/");
		   //driver_chrome.findElement(By.className("powered-by"));
		   
		   //Explicit wait + recomendado (tiempo de espera explícito, tiene que esperar ese tiempo para buscar el elemento si lo encuentra te lo muestra y sino te lo muestra)
		   //driver_chrome.get("https://www.bing.com/?toWww=1&redig=0992DC3E9EC94F94A22F8F409294CC31");
		   //WebElement image = driver_chrome.findElement(By.id("sb_form_q"));
		   //Wait<WebDriver> wait = new WebDriverWait(driver_chrome, Duration.ofSeconds(10));
		   //wait.until(imageshow -> image.isDisplayed());
		   //driver_chrome.findElement(By.id("sb_form_q")).sendKeys("boca juniors");
		   
		   //Fluent wait (ciclo con parametros hasta que esté disponible el elemento)
//		   driver_chrome.get("https://www.bing.com/?toWww=1&redig=0992DC3E9EC94F94A22F8F409294CC31");
//		   WebElement image = driver_chrome.findElement(By.id("sb_form_q"));
//		   Wait<WebDriver> wait = new FluentWait<>(driver_chrome)
//				   .withTimeout(Duration.ofSeconds(2))
//				   .pollingEvery(Duration.ofMillis(300))
//				   .ignoring(ElementNotInteractableException.class);
//		   wait.until(d->{
//			   image.sendKeys("boca juniors");
//			   return true;
//		   });
		   
		//firefox
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\geckodriver_mozilla\\geckodriver.exe");	
		   WebDriver driver_firefox = new FirefoxDriver();
		   
		   //Implicit wait (tiempo de espera implícito, pausa hasta que se encuentre X elemento)
		   //driver_firefox.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   //driver_firefox.get("https://testautomationu.applitools.com/postman-tutorial/");
		   //driver_firefox.findElement(By.className("powered-by"));
		   
		   //Explicit wait + recomendado (tiempo de espera explícito, tiene que esperar ese tiempo para buscar el elemento si lo encuentra te lo muestra y sino te lo muestra)
		   driver_firefox.get("https://www.bing.com/?toWww=1&redig=0992DC3E9EC94F94A22F8F409294CC31");
		   WebElement image = driver_firefox.findElement(By.id("sb_form_q"));
		   Wait<WebDriver> wait = new WebDriverWait(driver_firefox, Duration.ofSeconds(10));
		   wait.until(imageshow -> image.isDisplayed());
		   driver_firefox.findElement(By.id("sb_form_q")).sendKeys("boca juniors");
		   
		   //Fluent wait (ciclo con parametros hasta que esté disponible el elemento)
//		   driver_firefox.get("https://www.bing.com/?toWww=1&redig=0992DC3E9EC94F94A22F8F409294CC31");
//		   WebElement image = driver_firefox.findElement(By.id("sb_form_q"));
//		   Wait<WebDriver> wait = new FluentWait<>(driver_firefox)
//				   .withTimeout(Duration.ofSeconds(2))
//				   .pollingEvery(Duration.ofMillis(300))
//				   .ignoring(ElementNotInteractableException.class);
//		   wait.until(d->{
//			   image.sendKeys("boca juniors");
//			   return true;
//		   });
		
		// edge
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\msedgedriver\\msedgedriver.exe");	
		   WebDriver driver_edge = new EdgeDriver();
		   
		   //Implicit wait (tiempo de espera implícito, pausa hasta que se encuentre X elemento)
		   //driver_edge.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   //driver_edge.get("https://testautomationu.applitools.com/postman-tutorial/");
		   //driver_edge.findElement(By.className("powered-by"));
		   
		   //Explicit wait + recomendado (tiempo de espera explícito, tiene que esperar ese tiempo para buscar el elemento si lo encuentra te lo muestra y sino te lo muestra)
		   //driver_edge.get("https://www.bing.com/?toWww=1&redig=0992DC3E9EC94F94A22F8F409294CC31");
		   //WebElement image = driver_edge.findElement(By.id("sb_form_q"));
		   //Wait<WebDriver> wait = new WebDriverWait(driver_edge, Duration.ofSeconds(10));
		   //wait.until(imageshow -> image.isDisplayed());
		   //driver_edge.findElement(By.id("sb_form_q")).sendKeys("boca juniors");
		   
		   //Fluent wait (ciclo con parametros hasta que esté disponible el elemento)
//		   driver_edge.get("https://www.bing.com/?toWww=1&redig=0992DC3E9EC94F94A22F8F409294CC31");
//		   WebElement image = driver_edge.findElement(By.id("sb_form_q"));
//		   Wait<WebDriver> wait = new FluentWait<>(driver_edge)
//				   .withTimeout(Duration.ofSeconds(2))
//				   .pollingEvery(Duration.ofMillis(300))
//				   .ignoring(ElementNotInteractableException.class);
//		   wait.until(d->{
//			   image.sendKeys("boca juniors");
//			   return true;
//		   });
				   

		   
	}

}
