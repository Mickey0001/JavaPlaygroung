import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverTest
{
    public static  void main(String[] args) throws Exception {
//        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
             new DesiredCapabilities("firefox", "", Platform.WINDOWS));

        driver.get("https://bing.com");

        WebElement searchField = driver.findElement(By.id("sb_form_q"));
        searchField.sendKeys("Klingon babes");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));

        WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
        imagesLink.click();

        WebElement imageElement = driver.findElements(By.className("img_cont")).get(0);
        WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
        imageLink.click();

        driver.getPageSource().contains("Something");

        driver.close();
    }
}
