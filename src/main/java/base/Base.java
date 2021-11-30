package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public DesiredCapabilities cap;
    public AndroidDriver driver;
    public WebDriverWait wait;

    public Base() throws MalformedURLException {
    }

    public void setUp() throws MalformedURLException {
        cap = new DesiredCapabilities();
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        wait = new WebDriverWait(driver,20);
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "8.0");
        cap.setCapability("appPackage","com.bl.todo");
        cap.setCapability("appActivity", "com.bl.todo.ui.MainActivity");
    }
}
