package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UVBLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://integration-ui.z-apps.io/airspace");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,5);
        if(driver.findElements(By.xpath("(//header[@id='fuse-toolbar']//button)[2]")).size()>0){
             driver.findElement(By.xpath("(//header[@id='fuse-toolbar']//button)[2]")).click();
            if(driver.findElements(By.xpath("//a[@href='/login']")).size()>0){
                driver.findElement(By.xpath("//a[@href='/login']")).click();
            }
        }
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("advop");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Password123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.xpath("//span[text()='Authorizations']")).click();
        driver.findElement(By.xpath("//span[text()='ADD AUTHORIZATION']")).click();
        driver.findElement(By.cssSelector("#basicInfoName")).sendKeys("DemoAuthorization");
        driver.findElement(By.xpath("//form[@id='basicInfoForm']/div/div[2]/div[1]/div/input")).click();
        driver.findElement(By.xpath("(//div[@role='tablist'])[2]/descendant::div/button[1]")).click();
        while(!driver.findElement(By.xpath("//button[@type='button']/following-sibling::div/p")).getText().equalsIgnoreCase("July")){

        }
        int count = driver.findElements(By.xpath("//div[@role='presentation']/button/span[1]")).size();
        for(int i=0;i<count;i++){
            String text = driver.findElements(By.xpath("//div[@role='presentation']/button/span[1]")).get(i).getText();
            if(text.equalsIgnoreCase("26")){
                driver.findElements(By.xpath("//div[@role='presentation']/button/span[1]")).get(i).click();
            }
        }


    }
}
