package com.qa.swiggy.pages;

import com.qa.swiggy.testbase.testbase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class setDelieveryLocationPage extends testbase {

    @FindBy(xpath = "//android.widget.TextView[@text = 'GRANT']")
    MobileElement locationPermissison;

    @FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    MobileElement allowPermission;

    @FindBy(xpath = "//android.widget.TextView[@text = 'CONFIRM LOCATION']")
    MobileElement morePermission;

    @FindBy(id = "in.swiggy.android:id/turn_on_textview")
    MobileElement evenMorePermission;

    public setDelieveryLocationPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public homePage grantPermisssion() throws InterruptedException {
        locationPermissison.click();
        allowPermission.click();
        Thread.sleep(5000);
        morePermission.click();
        evenMorePermission.click();
        Thread.sleep(5000);
        return new homePage();

    }

}

