package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesReusablefunction {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fantasycricket.dream11.com/IN");
        int number = findFrameNumber(driver,By.xpath(""));
        driver.switchTo().frame(number);
        driver.findElement(By.xpath("")).click();
        driver.switchTo().defaultContent();


    }

    public static int findFrameNumber(WebDriver driver, By by){
        int frameCount = driver.findElements(By.tagName("iframe")).size();
        int frameNumber ;
        for(frameNumber =0;frameNumber<frameCount;frameNumber++){
            driver.switchTo().frame(frameNumber);
           if(driver.findElements(by).size()>0){
               driver.findElement(by).click();
               break;
           }else{
               System.out.println("continue");
           }
        }

        return frameNumber;
    }



}
