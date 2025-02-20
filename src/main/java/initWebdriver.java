import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.junit.Test;

public class initWebdriver {

  @Test

  public void t001_initWebdriver() {
    WebDriverManager.firefoxdriver().setup();

  }
}
