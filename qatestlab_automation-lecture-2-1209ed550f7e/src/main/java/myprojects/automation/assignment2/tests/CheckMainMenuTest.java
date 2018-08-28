package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;


public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) throws InterruptedException {
       // TODO Script to check Main Menu items

        WebDriver driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.click();
        emailField.sendKeys("webinar.test@gmail.com");
        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.click();
        passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement buttonLogin = driver.findElement(By.name("submitLogin"));
        buttonLogin.click();
        
        WebElement adminDashboard = driver.findElement(By.xpath("//*[@id=\"tab-AdminDashboard\"]/a/span"));
        adminDashboard.click();
        String s1 = driver.getTitle();
        System.out.println(s1);
        driver.navigate().refresh();
        Assert.assertEquals(s1, driver.getTitle());

        WebElement orders = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentOrders\"]/a/span"));
        orders.click();
        String s2 = driver.getTitle();
        System.out.println(s2);
        driver.navigate().refresh();
        Assert.assertEquals(s2, driver.getTitle());

        WebElement catalogs = driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a/span"));
        catalogs.click();
        String s3 = driver.getTitle();
        System.out.println(s3);
        driver.navigate().refresh();
        Assert.assertEquals(s3, driver.getTitle());

        WebElement clients = driver.findElement(By.partialLinkText("Клиенты"));
        clients.click();
        String s4 = driver.getTitle();
        System.out.println(s4);
        driver.navigate().refresh();
        Assert.assertEquals(s4, driver.getTitle());

        WebElement support = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentCustomerThreads\"]/a/span"));
        support.click();
        String s5 = driver.getTitle();
        System.out.println(s5);
        driver.navigate().refresh();
        Assert.assertEquals(s5, driver.getTitle());

        WebElement statistic = driver.findElement(By.partialLinkText("Статистика"));
        statistic.click();
        String s6 = driver.getTitle();
        System.out.println(s6);
        driver.navigate().refresh();
        Assert.assertEquals(s6, driver.getTitle());

        WebElement modules = driver.findElement(By.partialLinkText("Modules"));
        modules.click();
        String s7 = driver.getTitle();
        System.out.println(s7);
        driver.navigate().refresh();
        Assert.assertEquals(s7, driver.getTitle());

        WebElement design = driver.findElement(By.partialLinkText("Design"));
        design.click();
        String s8 = driver.getTitle();
        System.out.println(s8);
        driver.navigate().refresh();
        Assert.assertEquals(s8, driver.getTitle());

        WebElement shipping  = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentShipping\"]/a/span"));
        shipping.click();
        String s9 = driver.getTitle();
        System.out.println(s9);
        driver.navigate().refresh();
        Assert.assertEquals(s9, driver.getTitle());

        WebElement payMeth  = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentPayment\"]/a/span"));
        payMeth.click();
        String s10 = driver.getTitle();
        System.out.println(s10);
        driver.navigate().refresh();
        Assert.assertEquals(s10, driver.getTitle());

        WebElement international = driver.findElement(By.xpath("//*[@id=\"subtab-AdminInternational\"]/a/span"));
        international.click();
        String s11 = driver.getTitle();
        System.out.println(s11);
        driver.navigate().refresh();
        Assert.assertEquals(s11, driver.getTitle());

        WebElement shopParam = driver.findElement(By.xpath("//*[@id=\"subtab-ShopParameters\"]/a/span"));
        shopParam.click();
        String s12 = driver.getTitle();
        System.out.println(s12);
        driver.navigate().refresh();
        Assert.assertEquals(s12, driver.getTitle());

        WebElement config = driver.findElement(By.xpath("//*[@id=\"subtab-AdminAdvancedParameters\"]/a/span"));
        config.click();
        String s13 = driver.getTitle();
        System.out.println(s13);
        driver.navigate().refresh();
        Assert.assertEquals(s13, driver.getTitle());

        driver.close();
    }
}


