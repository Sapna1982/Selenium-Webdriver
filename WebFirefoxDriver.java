import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebFirefoxDriver {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\SoftwareTesting\\Driver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/");
    }
}
