package tests.yasin.US_13;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YasinPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_13_TC007 {

    /*
    Belirtilen URL' e gidilir
    Sign In butonuna tiklanir
    Kullanici bilgileri girilir
    My Account a tiklanir
    Store Manager a tiklanir
    Coupons basligina tiklanir
    Add New butonuna  tiklanir
    Code kutusuna kupon kodu yazilir
    Description kutusuna tanim yazilir
    Discount Type secilir
    Coupon Amount kutusuna miktar girilir
    Coupon expiry date kutusuna tarih girilir
    Allow free shipping kutusuna tiklanir
    Show on store kutusuna tiklanilabildigi test edilir


     */
    @Test
    public void uS_13_TC007() throws InterruptedException {

        YasinPage yasinPage = new YasinPage();
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();

        // Belirtilen URL' e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Sign In butonuna tiklanir
        yasinPage.ilkSayfaSignInButonu.click();

        yasinPage.signInUserNameBox.sendKeys("team22.12.10.2022@gmail.com");
        yasinPage.signInPasswordBox.sendKeys("*Team2215381571?");
        yasinPage.signInButonu.click();

        Assert.assertTrue(yasinPage.signOutButonu.isDisplayed());

        //My Account a tiklanir
        executor.executeScript("arguments[0].scrollIntoView(true);", yasinPage.myAccountButonu);
        executor.executeScript("arguments[0].click();", yasinPage.myAccountButonu);

        Assert.assertTrue(yasinPage.storeManagerButonu.isDisplayed());

        // Store Manager a tiklanir
        executor.executeScript("arguments[0].click();", yasinPage.storeManagerButonu);

        //Coupons basligina tiklanir
        executor.executeScript("arguments[0].click();", yasinPage.couponsButonu);

        //Add New butonuna  tiklanir
        executor.executeScript("arguments[0].click();", yasinPage.addNewButonu);

        //Code kutusuna kupon kodu yazilir
        executor.executeScript("arguments[0].click();",yasinPage.codeBox);

    }
}
