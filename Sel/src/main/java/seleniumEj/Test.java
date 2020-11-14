package seleniumEj;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.out.println("Test");
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator; //Setando el path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver"); //Identificando el .exe para driver
		WebDriver driver = new ChromeDriver(); //Creacion en tiempo de ejecucion de nuestro chromedriver
		driver.get("https://www.cooltesters.com/tienda-de-cursos/mobile-automation-con-appium"); //website a accesar
	}

}
