import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver_121.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/v1/index.html");
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector(".btn_action")).click();
        driver.findElement(By.cssSelector(".inventory_list>:nth-child(4) button")).click();
        driver.findElement(By.cssSelector("[data-icon='shopping-cart']")).click();
        driver.findElement(By.xpath("checkout_button")).click();
        driver.quit();
    }
}
