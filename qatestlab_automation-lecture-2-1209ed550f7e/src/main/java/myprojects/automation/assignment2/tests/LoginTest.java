package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps

        WebDriver driver = getDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.click();
        emailField.sendKeys("webinar.test@gmail.com");
        WebElement passwordField = driver.findElement(By.id("passwd"));
        passwordField.click();
        passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement buttonLogin = driver.findElement(By.name("submitLogin"));
        buttonLogin.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement profileIcon = driver.findElement(By.xpath("//*[@id=\"employee_infos\"]/a/span/img"));
        profileIcon.click();
        WebElement buttonLogout = driver.findElement(By.id("header_logout"));
        buttonLogout.click();
        driver.close();
    }
}
