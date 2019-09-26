package Practise;

import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.cssSelector("a[value='JAI']")).click();
        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=0;i<3;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        WebElement dropdown = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
        Select s = new Select(dropdown);
        s.selectByValue("USD");
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();



    }
}
