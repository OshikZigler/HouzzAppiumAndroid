import PageObject.OnBoardingScreen;
import Utils.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class OnBoardingScreenTest extends Base {

    //Starting Appium driver + initializing AndroidElement
    @BeforeSuite
    public void createSession() throws MalformedURLException {
        setDriver();
    }

    @BeforeClass
    public void initElements() {
        onBoardingScreen = PageFactory.initElements(driver , OnBoardingScreen.class);
    }

    @BeforeTest
    public void elementVerification(){
        onBoardingScreen.verifyElementIsDisplayed();
    }

    @Test
    public void clickLogin(){
        onBoardingScreen.clickOnLogin();
    }


}


