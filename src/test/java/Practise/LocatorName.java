package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("1234");
        driver.findElement(By.id("Login")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
        driver.close();
    }
}
