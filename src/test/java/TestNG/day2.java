package TestNG;

import org.junit.Before;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
    @Test
    public void authorizations(){
        System.out.println("hello");
    }

    @Test
    public void authorizations2(){
        System.out.println("bye");
    }

    @BeforeTest
    public void dataCleanUp(){
        System.out.println("before test");
    }

}
