package testclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static org.junit.Assert.assertTrue;
import static testclass.util.*;

public class TestSite {

    @Before
    public void launchBrowser() throws MalformedURLException {
        start();
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

    @Test
    public void letsTestDrugba() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/6381/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @Test
    public void letsTestVatutin() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/2798/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @Test
    public void letsTestEpicentr() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/224/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @Test
    public void letsTestSmena() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/1630/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @Test
    public void letsTestSputnik() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/88/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @Test
    public void letsTestKinopolisvsev() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/1126/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @Test
    public void letsTestPervomaisk() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/6555/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

    @Test
    public void letsTestOktober() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/2677/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item").exists());
        checkHall();
    }

}
