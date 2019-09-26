package Practise;

import cucumber.api.java.nl.Stel;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TableColumsSorting {
    public static void main(String[] args) {
        //retrieve all values of veg fruit name column, push to arraylist1
        //create another arraylist2 = sort, print
        //compare arraylist1 =  arraylist2

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        List<WebElement> products = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
        ArrayList<String> originalProduct = new ArrayList<String>();
        for(int i=0;i<products.size();i++){
            originalProduct.add(products.get(i).getText());
        }
        System.out.println(originalProduct);
        ArrayList<String> copyProduct = new ArrayList<String>();

        for(int i=0;i<originalProduct.size();i++){
            copyProduct.add(originalProduct.get(i));
        }

        Collections.sort(copyProduct);

        Assert.assertTrue(originalProduct.equals(copyProduct));

    }
}
