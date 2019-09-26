package Practise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct URL
        System.out.println(driver.getTitle());//validate if page title is correct
        driver.navigate().to("https://www.yahoo.com");
        WebElement ele = null;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele);

        driver.navigate().back();
        driver.close();

    }
}
