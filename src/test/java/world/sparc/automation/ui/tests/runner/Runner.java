package world.sparc.automation.ui.tests.runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.qameta.allure.selenide.AllureSelenide;

public class Runner {

    protected RemoteWebDriver driver;
    protected boolean remote = false;
    ChromeOptions options = new ChromeOptions();
    @BeforeClass
    public static void beforeClass() {
        new DriverSetup().optionsArguments();
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = "https://sparc.world";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver(options);
        com.codeborne.selenide.WebDriverRunner.setWebDriver(driver);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(1000*10);
        if (driver != null) { driver.quit(); }
    }
}
