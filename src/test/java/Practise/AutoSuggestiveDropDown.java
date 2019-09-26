package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.id("fromCity")).click();
        WebElement dropdownFrom = driver.findElement(By.xpath("//input[@placeholder='From']"));
        dropdownFrom.clear();
        dropdownFrom.sendKeys("MUM");
        Thread.sleep(1000);
        dropdownFrom.sendKeys(Keys.ARROW_DOWN);
        dropdownFrom.sendKeys(Keys.ENTER);
        /*driver.findElement(By.id("toCity")).click();*/
        WebElement dropdownTo = driver.findElement(By.xpath("//input[@placeholder='To']"));
        dropdownTo.clear();
        dropdownTo.sendKeys("DEL");
        Thread.sleep(1000);
        dropdownTo.sendKeys(Keys.ARROW_DOWN);
        dropdownTo.sendKeys(Keys.ENTER);


    }
}
