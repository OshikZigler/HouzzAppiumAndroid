package PageObject;

import Utils.Base;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OnBoardingScreen extends Base {

    //OnBoardingScreen Elements
    @AndroidFindBy(id = "com.houzz.app:id/logIn")
    public AndroidElement loginButton;

    //OnBoardingScreen Methods
    public void verification(){
        commonMethods.verifyElementIsDisplayed(loginButton);
    }
    public void clickOnLogin(){
        loginButton.click();
    }


}
