package ru.gb.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        webDriver.get("https://www.saucedemo.com/");



        WebElement inputLogin = webDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        inputLogin.sendKeys("standard_user");

        WebElement inputPass = webDriver.findElement(By.id("password"));
        inputPass.sendKeys("secret_sauce");

        webDriver.findElement(By.id("login-button")).click();

        webDriver.findElement(By.id("item_2_title_link")).click();

        webDriver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();

        webDriver.findElement(By.id("shopping_cart_container")).click();
        webDriver.findElement(By.id("checkout")).click();


        WebElement inputFirstName = webDriver.findElement(By.id("first-name"));
        inputFirstName.sendKeys("First Name Test");
        WebElement inputLastName = webDriver.findElement(By.id("last-name"));
        inputLastName.sendKeys("Last Name Test");
        WebElement inputZipCode = webDriver.findElement(By.id("postal-code"));
        inputZipCode.sendKeys("Postal Code Test");

        webDriver.findElement(By.id("continue")).click();
        webDriver.findElement(By.id("finish")).click();






        Thread.sleep(5000);
        webDriver.quit();

    }
}
