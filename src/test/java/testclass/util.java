package testclass;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class util {

    /*
    public static void useChromeDriver() throws MalformedURLException{
        ChromeDriverManager.getInstance().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("no-sandbox","headless","disable-gpu");
        WebDriver browser = new ChromeDriver(options);
        Configuration.startMaximized = false;
        WebDriverRunner.setWebDriver(browser);
    }
    */

    public static void start() throws MalformedURLException {
        Configuration.browser = "chrome";
        Configuration.headless = true;
    }

    public static void timeout(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void checkHall() {
        $$(".releases-item__poster-img").get(0).click();
        $$(".seance-item").get(0).click();
        timeout(800);
        switchTo().frame("kw-iframe");
        timeout(800);
        if ($(By.className("spinner")).exists()){
            timeout(5000);
            if ($(".spinner").exists()){
                fail("Houston you have a problem");}
                else {
                assertTrue("Houston, you have a problem", !$(".payment-responce__title").exists());
            }
        }
        else {
            assertTrue("Houston, you have a problem", !$(".payment-responce__title").exists());
        }
    }
}
