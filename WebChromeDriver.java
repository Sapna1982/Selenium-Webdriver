import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebChromeDriver {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\SoftwareTesting\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
    }
}
