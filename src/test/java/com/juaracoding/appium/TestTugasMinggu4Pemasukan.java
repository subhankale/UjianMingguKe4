package com.juaracoding.appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertEquals;

public class TestTugasMinggu4Pemasukan {
    private static AndroidDriver<MobileElement> driver;
    private TugasMinggu4Pemasukan tugasMinggu4Pemasukan;

    @BeforeClass
    private void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_3a_API_24");
        capabilities.setCapability("uuid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("appPackage", "com.chad.financialrecord");
        capabilities.setCapability("appActivity", "com.chad.financialrecord.Day20");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        tugasMinggu4Pemasukan = new TugasMinggu4Pemasukan(driver);
    }
    @Test
    public void testAddIncome() {
        tugasMinggu4Pemasukan.incomeAdd();
        System.out.println("titlePemasukan = " + tugasMinggu4Pemasukan.getTxtResult());
        assertEquals(tugasMinggu4Pemasukan.getTxtResult(), "10000000");
        System.out.println("titlePengeluaran = "+tugasMinggu4Pemasukan.getTxtResult());
        assertEquals(tugasMinggu4Pemasukan.getTxtResult(),"1000000");
        System.out.println("titleSaldo = "+tugasMinggu4Pemasukan.getTxtResult());
        assertEquals(tugasMinggu4Pemasukan.getTxtResult(),"9000000");
    }

    @AfterClass
    public void closeApp() {
        driver.quit();
    }
}
