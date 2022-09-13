import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/rgunarathn/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("John");

        driver.findElement(By.id("last-name")).sendKeys("Doe");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.xpath("//option[@value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("10/27/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN); // closes the datepicker

        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']")).click();

        driver.quit();
    }
}
