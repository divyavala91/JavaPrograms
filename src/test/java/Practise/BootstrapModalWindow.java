package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapModalWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.goibibo.com");
        driver.findElement(By.xpath("//a[text()='Sign up']")).click();
        driver.switchTo().frame("authiframe");
        driver.findElement(By.id("authMobile")).sendKeys("divya");
    }
}
