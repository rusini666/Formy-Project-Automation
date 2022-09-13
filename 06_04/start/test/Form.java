import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/rgunarathn/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage.submitForm(driver);

        ConfirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", ConfirmationPage.getAlertBannerText(driver));

        driver.quit();
    }


}
