import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebEdgeDriver {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\SoftwareTesting\\Driver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");
    }
}
