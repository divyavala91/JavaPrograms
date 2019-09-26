package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class fluentWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.cssSelector("[id='start'] button")).click();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
                withTimeout(10, TimeUnit.SECONDS).
                pollingEvery(2,TimeUnit.SECONDS).
                ignoring(NoSuchElementException.class);
        WebElement fw = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver){
                if(driver.findElement(By.cssSelector("[id=finish] h4")).isDisplayed()){
                 return   driver.findElement(By.cssSelector("[id=finish] h4"));
                }
                return null;
            }
        });

        }


}
