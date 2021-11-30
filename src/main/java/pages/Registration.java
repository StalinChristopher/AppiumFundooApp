package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class Registration extends Base {
    public Registration() throws MalformedURLException {
    }

    public void registrationTest() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bl.todo:id/loginRegister")));
        WebElement registerPageButton = driver.findElement(By.id("com.bl.todo:id/loginRegister"));
        registerPageButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.bl.todo:id/signupUsername")));

        WebElement userName = driver.findElement(By.id("com.bl.todo:id/signupUsername"));
        WebElement email = driver.findElement(By.id("com.bl.todo:id/signupEmail"));
        WebElement phone = driver.findElement(By.id("com.bl.todo:id/signupMobile"));
        WebElement password = driver.findElement(By.id("com.bl.todo:id/signupPassword"));
        WebElement confirmPassword = driver.findElement(By.id("com.bl.todo:id/signupConfirmPassword"));
        WebElement submitButton = driver.findElement(By.id("com.bl.todo:id/signupSubmit"));

        //valid registration
        userName.sendKeys("test99");
        email.sendKeys("test99@gmail.com");
        phone.sendKeys("9874563210");
        password.sendKeys("test99test99");
        confirmPassword.sendKeys("test99test99");
        submitButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"open\"]")));
        WebElement navDrawerButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"open\"]"));
        navDrawerButton.click();
        WebElement logOut = driver.findElement(By.id("com.bl.todo:id/nav_logout_item"));
        logOut.click();

        registerPageButton.click();
        userName.sendKeys("test99");
        email.sendKeys("test99@gmail.com");
        phone.sendKeys("9874563210");
        password.sendKeys("test99test99");
        confirmPassword.sendKeys("test99test99");
        submitButton.click();




    }
}
