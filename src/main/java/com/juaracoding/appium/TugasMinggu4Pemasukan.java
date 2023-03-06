package com.juaracoding.appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TugasMinggu4Pemasukan {
    private AndroidDriver<MobileElement> driver;

    public TugasMinggu4Pemasukan(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigasi naik\"]")
    private MobileElement btnTambah;
    @AndroidFindBy(id = "com.chad.financialrecord:id/btnIncome")
    private MobileElement btnPemasukan;
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

    private void incomeAdd(){
        btnTambah.click();
        btnPemasukan.click();
        btnDate.click();
        btnJumlah.click();
        btnKategori.click();
        btnKeterangan.click();
        btnSave.click();
    }
    public String getTxtResult() {
        return titlePemasukan.getAttribute("Pemasukan");
        return titlePengeluaran.getAttribute("Pebgeluaran");
        return titleSaldo.getAttribute("Saldo");
    }



}
