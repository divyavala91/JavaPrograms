package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenURL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total links:"+links.size());
        for(int i=0;i<links.size();i++){
            WebElement ele = links.get(i);
            String url = ele.getAttribute("href");
            verifyLink(url);
        }
    }

    private static void verifyLink(String url) {
        try{
            URL linkurl = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) linkurl.openConnection();
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.connect();
            if(httpURLConnection.getResponseCode()==200){
                System.out.println(httpURLConnection.getResponseMessage());

            }
            if(httpURLConnection.getResponseCode()==401){
                System.out.println(httpURLConnection.getResponseMessage());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
