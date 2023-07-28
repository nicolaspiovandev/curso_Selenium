package curso_Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class metodos_basicos_selenium {

	public static void main(String[] args) {
		  //metodos basicos en chrome
		  System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\chromedriver\\chromedriver.exe");	
		  WebDriver driver_chrome = new ChromeDriver();
		  //metodo basico 1, get = nos abre la pagina requerida
		  driver_chrome.get("https://www.google.com");
		  //metodo basico 2, getTitle() = nos trae el titulo de la pagina actual
		  System.out.println(driver_chrome.getTitle());
		  //metodo basico 3, getCurrentUrl() = muestra la direccion actual de la pag
		  System.out.println(driver_chrome.getCurrentUrl());
		  //metodo basico 4, .close() = cierra el navegador (cierra pero queda disponible)
		  driver_chrome.close();
		  //metodo basico 5, .quit() = termina la sesion del driver (+ drástico el cierre)
		  driver_chrome.quit();
		 
		  //metodos basicos en firefox
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\geckodriver_mozilla\\geckodriver.exe");	
		  WebDriver driver_firefox = new FirefoxDriver();
		  //metodo basico 1
		  driver_firefox.get("https://www.google.com");
		  //metodo basico 2
		  System.out.println(driver_firefox.getTitle());
		  //metodo basico 3
		  System.out.println(driver_firefox.getCurrentUrl());
		  //metodo basico 4
		  driver_firefox.close();
		  //metodo basico 5
		  driver_firefox.quit();
		  
		 //metodos basicos en edge
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Nico\\eclipse-workspace\\Drivers\\msedgedriver\\msedgedriver.exe");	
		  WebDriver driver_edge = new EdgeDriver();
		  //metodo basico 1
		  driver_edge.get("https://www.google.com");
		  //metodo basico 2
		  System.out.println(driver_edge.getTitle());
		  //metodo basico 3
		  System.out.println(driver_edge.getCurrentUrl());
		  //metodo basico 4
		  driver_edge.close();
		  //metodo basico 5
		  driver_edge.quit();
	}

}
