package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
        for(int i=0;i<count;i++){
            System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
            if(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value").equals("Milk")){
                driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
            }
        }
    }
}
