package lettest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static lettest.util.timeout;
import static lettest.util.useChromeDriver;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class tttest {
    @Before
    public void launchBrowser() throws MalformedURLException{
        useChromeDriver();
    }

    @Test
    public void letsTestDemo() throws MalformedURLException {
            open("https://kinowidget.kinoplan.ru/1803/");
            assertTrue("Today all over",$(".seance-item").exists());
            $$(".seance-item").get(0).click();
            assertFalse("Houston, you have a problem", $(".payment-responce__title").exists());
        }
    @Test
    public void letsTestBataysk() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/392/");
        assertTrue("Today all over",$(".seance-item").exists());
        $$(".seance-item").get(0).click();
        assertFalse("Houston, you have a problem", $(".payment-responce__title").exists());
    }
    @Test
    public void letsTestMayak() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/1280/");
        assertTrue("Today all over",$(".seance-item").exists());
        $$(".seance-item").get(0).click();
        assertFalse("Houston, you have a problem", $(".payment-responce__title").exists());
    }
    @Test
    public void letsTestSaratov() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/2086/");
        assertTrue("Today all over",$(".seance-item").exists());
        $$(".seance-item").get(0).click();
        assertFalse("Houston, you have a problem", $(".payment-responce__title").exists());
    }
    @Test
    public void letsTestKinopolis() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/3963/");
        assertTrue("Today all over",$(".seance-item").exists());
        $$(".seance-item").get(0).click();
        assertFalse("Houston, you have a problem", $(".payment-responce__title").exists());
    }
    @Test
    public void letsTestLomonosov() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/4108/");
        assertTrue("Today all over",$(".seance-item").exists());
        $$(".seance-item").get(0).click();
        assertFalse("Houston, you have a problem", $(".payment-responce__title").exists());
    }
    @Test
    public void letsTestKirov() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/2696/");
        assertTrue("Today all over",$(".seance-item").exists());
        $$(".seance-item").get(0).click();
        assertFalse("Houston, you have a problem", $(".payment-responce__title").exists());
    }
    @Test
    public void letsTestSovremennik() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/160/");
        assertTrue("Today all over",$(".seance-item").exists());
        $$(".seance-item").get(0).click();
        assertFalse("Houston, you have a problem", $(".payment-responce__title").exists());
    }
    @Test
    public void letsTestMihaylovsk() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/4140/");
        assertTrue("Today all over",$(".seance-item").exists());
        $$(".seance-item").get(0).click();
        assertFalse("Houston, you have a problem", $(".payment-responce__title").exists());
    }
    @Test
    public void letsTestJalilN() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/237/");
        assertTrue("Today all over",$(".seance-item").exists());
        $$(".seance-item").get(0).click();
        assertFalse("Houston, you have a problem", $(".payment-responce__title").exists());
    }

    @After
    public void tearDown() throws Exception {
        getWebDriver().quit();
        closeWebDriver();
    }
}
