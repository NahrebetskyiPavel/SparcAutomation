package world.sparc.automation.ui.tests.runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.qameta.allure.selenide.AllureSelenide;

import java.net.URI;

public class Runner {

    protected RemoteWebDriver driver;
    protected boolean remote = false;
    ChromeOptions options = new ChromeOptions();
    DesiredCapabilities capabilities = new DesiredCapabilities();

    @BeforeClass
    public static void beforeClass() {
        new DriverSetup().optionsArguments();
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = "https://sparc.world";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @SneakyThrows
    @Before
    public void setUp() {
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("88.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        capabilities.setCapability("enableLog", true);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new RemoteWebDriver(URI.create("http://192.168.1.2:4444/wd/hub").toURL(),capabilities);

        com.codeborne.selenide.WebDriverRunner.setWebDriver(driver);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(1000*10);
        if (driver != null) { driver.quit(); }
    }
}
