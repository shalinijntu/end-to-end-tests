package pages;

import driverfactory.DriverFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Login extends BasePage{


    public void navigateToAutomationPage()
    {
//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/resources/Application/chrome.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.navigate().to("http://automationpractice.com/index.php");
        Assert.assertTrue(driver.getTitle().contains("My Store"));
    }

    public void clickOnSignIn()
    {
        driver.findElement(By.cssSelector("a.login")).click();
        Assert.assertTrue(driver.getTitle().contains("Login - My Store"));
    }

    public void registerEmail()
    {
        driver.findElement(By.id("email_create")).sendKeys("shalinijntu@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.urlContains("account-creation"));
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
    }

    public void assertCreateAccountPage()
    {
        Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains("CREATE AN ACCOUNT"));
    }

    public void signInUsernamePassword()
    {
        driver.findElement(By.id("email")).sendKeys("shalinijntu@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Password");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    public void loginAuthenticationError()
    {
        Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains("AUTHENTICATION"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='center_column']/div[1]")).getText().contains("Authentication failed"));
    }
}
