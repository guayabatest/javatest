package org.testprime;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.time.Duration;

public class NuevoCaso {
    public static void main(String[] arg) {
        System.setProperty("webdriver.chrome.driver", "/Users/macbellita/java_selenium/test_one/src/drivers/chromedriver");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        try {
            Thread.sleep(3000); // Espera 3 segundos para ver la página antes de continuar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Título: " + driver.getTitle());
        driver.quit();
    }
}
