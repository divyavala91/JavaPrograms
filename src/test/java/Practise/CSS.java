package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.cssSelector("[id='username']")).sendKeys("fsd");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("5454");
        driver.findElement(By.cssSelector("input#Login")).click();
    }
}
