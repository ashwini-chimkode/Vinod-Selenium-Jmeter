// Generated by Selenium IDE
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class GithubTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  public void github() {
    driver.get("https://github.com/");
    driver.manage().window().setSize(new Dimension(1296, 688));
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("login_field")).click();
    driver.findElement(By.id("login_field")).sendKeys("vinodkumarkammara");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Saraswathi5499@");
    driver.findElement(By.name("commit")).click();
    driver.findElement(By.cssSelector(".unread-indicator")).click();
    driver.findElement(By.cssSelector(".dropdown-signout")).click();
  }
}