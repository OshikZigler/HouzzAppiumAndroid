import Utils.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnBoardingScreenTest extends Base {

    @BeforeTest
    public void verification(){
        onBoardingScreen.verification();
    }

    @Test
    public void clickLogin(){
        onBoardingScreen.clickOnLogin();
    }


}


