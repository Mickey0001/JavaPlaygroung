import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverCheckboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Mirza/IdeaProjects/WebDriverTest/src/main/webapp/CheckboxTest.html");


        WebElement checkbox = driver.findElement(By.id("mayoCheck"));
        checkbox.click();
    }
}
