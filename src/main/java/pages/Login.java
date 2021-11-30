package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;

public class Login extends Base {

    public Login() throws MalformedURLException {
    }

    public void loginOperations() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bl.todo:id/loginEmail")));
        WebElement userName = driver.findElement(By.id("com.bl.todo:id/loginEmail"));
        WebElement password = driver.findElement(By.id("com.bl.todo:id/loginPassword"));
        WebElement loginButton = driver.findElement(By.id("com.bl.todo:id/loginSubmit"));

        //valid credentials
        userName.sendKeys("test14@gmail.com");
        password.sendKeys("1234567");
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"open\"]")));
        WebElement navDrawerButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"open\"]"));
        navDrawerButton.click();
        WebElement logOut = driver.findElement(By.id("com.bl.todo:id/nav_logout_item"));
        logOut.click();

        //Invalid credentials
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bl.todo:id/loginEmail")));
        userName.sendKeys("test20@gmail.com");
        password.sendKeys("sampleTestCase");
        loginButton.click();
    }

//    public static void main(String args[]) throws MalformedURLException, InterruptedException {
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("deviceName", "emulator-5554");
//        cap.setCapability("platformName", "Android");
//        cap.setCapability("platformVersion", "8.0");
//        cap.setCapability("appPackage","com.bl.todo");
//        cap.setCapability("appActivity", "com.bl.todo.ui.MainActivity");
//
//        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
//        System.out.println("Device time"+driver.getDeviceTime());
//        System.out.println("Fundoo application launched");
//
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bl.todo:id/loginEmail")));
//        WebElement userName = driver.findElement(By.id("com.bl.todo:id/loginEmail"));
//        WebElement password = driver.findElement(By.id("com.bl.todo:id/loginPassword"));
//        WebElement loginButton = driver.findElement(By.id("com.bl.todo:id/loginSubmit"));
//
//
//        //valid credentials
//        userName.sendKeys("test14@gmail.com");
//        password.sendKeys("1234567");
//        loginButton.click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"open\"]")));
//        WebElement navDrawerButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"open\"]"));
//        navDrawerButton.click();
//        WebElement logOut = driver.findElement(By.id("com.bl.todo:id/nav_logout_item"));
//        logOut.click();
//
//
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bl.todo:id/loginEmail")));
////        userName.sendKeys("test20@gmail.com");
////        password.sendKeys("1234567");
////        loginButton.click();
//    }

}
