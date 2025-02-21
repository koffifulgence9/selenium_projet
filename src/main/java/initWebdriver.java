import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class initWebdriver {
  @Test
  public void t001_initWebdriver() {
    WebDriverManager.chromedriver().setup(); // sera initialiser en tant que firefox
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://amazon.com/");
  }

}
