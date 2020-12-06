package world.sparc.automation.ui.tests.runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import world.sparc.automation.helpers.data.User;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Runner {

    protected RemoteWebDriver driver;
    protected SoftAssert softAssert;
    protected boolean remote = false;
    ChromeOptions options = new ChromeOptions();
    protected User user;
    @BeforeSuite
    public void beforeSuite() {
        new DriverSetup().optionsArguments();
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = "https://sparc.world";
        user = new User();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(options);
        com.codeborne.selenide.WebDriverRunner.setWebDriver(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        Thread.sleep(1000*10);
        if (driver != null) { driver.quit(); }
    }
}
