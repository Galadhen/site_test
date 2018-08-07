package testclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static testclass.util.*;

public class TestSite {

    @Before
    public void launchBrowser() throws MalformedURLException {
        start();
    }

    @Test
    public void letsTestBataysk() throws MalformedURLException {
        open("http://xn----mtbcbbldaudgf3r.xn--p1ai/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }
    @Test
    public void letsTestMayak() throws MalformedURLException {
        open("http://kino-mayak.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
       checkHall();
    }
    @Test
    public void letsTestSaratov() throws MalformedURLException {
        open("http://domkinosar.ru/");
        timeout(2000);
        assertTrue("Today all over", $(".seance-item__overlay").exists());
        checkHall();
    }
    @Test
    public void letsTestKinopolis() throws MalformedURLException {
        open("http://orbita.kinopolis-film.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();}
    @Test
    public void letsTestLomonosov() throws MalformedURLException {
        open("http://kinolomonosov.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }
    @Test
    public void letsTestKirov() throws MalformedURLException {
        open("http://kinokirov40.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }
    @Test
    public void letsTestSovremennik() throws MalformedURLException {
        open("http://kino-sovremennik.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }
    @Test
    public void letsTestMihaylovsk() throws MalformedURLException {
        open("http://kinorossia.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }
    @Test
    public void letsTestJalilN() throws MalformedURLException {
        open("http://jalil-nk.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestCDK() throws MalformedURLException {
        open("https://kinowidget.kinoplan.ru/1643/");
        timeout(1000);
        assertTrue("Today all over",$(".seance-item").exists());
        $$(".seance-item").get(0).click();
        timeout(1000);
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

    @Test
    public void letsTest8ka() throws MalformedURLException {
        open("http://xn--8-8sb3a.xn--p1ai/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestKinojam() throws MalformedURLException {
        open("https://kinojam.club/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestDrugba() throws MalformedURLException {
        open("http://xn--80abiiilwit4a.xn--p1ai/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestVatutin() throws MalformedURLException {
        open("http://xn----7sbfzbdhce0al6c.xn--p1ai/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestEpicentr() throws MalformedURLException {
        open("http://epicentr.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestSmena() throws MalformedURLException {
        open("http://smena-luga.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestSputnik() throws MalformedURLException {
        open("http://afishakinosputnik.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestKinopolisvsev() throws MalformedURLException {
        open("http://vsev.kinopolis-film.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestPervomaisk() throws MalformedURLException {
        open("http://1maykino.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestOktober() throws MalformedURLException {
        open("http://dk-oktober.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestGreenvich() throws MalformedURLException {
        open("http://xn----ctbcubbnufkn2g.xn--p1ai/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestRumba() throws MalformedURLException {
        open("http://rumba.kinopolis-film.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestGorizont() throws MalformedURLException {
        open("https://gorizontcinema.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestKubus() throws MalformedURLException {
        open("http://kubus.kinopolis-film.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestTerrikon() throws MalformedURLException {
        open("http://terrikon-kino.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestFregat() throws MalformedURLException {
        open("http://fregatkino.ru/");
        timeout(1000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestSibir() throws MalformedURLException {
        open("http://sibirkino.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestPrada3D() throws MalformedURLException {
        open("http://prada3d.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestPremierKinopark() throws MalformedURLException {
        open("http://xn--80apfcnghj.com/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestSkyCinema() throws MalformedURLException {
        open("http://skycinemapilot.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }

    @Test
    public void letsTestKosmos() throws MalformedURLException {
        open("http://kosmoskan.ru/");
        timeout(2000);
        assertTrue("Today all over",$(".seance-item__overlay").exists());
        checkHall();
    }
}
