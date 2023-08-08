package curso_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class localizadores_tradicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// chrome
		   System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\chromedriver\\chromedriver.exe");	
		   WebDriver driver_chrome = new ChromeDriver();
		  //abrir el navegador
		  driver_chrome.get("https://www.google.com");
		  //encontrando elemento por id => textarea del buscador
		  driver_chrome.findElement(By.id("APjFqb"));
		  //encontrar el elemento por className => botón de buscar con google
		  driver_chrome.findElement(By.className("gNO89b"));
		  //encontrar el elemento por name => botón voy a tener suerte
		  driver_chrome.findElement(By.name("btnI"));
		  //encontrar el elemento por linktext del nombre => Sobre google
		  driver_chrome.findElement(By.linkText("Sobre Google"));
		  //encontrar el elemento por linktext parcial del nombre => Sobre google
		  driver_chrome.findElement(By.partialLinkText("Sobre"));
		  //encontrar el elemento por Xpath => Condiciones
		  driver_chrome.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[3]/a[2]"));
		  //cerrar el navegador y la sesion
		  driver_chrome.quit();
		  
		// firefox
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\geckodriver_mozilla\\geckodriver.exe");	
		   WebDriver driver_firefox = new FirefoxDriver();
		   //abrir el navegador
		   driver_firefox.get("https://www.google.com");
		   //encontrando elemento por id => textarea del buscador
		   driver_firefox.findElement(By.id("APjFqb"));
		   //encontrar el elemento por className => botón de buscar con google
		   driver_firefox.findElement(By.className("gNO89b"));
		   //encontrar el elemento por name => botón voy a tener suerte
		   driver_firefox.findElement(By.name("btnI"));
		   //encontrar el elemento por linktext del nombre => Sobre google
		   driver_firefox.findElement(By.linkText("Sobre Google"));
		   //encontrar el elemento por linktext parcial del nombre => Sobre google
		   driver_firefox.findElement(By.partialLinkText("Sobre"));
		   //encontrar el elemento por Xpath => Condiciones
		   driver_firefox.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[3]/a[2]"));
		   //cerrar el navegador y la sesion
		   driver_firefox.quit();		   
		
		// edge
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\msedgedriver\\msedgedriver.exe");	
		   WebDriver driver_edge = new EdgeDriver();
		   //abrir el navegador
		   driver_edge.get("https://www.google.com");
		   //encontrando elemento por id => textarea del buscador
		   driver_edge.findElement(By.id("APjFqb"));
		   //encontrar el elemento por className => botón de buscar con google
		   driver_edge.findElement(By.className("gNO89b"));
		   //encontrar el elemento por name => botón voy a tener suerte
		   driver_edge.findElement(By.name("btnI"));
		   //encontrar el elemento por linktext del nombre => Sobre google
		   driver_edge.findElement(By.linkText("Sobre Google"));
		   //encontrar el elemento por linktext parcial del nombre => Sobre google
		   driver_edge.findElement(By.partialLinkText("Sobre"));
		   //encontrar el elemento por Xpath => Condiciones
		   driver_edge.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[3]/a[2]"));
		   //cerrar el navegador y la sesion
		   driver_edge.quit();

	}

}
