package Practise;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.cssSelector("input[value='option1']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
        driver.findElement(By.cssSelector("input[value='option1']")).click();
        Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
        int countofCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
    }
}
