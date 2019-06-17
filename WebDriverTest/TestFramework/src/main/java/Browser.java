import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
     System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
     static WebDriver driver = new ChromeDriver();

    public  static  void goTo(String url) {
        driver.get(url);
    }

    public static String title() {
        return driver.getTitle();
    }
}
