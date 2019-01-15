package PageObject;

import Utils.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OnBoardingScreen extends Base {


    //public AndroidDriver driver;

    public OnBoardingScreen(AndroidDriver driver) {
        this.driver = driver;
    }

    //OnBoardingScreen Elements
    @AndroidFindBy(id = "com.houzz.app:id/logIn")
    public AndroidElement loginButton;


    //OnBoardingScreen Methods
    public void verifyElementIsDisplayed(){
        commonMethods.verifyElementIsDisplayed(loginButton);
    }
    public void clickOnLogin(){
        loginButton.click();
    }


}
