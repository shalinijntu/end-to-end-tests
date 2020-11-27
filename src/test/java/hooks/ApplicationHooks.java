package hooks;

import driverfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static pages.BasePage.driver;

import java.util.concurrent.TimeUnit;

public class ApplicationHooks {


    @Before
    public void SetUp(){
        driver = new DriverFactory().create();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @After
    public void TearDown(){
        driver.quit();
    }
}
