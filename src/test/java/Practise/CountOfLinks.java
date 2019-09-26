package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size());
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement column = footerdriver.findElement(By.xpath("//table/tbody/tr/td/ul"));
        System.out.println(column.findElements(By.tagName("a")).size());
        for (int i=0;i < column.findElements(By.tagName("a")).size();i++){
            String clickOnlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
            column.findElements(By.tagName("a")).get(i).sendKeys(clickOnlink);

        }
        /*WebElement column = driver.findElement(By.xpath("//a[text()='Discount Coupons']/ancestor::ul"));
        System.out.println(column.findElements(By.tagName("a")));*/ /*maintainence high if text changed*/
    }
}
