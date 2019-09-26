package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StaticDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        WebElement dropdown = driver.findElement(By.cssSelector("select[name='country']"));
        Select s = new Select(dropdown);//select has has capability of identifying web element
        List<WebElement> allopt = s.getOptions();
        for(int i=0;i<allopt.size();i++){
            if(allopt.get(i).getText().equalsIgnoreCase("AMERICAN SAMOA")){
                System.out.println("Country found");
            }
        }
        s.selectByValue("AMERICAN SAMOA");
        s.selectByIndex(6);
        s.selectByVisibleText("ARUBA");
    }
}
