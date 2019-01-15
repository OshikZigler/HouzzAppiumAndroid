package Utils;

import PageObject.OnBoardingScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class Base {

    public static AndroidDriver driver;
    public static OnBoardingScreen onBoardingScreen;
    public static CommonMethods commonMethods = new CommonMethods();


    public static String readProperty(String property) {

        Properties properties;
        String value = null;

        try {
            properties = new Properties();
            properties.load(new FileInputStream(new File("/Users/oshikzigler/Automation/HouzzAppiumAndroid/config")));

            value = properties.getProperty(property);

            if (value == null) {
                throw new Exception(("value not set or empty"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return value;
    }

    //Setting Android driver with desired capabilities from config file

    public static AndroidDriver setDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        String completeURL = "http://" + Base.readProperty("run.ip") + ":" + Base.readProperty("run.port") + "/wd/hub";

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, Base.readProperty("device.android.version"));
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Base.readProperty("device.android.name"));
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability(MobileCapabilityType.APP, new File(Base.readProperty("app.android.path")).getAbsolutePath());
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, Base.readProperty("app.package"));
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, Base.readProperty("app.activity"));

          driver = new AndroidDriver(new URL(completeURL), capabilities);

        return driver;
    }



}
