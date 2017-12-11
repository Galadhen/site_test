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
        open("http://xn----mtbcbbldaudgf3r.xn--p1ai/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }
    @Test
    public void letsTestMayak() throws MalformedURLException {
        open("http://kino-mayak.ru/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
       checkHall();
    }
    @Test
    public void letsTestSaratov() throws MalformedURLException {
        open("http://domkinosar.ru/");
        timeout(800);
        assertTrue("Today all over", $(".seance-item.time-tooltip").exists());
        checkHall();
    }
    @Test
    public void letsTestKinopolis() throws MalformedURLException {
        open("http://orbita.kinopolis-film.ru/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();}
    @Test
    public void letsTestLomonosov() throws MalformedURLException {
        open("http://kinolomonosov.ru/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }
    @Test
    public void letsTestKirov() throws MalformedURLException {
        open("http://kinokirov40.ru/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }
    @Test
    public void letsTestSovremennik() throws MalformedURLException {
        open("http://kino-sovremennik.ru/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }
    @Test
    public void letsTestMihaylovsk() throws MalformedURLException {
        open("http://kinorossia.ru/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }
    @Test
    public void letsTestJalilN() throws MalformedURLException {
        open("http://jalil-nk.ru/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }

    @Test
    public void letsTestCDK() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/1643/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }

    @Test
    public void letsTest8ka() throws MalformedURLException {
        open("http://xn--8-8sb3a.xn--p1ai/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }

    @Test
    public void letsTestKinojam() throws MalformedURLException {
        open("https://kinojam.club/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }

    @Test
    public void letsTestDrugba() throws MalformedURLException {
        open("http://xn--80abiiilwit4a.xn--p1ai/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }

    @Test
    public void letsTestKinomirSokol() throws MalformedURLException {
        open("http://kinomirsokol35.ru/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }

    @Test
    public void letsTestVatutin() throws MalformedURLException {
        open("http://xn----7sbfzbdhce0al6c.xn--p1ai/");
        timeout(800);
        assertTrue("Today all over",$(".seance-item.time-tooltip").exists());
        checkHall();
    }

    @After
    public void tearDown() throws Exception {
        closeWebDriver();
    }
}
