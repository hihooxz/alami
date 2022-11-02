import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/rikykhoerul/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");

        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();

        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("hp elite desktop pc", Keys.ENTER);

        driver.findElement(By.linkText("HP Elite Desktop PC Computer Intel Core i5 3.1-GHz, 8 gb Ram, 1 TB Hard Drive, DVDRW, 19 Inch LCD Monitor, Keyboard, Mouse, Wireless WiFi, Windows 10 (Renewed)")).click();

        driver.findElement(By.cssSelector("input#add-to-cart-button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span#attach-sidesheet-view-cart-button  .a-button-input")));

        driver.findElement(By.cssSelector("span#attach-sidesheet-view-cart-button  .a-button-input")).click();

        driver.findElement(By.cssSelector(".sc-action-delete .a-color-link")).click();
    }
}