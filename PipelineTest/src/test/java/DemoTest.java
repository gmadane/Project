import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
    @Test
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=/tmp/unique-profile-" + System.currentTimeMillis());
        WebDriver driver = new ChromeDriver(options);   
        driver.get("https://www.google.com");
        //driver.quit();
    }
}
