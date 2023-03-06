package com.juaracoding.appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TugasMinggu4Pengeluaran {
    private AndroidDriver<MobileElement> driver;

    public TugasMinggu4Pengeluaran(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigasi naik\"]")
    private MobileElement btnTambah;
    @AndroidFindBy(id = "com.chad.financialrecord:id/btnExpense")
    private MobileElement btnPengeluaran;
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvDate")
    private  MobileElement btnDate;
    @AndroidFindBy(id = "com.chad.financialrecord:id/tvName")
    private MobileElement btnKategori;
    @AndroidFindBy(id = "com.chad.financialrecord:id/etAmount")
    private MobileElement btnJumlah;
    @AndroidFindBy(id = "com.chad.financialrecord:id/etNote")
    private MobileElement btnKeterangan;
    @AndroidFindBy(id = "com.chad.financialrecord:id/btSave")
    private MobileElement btnSave;
    @AndroidFindBy(xpath = "//*[@id=\"screenshotContainer\"]/div[2]/div/div/div/div/div[57]")
    private MobileElement titlePemasukan;
    @AndroidFindBy(xpath = "//*[@id=\"screenshotContainer\"]/div[2]/div/div/div/div/div[59]")
    private MobileElement titlePengeluaran;
    @AndroidFindBy(xpath = "//*[@id=\"screenshotContainer\"]/div[2]/div/div/div/div/div[58]")
    private MobileElement titleSaldo;



}
