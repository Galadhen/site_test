package testclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static org.junit.Assert.assertTrue;
import static testclass.util.checkHall;
import static testclass.util.timeout;
import static testclass.util.useChromeDriver;

public class TestSite {

    @Before
    public void launchBrowser() throws MalformedURLException {
        useChromeDriver();
    }

    @Test
    public void letsTestBataysk() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/392/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }
    @Test
    public void letsTestMayak() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/1280/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
       checkHall();
    }
    @Test
    public void letsTestSaratov() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/2086/");
        timeout(800);
        assertTrue("Today all over", $(".seance-item").exists());
        checkHall();
    }
    @Test
    public void letsTestKinopolis() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/3963/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();}
    @Test
    public void letsTestLomonosov() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/4108/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }
    @Test
    public void letsTestKirov() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/2696/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }
    @Test
    public void letsTestSovremennik() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/160/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }
    @Test
    public void letsTestMihaylovsk() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/4140/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }
    @Test
    public void letsTestJalilN() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/237/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @Test
    public void letsTestCDK() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/1643/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @Test
    public void letsTest8ka() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/2791/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @Test
    public void letsTestKinojam() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/211/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @After
    public void tearDown() throws Exception {
        closeWebDriver();
    }
}
