package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://www.facebook.com");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
        driver.findElement(By.cssSelector("[id='pass']")).sendKeys("200");*/
        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
        driver.findElement(By.cssSelector("input#password")).sendKeys("1234");
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
        driver.close();
    }
}
