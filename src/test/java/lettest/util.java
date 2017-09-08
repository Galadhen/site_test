package lettest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.MalformedURLException;

public class util {

    public static void useChromeDriver() throws MalformedURLException{
     ChromeDriverManager.getInstance().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("no-sandbox","headless","disable-gpu");
        WebDriver browser = new ChromeDriver(options);
        Configuration.startMaximized = false;
        WebDriverRunner.setWebDriver(browser);
    }

    public static void timeout(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
