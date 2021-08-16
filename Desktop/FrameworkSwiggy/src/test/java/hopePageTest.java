import com.qa.swiggy.pages.homePage;
import com.qa.swiggy.pages.setDelieveryLocationPage;
import com.qa.swiggy.testbase.testbase;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class hopePageTest extends testbase {

    setDelieveryLocationPage sdlp;
    homePage hp;


    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException {
        initialisation();
        sdlp = new setDelieveryLocationPage();
        hp = new homePage();
        sdlp.grantPermisssion();
    }

    @Test
    public void testcase1(){
       boolean isenabled = hp.selectingRestaurant();
        System.out.println(isenabled);
        Assert.assertTrue(isenabled);
    }
    @Test
    public void testcase2(){
       boolean isdispalyed =  hp.selectingInstamart();
       Assert.assertTrue(isdispalyed);
    }
    @Test
    public void testcase3(){
        hp.selectingGenie();
    }
    @Test
    public void testcase4(){
       boolean isdisplayed = hp.selectingMeat();
       Assert.assertTrue(isdisplayed);
    }
    @Test
    public void testcase5(){
        boolean isdisplayed = hp.selectingHealthhub();
        Assert.assertTrue(isdisplayed);
    }
    @Test
    public void testcase6() {
        boolean isdisplayed = hp.selectingGourmet();
        Assert.assertTrue(isdisplayed);
    }
    @Test
    public void testcase7() {
        boolean isdisplayed = hp.selectingCarecorner();
        Assert.assertTrue(isdisplayed);
    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
