import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
  @FindBy(xpath = "//select[@data-test='product-sort-container']")
  private WebElement filterButton;

  @FindBy(xpath = "//option[@value='lohi']")
  private WebElement filterLoHi;

  private WebDriver driver; // ✅ Déclare le driver correctement

  public ProductPage(WebDriver driver){
    this.driver = driver; // ✅ Assigne le driver
    PageFactory.initElements(driver, this);
  }

  public String getProductPageUrl(){
    return driver.getCurrentUrl(); // ✅ Maintenant, driver n'est plus null
  }

  public void setFilterLoHi(){
    filterButton.click();
    filterLoHi.click();
  }
}
