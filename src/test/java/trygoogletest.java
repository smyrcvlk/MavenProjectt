import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class trygoogletest {
        private WebDriver driver;
        private WebDriverWait wait;

        @BeforeTest
        public void setup() {
            // write your code here
            System.setProperty("webdriver.chrome.driver", "/Users/sumeyracivelek/Selenium/ChromeDriver/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, 5);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        }
        @Test
        public void testing(){
            driver.get("https://www.google.com/");
        }

        @AfterTest
        public void quit(){
         driver.quit();
        }
    }


