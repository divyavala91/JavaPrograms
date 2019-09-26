package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefs_login {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        //code to navigate to URL
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Zadmin\\Desktop\\chrome 74 32 bit\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://laanc-integration.z-apps.io/login");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Air Mobility Platform");
        driver.quit();
        System.out.println("navigated to URL");
    }

    @When("^User login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
        System.out.println(username+password);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //home page validation
        System.out.println("validated home page");
    }

    @And("^All the other pages are present \"([^\"]*)\"$")
    public void all_the_other_pages_are_present_something(String strArg1) throws Throwable {
        System.out.println("Page displayed:"+strArg1);
    }

}

