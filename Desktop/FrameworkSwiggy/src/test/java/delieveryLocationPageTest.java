import com.qa.swiggy.pages.homePage;
import com.qa.swiggy.pages.setDelieveryLocationPage;
import com.qa.swiggy.testbase.testbase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class delieveryLocationPageTest extends testbase {

    setDelieveryLocationPage sdlp;
    homePage hp;


    @BeforeMethod
    public void setup() throws MalformedURLException {
        initialisation();
        sdlp = new setDelieveryLocationPage();
    }

    @Test
    public void testcase1() throws InterruptedException {
       hp = sdlp.grantPermisssion();

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
