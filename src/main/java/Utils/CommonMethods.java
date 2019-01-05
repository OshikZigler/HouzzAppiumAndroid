package Utils;

import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;

import static org.junit.Assert.fail;

public class CommonMethods extends Base {

    public void verifyElementIsDisplayed(AndroidElement element) {

        try {
            Assert.assertTrue("Element is not displayed", element.isDisplayed());
        } catch (Exception e) {
            fail("Element doesn't exist," + e.getMessage());
        }


    }
}